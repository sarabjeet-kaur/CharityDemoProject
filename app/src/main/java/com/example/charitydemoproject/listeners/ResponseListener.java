package com.example.charitydemoproject.listeners;

import com.example.charitydemoproject.bean.bean2.TopNeed;

import java.util.List;

/**
 * Created by sarabjjeet on 9/19/17.
 */

public interface ResponseListener {

    void onSuccess(String pic,String follower,String supporters);
    void onAdapter(List<TopNeed> list);
    void onError();
}
