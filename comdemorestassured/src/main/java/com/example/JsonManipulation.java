
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "contact",
    "businessType",
    "registrations",
    "createdDate",
    "isTestSeller",
    "amazonSellerId",
    "amazonSellerKey"
})

@ToString
public class JsonManipulation {

    @JsonProperty("name")
    private String name;
    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("registrations")
    private Registrations registrations;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("isTestSeller")
    private Boolean isTestSeller;
    @JsonProperty("amazonSellerId")
    private String amazonSellerId;
    @JsonProperty("amazonSellerKey")
    private String amazonSellerKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @JsonProperty("businessType")
    public String getBusinessType() {
        return businessType;
    }

    @JsonProperty("businessType")
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @JsonProperty("registrations")
    public Registrations getRegistrations() {
        return registrations;
    }

    @JsonProperty("registrations")
    public void setRegistrations(Registrations registrations) {
        this.registrations = registrations;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("isTestSeller")
    public Boolean getIsTestSeller() {
        return isTestSeller;
    }

    @JsonProperty("isTestSeller")
    public void setIsTestSeller(Boolean isTestSeller) {
        this.isTestSeller = isTestSeller;
    }

    @JsonProperty("amazonSellerId")
    public String getAmazonSellerId() {
        return amazonSellerId;
    }

    @JsonProperty("amazonSellerId")
    public void setAmazonSellerId(String amazonSellerId) {
        this.amazonSellerId = amazonSellerId;
    }

    @JsonProperty("amazonSellerKey")
    public String getAmazonSellerKey() {
        return amazonSellerKey;
    }

    @JsonProperty("amazonSellerKey")
    public void setAmazonSellerKey(String amazonSellerKey) {
        this.amazonSellerKey = amazonSellerKey;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
