
package com.example.charitydemoproject.bean.bean1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrganizerCampaign {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("organizer_id")
    @Expose
    private String organizerId;
    @SerializedName("priority_id")
    @Expose
    private String priorityId;
    @SerializedName("campaign_name")
    @Expose
    private String campaignName;
    @SerializedName("campaign_pic")
    @Expose
    private String campaignPic;
    @SerializedName("campaign_cover_pic")
    @Expose
    private String campaignCoverPic;
    @SerializedName("campaign_from_date")
    @Expose
    private String campaignFromDate;
    @SerializedName("campaign_to_date")
    @Expose
    private String campaignToDate;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("long_description")
    @Expose
    private String longDescription;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("is_sponsored")
    @Expose
    private String isSponsored;
    @SerializedName("is_default")
    @Expose
    private String isDefault;
    @SerializedName("is_active")
    @Expose
    private String isActive;
    @SerializedName("is_mission_need")
    @Expose
    private String isMissionNeed;
    @SerializedName("campaign_goal")
    @Expose
    private String campaignGoal;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public String getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(String priorityId) {
        this.priorityId = priorityId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignPic() {
        return campaignPic;
    }

    public void setCampaignPic(String campaignPic) {
        this.campaignPic = campaignPic;
    }

    public String getCampaignCoverPic() {
        return campaignCoverPic;
    }

    public void setCampaignCoverPic(String campaignCoverPic) {
        this.campaignCoverPic = campaignCoverPic;
    }

    public String getCampaignFromDate() {
        return campaignFromDate;
    }

    public void setCampaignFromDate(String campaignFromDate) {
        this.campaignFromDate = campaignFromDate;
    }

    public String getCampaignToDate() {
        return campaignToDate;
    }

    public void setCampaignToDate(String campaignToDate) {
        this.campaignToDate = campaignToDate;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(String isSponsored) {
        this.isSponsored = isSponsored;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsMissionNeed() {
        return isMissionNeed;
    }

    public void setIsMissionNeed(String isMissionNeed) {
        this.isMissionNeed = isMissionNeed;
    }

    public String getCampaignGoal() {
        return campaignGoal;
    }

    public void setCampaignGoal(String campaignGoal) {
        this.campaignGoal = campaignGoal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

}
