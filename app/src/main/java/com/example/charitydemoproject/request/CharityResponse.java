package com.example.charitydemoproject.request;

import android.util.Log;

import com.example.charitydemoproject.backend.APIClient;
import com.example.charitydemoproject.bean.bean1.CharityInfo;
import com.example.charitydemoproject.bean.bean2.ProductInfo;
import com.example.charitydemoproject.bean.bean2.TopNeed;
import com.example.charitydemoproject.listeners.ResponseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.charitydemoproject.utility.AppConstants.TOKEN;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public class CharityResponse {
    HashMap<String,String> body=new HashMap<>();


    public void charityResponse(final ResponseListener listener){

        body.put("organizer_campaign_id","35");
        APIClient.getApiService().charityResponse(TOKEN,body).enqueue(new Callback<CharityInfo>() {
            @Override
            public void onResponse(Call<CharityInfo> call, Response<CharityInfo> response) {

                if(response!=null && response.body()!=null){
                    if(response.body().getStatus().equals("success") && response.body().getMessage().equals("Campaign Info")){
                        listener.onSuccess(response.body().getData().getOrganizerCampaign().getCampaignCoverPic(),
                                response.body().getData().getFollower().getCount(),
                                response.body().getData().getSupporters().getCount());
                    }
                }
                Log.e("pic",response.body().getData().getOrganizerCampaign().getCampaignCoverPic());
                Log.e("supporters",response.body().getData().getSupporters().getCount());
                Log.e("followers",response.body().getData().getFollower().getCount());
                Log.e("on sucess","");


            }



            @Override
            public void onFailure(Call<CharityInfo> call, Throwable t) {
                Log.e("on","failure");

            }
        });
    }

    public void topNeed(final ResponseListener listener){
        body.put("organizer_campaign_id","35");
        APIClient.getApiService().topNeed(TOKEN,body).enqueue(new Callback<ProductInfo>() {
            @Override
            public void onResponse(Call<ProductInfo> call, Response<ProductInfo> response) {
                List<TopNeed> list=new ArrayList();
                if(response!=null && response.body()!=null){
                    if(response.body().getStatus().equals("success") && response.body().getMessage().equals("Organizer List")){
                      list=response.body().getData().getTopNeeds();
                        listener.onAdapter(list);
                    }
                    for(int i=0;i<list.size();i++){
                        Log.e("label",response.body().getData().getTopNeeds().get(i).getProduct().getProductLabel());
                    }
                }


            }

            @Override
            public void onFailure(Call<ProductInfo> call, Throwable t) {

            }
        });

    }
}
