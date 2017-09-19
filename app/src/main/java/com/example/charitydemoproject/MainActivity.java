package com.example.charitydemoproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.charitydemoproject.adapter.CustomAdapter;
import com.example.charitydemoproject.adapter.Pager;
import com.example.charitydemoproject.bean.bean2.TopNeed;
import com.example.charitydemoproject.connectivity.CheckNetwork;
import com.example.charitydemoproject.fragments.About;
import com.example.charitydemoproject.fragments.Events;
import com.example.charitydemoproject.fragments.Social;
import com.example.charitydemoproject.fragments.Videos;
import com.example.charitydemoproject.listeners.ResponseListener;
import com.example.charitydemoproject.request.CharityResponse;

import java.util.List;

import static com.example.charitydemoproject.utility.AppConstants.list1;

public class MainActivity extends AppCompatActivity implements ResponseListener,View.OnClickListener {
private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView campaign_cover_pic,view_all;
    private TextView txt_supporters,txt_follower;
    private  ProgressDialog progressDialog;
    private RecyclerView top_need_recyeclerview;
    private  CustomAdapter customAdapter;

    String coverPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topNeed();

        initView();
        if (CheckNetwork.isNetworkAvailable(MainActivity.this)) {
            progressDialog.show();
            charityResponse();
            progressDialog.dismiss();
        }
        else
            CheckNetwork.showAlert(getString(R.string.connection_failure), MainActivity.this);
    }

    private void initView(){
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        campaign_cover_pic=(ImageView)findViewById(R.id.campaign_cover_pic);
        view_all=(ImageView)findViewById(R.id.view_all);
        view_all.setOnClickListener(this);
        txt_supporters=(TextView)findViewById(R.id.txt_supporters);
        txt_follower=(TextView)findViewById(R.id.txt_follower);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(ResourcesCompat.getColor(getResources(),R.color.colorGrey,null));
        tabLayout.setSelectedTabIndicatorHeight(0);
        progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("wait...");
        top_need_recyeclerview=(RecyclerView)findViewById(R.id.top_need_recyeclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        top_need_recyeclerview.setLayoutManager(layoutManager);
        customAdapter=new CustomAdapter(MainActivity.this, list1);
        top_need_recyeclerview.setAdapter(customAdapter);

    }
    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new About(), "About");
        adapter.addFragment(new Events(), "Events");
        adapter.addFragment(new Videos(), "Videos");
        adapter.addFragment(new Social(), "Social");
        viewPager.setAdapter(adapter);
    }
    private void charityResponse(){
        CharityResponse charityResponse=new CharityResponse();
        charityResponse.charityResponse(this);
    }
    private void topNeed(){
        CharityResponse charityResponse=new CharityResponse();
        charityResponse.topNeed(this);
    }

    @Override
    public void onSuccess(String pic, String follower, String supporters) {
        coverPic=pic;
        Glide.with(MainActivity.this).load(coverPic).skipMemoryCache(true).into(campaign_cover_pic);
        txt_supporters.setText(supporters);
        txt_follower.setText(follower);

    }
    @Override
    public void onAdapter(List<TopNeed> list) {
       list1.addAll(list);
       customAdapter.notifyDataSetChanged();

    }

    @Override
    public void onError() {

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,ListingActivity.class);
        intent.putExtra("coverpic",coverPic);
        startActivity(intent);

    }
}
