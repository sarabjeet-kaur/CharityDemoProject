package com.example.charitydemoproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.charitydemoproject.R;
import com.example.charitydemoproject.bean.bean2.TopNeed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    Context context;
    List<TopNeed> list=new ArrayList<>();

    public CustomAdapter(Context context, List<TopNeed> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_needs_layout, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).getProduct().getProductSmallImage()).skipMemoryCache(true).into(holder.product_image);
        holder.product_name.setText(list.get(position).getProduct().getProductLabel());
        holder.product_cost.setText(list.get(position).getProduct().getDisplayPrice()+" "+list.get(position).getProduct().getCurrencyCode());
        holder.product_unit.setText("Unit:"+list.get(position).getProduct().getPackageQuantity());
    }

    @Override
    public int getItemCount() {
        return (null != list ? list.size() : 0);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView product_image;
        TextView product_name,product_cost,product_unit;

        public CustomViewHolder(View view) {
            super(view);
            this.product_image = (ImageView) view.findViewById(R.id.product_image);
            this.product_name = (TextView) view.findViewById(R.id.product_name);
            this.product_cost = (TextView) view.findViewById(R.id.product_cost);
            this.product_unit = (TextView) view.findViewById(R.id.product_unit);


        }
    }
}
