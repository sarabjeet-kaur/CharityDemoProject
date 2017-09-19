package com.example.charitydemoproject.backend;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public interface APiInterface {
    @POST("get_column_info/")
    Call<ResponseBody> charityResponse(@Header("Token") String token, @Body String organizer_campaign_id);
}
