package com.example.charitydemoproject.backend;

import com.example.charitydemoproject.bean.bean1.CharityInfo;
import com.example.charitydemoproject.bean.bean2.ProductInfo;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public interface APiInterface {
    @POST("get_campaign_profile/")
    Call<CharityInfo> charityResponse(@Header("Token") String token, @Body HashMap body);

    @POST("campaign_products/")
    Call<ProductInfo> topNeed(@Header("Token") String token, @Body HashMap body);
}


