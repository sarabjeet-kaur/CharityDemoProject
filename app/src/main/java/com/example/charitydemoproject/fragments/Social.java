package com.example.charitydemoproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.charitydemoproject.R;

/**
 * Created by sarabjjeet on 9/15/17.
 */

public class Social extends Fragment {
    public Social() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.social_fragmnet_layout, container, false);
        return view;
    }
}
