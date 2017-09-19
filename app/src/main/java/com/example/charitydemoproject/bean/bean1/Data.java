
package com.example.charitydemoproject.bean.bean1;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("OrganizerCampaign")
    @Expose
    private OrganizerCampaign organizerCampaign;
    @SerializedName("Organizer")
    @Expose
    private Organizer organizer;
    @SerializedName("CampaignProduct")
    @Expose
    private List<CampaignProduct> campaignProduct = null;
    @SerializedName("User")
    @Expose
    private User user;
    @SerializedName("Follower")
    @Expose
    private Follower follower;
    @SerializedName("Supporters")
    @Expose
    private Supporters supporters;

    public OrganizerCampaign getOrganizerCampaign() {
        return organizerCampaign;
    }

    public void setOrganizerCampaign(OrganizerCampaign organizerCampaign) {
        this.organizerCampaign = organizerCampaign;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public List<CampaignProduct> getCampaignProduct() {
        return campaignProduct;
    }

    public void setCampaignProduct(List<CampaignProduct> campaignProduct) {
        this.campaignProduct = campaignProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Follower getFollower() {
        return follower;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public Supporters getSupporters() {
        return supporters;
    }

    public void setSupporters(Supporters supporters) {
        this.supporters = supporters;
    }

}
