
package com.example.charitydemoproject.bean.bean1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrganizerEvent {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("organizer_id")
    @Expose
    private String organizerId;
    @SerializedName("priority_id")
    @Expose
    private String priorityId;
    @SerializedName("event_name")
    @Expose
    private String eventName;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("long_description")
    @Expose
    private String longDescription;
    @SerializedName("is_sponsored")
    @Expose
    private String isSponsored;
    @SerializedName("event_pic")
    @Expose
    private String eventPic;
    @SerializedName("event_cover_pic")
    @Expose
    private String eventCoverPic;
    @SerializedName("event_from_date")
    @Expose
    private String eventFromDate;
    @SerializedName("event_to_date")
    @Expose
    private String eventToDate;
    @SerializedName("location")
    @Expose
    private String location;
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

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    public String getIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(String isSponsored) {
        this.isSponsored = isSponsored;
    }

    public String getEventPic() {
        return eventPic;
    }

    public void setEventPic(String eventPic) {
        this.eventPic = eventPic;
    }

    public String getEventCoverPic() {
        return eventCoverPic;
    }

    public void setEventCoverPic(String eventCoverPic) {
        this.eventCoverPic = eventCoverPic;
    }

    public String getEventFromDate() {
        return eventFromDate;
    }

    public void setEventFromDate(String eventFromDate) {
        this.eventFromDate = eventFromDate;
    }

    public String getEventToDate() {
        return eventToDate;
    }

    public void setEventToDate(String eventToDate) {
        this.eventToDate = eventToDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
