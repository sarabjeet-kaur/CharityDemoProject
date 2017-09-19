package com.example.charitydemoproject.request;

import android.util.Log;

import com.example.charitydemoproject.backend.APIClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.charitydemoproject.utility.AppConstants.ID;
import static com.example.charitydemoproject.utility.AppConstants.TOKEN;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public class CharityResponse {

    public void charityResponse(){
        APIClient.getApiService().charityResponse(TOKEN,ID).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.e("on sucess","");

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e("on","failure");

            }
        });
    }
}
