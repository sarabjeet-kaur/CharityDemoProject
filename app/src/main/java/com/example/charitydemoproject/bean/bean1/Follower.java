
package com.example.charitydemoproject.bean.bean1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Follower {

    @SerializedName("count")
    @Expose
    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}
