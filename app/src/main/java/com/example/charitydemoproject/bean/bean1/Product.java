
package com.example.charitydemoproject.bean.bean1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("asin_code")
    @Expose
    private String asinCode;
    @SerializedName("product_label")
    @Expose
    private String productLabel;
    @SerializedName("product_title")
    @Expose
    private String productTitle;
    @SerializedName("product_url")
    @Expose
    private String productUrl;
    @SerializedName("product_description")
    @Expose
    private String productDescription;
    @SerializedName("promotional_text")
    @Expose
    private String promotionalText;
    @SerializedName("product_small_image")
    @Expose
    private String productSmallImage;
    @SerializedName("product_medium_image")
    @Expose
    private String productMediumImage;
    @SerializedName("product_large_image")
    @Expose
    private String productLargeImage;
    @SerializedName("display_price")
    @Expose
    private String displayPrice;
    @SerializedName("store_price")
    @Expose
    private String storePrice;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("ean")
    @Expose
    private String ean;
    @SerializedName("model_mpn")
    @Expose
    private String modelMpn;
    @SerializedName("manufacturer")
    @Expose
    private String manufacturer;
    @SerializedName("package_quantity")
    @Expose
    private String packageQuantity;
    @SerializedName("product_group")
    @Expose
    private String productGroup;
    @SerializedName("product_type_name")
    @Expose
    private String productTypeName;
    @SerializedName("product_images")
    @Expose
    private String productImages;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_prime")
    @Expose
    private String isPrime;
    @SerializedName("super_saving")
    @Expose
    private String superSaving;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("CampaignProduct")
    @Expose
    private CampaignProduct_ campaignProduct;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsinCode() {
        return asinCode;
    }

    public void setAsinCode(String asinCode) {
        this.asinCode = asinCode;
    }

    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getPromotionalText() {
        return promotionalText;
    }

    public void setPromotionalText(String promotionalText) {
        this.promotionalText = promotionalText;
    }

    public String getProductSmallImage() {
        return productSmallImage;
    }

    public void setProductSmallImage(String productSmallImage) {
        this.productSmallImage = productSmallImage;
    }

    public String getProductMediumImage() {
        return productMediumImage;
    }

    public void setProductMediumImage(String productMediumImage) {
        this.productMediumImage = productMediumImage;
    }

    public String getProductLargeImage() {
        return productLargeImage;
    }

    public void setProductLargeImage(String productLargeImage) {
        this.productLargeImage = productLargeImage;
    }

    public String getDisplayPrice() {
        return displayPrice;
    }

    public void setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
    }

    public String getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(String storePrice) {
        this.storePrice = storePrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getModelMpn() {
        return modelMpn;
    }

    public void setModelMpn(String modelMpn) {
        this.modelMpn = modelMpn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(String packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsPrime() {
        return isPrime;
    }

    public void setIsPrime(String isPrime) {
        this.isPrime = isPrime;
    }

    public String getSuperSaving() {
        return superSaving;
    }

    public void setSuperSaving(String superSaving) {
        this.superSaving = superSaving;
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

    public CampaignProduct_ getCampaignProduct() {
        return campaignProduct;
    }

    public void setCampaignProduct(CampaignProduct_ campaignProduct) {
        this.campaignProduct = campaignProduct;
    }

}
