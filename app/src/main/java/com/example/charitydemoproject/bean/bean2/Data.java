
package com.example.charitydemoproject.bean.bean2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("category_list")
    @Expose
    private List<List<CategoryList>> categoryList = null;
    @SerializedName("top_needs")
    @Expose
    private List<TopNeed> topNeeds = null;

    public List<List<CategoryList>> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<List<CategoryList>> categoryList) {
        this.categoryList = categoryList;
    }

    public List<TopNeed> getTopNeeds() {
        return topNeeds;
    }

    public void setTopNeeds(List<TopNeed> topNeeds) {
        this.topNeeds = topNeeds;
    }

}
