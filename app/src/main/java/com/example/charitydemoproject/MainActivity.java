package com.example.charitydemoproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.charitydemoproject.adapter.Pager;
import com.example.charitydemoproject.connectivity.CheckNetwork;
import com.example.charitydemoproject.fragments.About;
import com.example.charitydemoproject.fragments.Events;
import com.example.charitydemoproject.fragments.Social;
import com.example.charitydemoproject.fragments.Videos;
import com.example.charitydemoproject.request.CharityResponse;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        if (CheckNetwork.isNetworkAvailable(MainActivity.this))
            charityResponse();
        else
            CheckNetwork.showAlert(getString(R.string.connection_failure), MainActivity.this);
    }

    private void initView(){
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(ResourcesCompat.getColor(getResources(),R.color.colorGrey,null));
        tabLayout.setSelectedTabIndicatorHeight(0);



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
        charityResponse.charityResponse();
    }
}
