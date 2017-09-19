
package com.example.charitydemoproject.bean.bean1;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organizer {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("registration_account_type")
    @Expose
    private String registrationAccountType;
    @SerializedName("organizer_type")
    @Expose
    private String organizerType;
    @SerializedName("organization_name")
    @Expose
    private String organizationName;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("organizer_ein")
    @Expose
    private String organizerEin;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("organizer_phone")
    @Expose
    private String organizerPhone;
    @SerializedName("organization_profile_pic")
    @Expose
    private String organizationProfilePic;
    @SerializedName("organization_cover_pic")
    @Expose
    private String organizationCoverPic;
    @SerializedName("account_status")
    @Expose
    private String accountStatus;
    @SerializedName("verification_key")
    @Expose
    private String verificationKey;
    @SerializedName("verification_expiry_time")
    @Expose
    private String verificationExpiryTime;
    @SerializedName("password_verification_key")
    @Expose
    private String passwordVerificationKey;
    @SerializedName("password_verification_expiry_time")
    @Expose
    private String passwordVerificationExpiryTime;
    @SerializedName("is_active")
    @Expose
    private String isActive;
    @SerializedName("is_form_verified")
    @Expose
    private String isFormVerified;
    @SerializedName("is_license_verified")
    @Expose
    private String isLicenseVerified;
    @SerializedName("is_contact_verified")
    @Expose
    private String isContactVerified;
    @SerializedName("strip_customer_obj")
    @Expose
    private String stripCustomerObj;
    @SerializedName("stripe_card")
    @Expose
    private String stripeCard;
    @SerializedName("facebook_url")
    @Expose
    private String facebookUrl;
    @SerializedName("twitter_url")
    @Expose
    private String twitterUrl;
    @SerializedName("instagram_url")
    @Expose
    private String instagramUrl;
    @SerializedName("widget_code")
    @Expose
    private String widgetCode;
    @SerializedName("widget_url")
    @Expose
    private String widgetUrl;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("OrganizerProfile")
    @Expose
    private OrganizerProfile organizerProfile;
    @SerializedName("OrganizerEvent")
    @Expose
    private List<OrganizerEvent> organizerEvent = null;
    @SerializedName("OrganizerCampaign")
    @Expose
    private List<OrganizerCampaign_> organizerCampaign = null;
    @SerializedName("DisasterCampaign")
    @Expose
    private List<Object> disasterCampaign = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistrationAccountType() {
        return registrationAccountType;
    }

    public void setRegistrationAccountType(String registrationAccountType) {
        this.registrationAccountType = registrationAccountType;
    }

    public String getOrganizerType() {
        return organizerType;
    }

    public void setOrganizerType(String organizerType) {
        this.organizerType = organizerType;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrganizerEin() {
        return organizerEin;
    }

    public void setOrganizerEin(String organizerEin) {
        this.organizerEin = organizerEin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrganizerPhone() {
        return organizerPhone;
    }

    public void setOrganizerPhone(String organizerPhone) {
        this.organizerPhone = organizerPhone;
    }

    public String getOrganizationProfilePic() {
        return organizationProfilePic;
    }

    public void setOrganizationProfilePic(String organizationProfilePic) {
        this.organizationProfilePic = organizationProfilePic;
    }

    public String getOrganizationCoverPic() {
        return organizationCoverPic;
    }

    public void setOrganizationCoverPic(String organizationCoverPic) {
        this.organizationCoverPic = organizationCoverPic;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getVerificationKey() {
        return verificationKey;
    }

    public void setVerificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
    }

    public String getVerificationExpiryTime() {
        return verificationExpiryTime;
    }

    public void setVerificationExpiryTime(String verificationExpiryTime) {
        this.verificationExpiryTime = verificationExpiryTime;
    }

    public String getPasswordVerificationKey() {
        return passwordVerificationKey;
    }

    public void setPasswordVerificationKey(String passwordVerificationKey) {
        this.passwordVerificationKey = passwordVerificationKey;
    }

    public String getPasswordVerificationExpiryTime() {
        return passwordVerificationExpiryTime;
    }

    public void setPasswordVerificationExpiryTime(String passwordVerificationExpiryTime) {
        this.passwordVerificationExpiryTime = passwordVerificationExpiryTime;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsFormVerified() {
        return isFormVerified;
    }

    public void setIsFormVerified(String isFormVerified) {
        this.isFormVerified = isFormVerified;
    }

    public String getIsLicenseVerified() {
        return isLicenseVerified;
    }

    public void setIsLicenseVerified(String isLicenseVerified) {
        this.isLicenseVerified = isLicenseVerified;
    }

    public String getIsContactVerified() {
        return isContactVerified;
    }

    public void setIsContactVerified(String isContactVerified) {
        this.isContactVerified = isContactVerified;
    }

    public String getStripCustomerObj() {
        return stripCustomerObj;
    }

    public void setStripCustomerObj(String stripCustomerObj) {
        this.stripCustomerObj = stripCustomerObj;
    }

    public String getStripeCard() {
        return stripeCard;
    }

    public void setStripeCard(String stripeCard) {
        this.stripeCard = stripeCard;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getWidgetCode() {
        return widgetCode;
    }

    public void setWidgetCode(String widgetCode) {
        this.widgetCode = widgetCode;
    }

    public String getWidgetUrl() {
        return widgetUrl;
    }

    public void setWidgetUrl(String widgetUrl) {
        this.widgetUrl = widgetUrl;
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

    public OrganizerProfile getOrganizerProfile() {
        return organizerProfile;
    }

    public void setOrganizerProfile(OrganizerProfile organizerProfile) {
        this.organizerProfile = organizerProfile;
    }

    public List<OrganizerEvent> getOrganizerEvent() {
        return organizerEvent;
    }

    public void setOrganizerEvent(List<OrganizerEvent> organizerEvent) {
        this.organizerEvent = organizerEvent;
    }

    public List<OrganizerCampaign_> getOrganizerCampaign() {
        return organizerCampaign;
    }

    public void setOrganizerCampaign(List<OrganizerCampaign_> organizerCampaign) {
        this.organizerCampaign = organizerCampaign;
    }

    public List<Object> getDisasterCampaign() {
        return disasterCampaign;
    }

    public void setDisasterCampaign(List<Object> disasterCampaign) {
        this.disasterCampaign = disasterCampaign;
    }

}
