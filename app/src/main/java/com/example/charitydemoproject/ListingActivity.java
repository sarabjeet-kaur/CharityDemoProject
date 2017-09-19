package com.example.charitydemoproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.charitydemoproject.adapter.CustomAdapter;

import static com.example.charitydemoproject.utility.AppConstants.list1;

public class ListingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ImageView cover_pic;
    String coverPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        coverPic = getIntent().getStringExtra("coverpic");
        cover_pic = (ImageView) findViewById(R.id.cover_pic);
        Glide.with(ListingActivity.this).load(coverPic).skipMemoryCache(true).into(cover_pic);

        LinearLayoutManager layoutManager = new LinearLayoutManager(ListingActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CustomAdapter(ListingActivity.this, list1);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
