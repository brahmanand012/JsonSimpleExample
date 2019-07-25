
package com.example;

import java.util.HashMap;
import java.util.List;
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
    "jurisdiction",
    "vatNumber",
    "registrationDate",
    "visaRegistrationDate",
    "staggerGroup",
    "filingFrequencies",
    "taxOfficeDetails",
    "activityCode",
    "periodStart",
    "periodEnd",
    "isIntrastatDThresholdReached",
    "isIntrastatAThresholdReached",
    "isECLThresholdReached",
    "isVISACountries",
    "paymentInfoID",
    "importRegime",
    "authorisedTaxOffice",
    "taxOfficeCode",
    "eclRegistrationId",
    "eclTransmissionId",
    "taxId",
    "login",
    "taxOffice",
    "eclBranchNumber"
})

@ToString
public class JurisdictionDatum {

    @JsonProperty("jurisdiction")
    private String jurisdiction;
    @JsonProperty("vatNumber")
    private String vatNumber;
    @JsonProperty("registrationDate")
    private String registrationDate;
    @JsonProperty("visaRegistrationDate")
    private String visaRegistrationDate;
    @JsonProperty("staggerGroup")
    private Object staggerGroup;
    @JsonProperty("filingFrequencies")
    private FilingFrequencies filingFrequencies;
    @JsonProperty("taxOfficeDetails")
    private TaxOfficeDetails taxOfficeDetails;
    @JsonProperty("activityCode")
    private String activityCode;
    @JsonProperty("periodStart")
    private String periodStart;
    @JsonProperty("periodEnd")
    private String periodEnd;
    @JsonProperty("isIntrastatDThresholdReached")
    private Boolean isIntrastatDThresholdReached;
    @JsonProperty("isIntrastatAThresholdReached")
    private Boolean isIntrastatAThresholdReached;
    @JsonProperty("isECLThresholdReached")
    private Boolean isECLThresholdReached;
    @JsonProperty("isVISACountries")
    private Boolean isVISACountries;
    @JsonProperty("paymentInfoID")
    private Integer paymentInfoID;
    @JsonProperty("importRegime")
    private List<String> importRegime = null;
    @JsonProperty("authorisedTaxOffice")
    private String authorisedTaxOffice;
    @JsonProperty("taxOfficeCode")
    private String taxOfficeCode;
    @JsonProperty("eclRegistrationId")
    private String eclRegistrationId;
    @JsonProperty("eclTransmissionId")
    private String eclTransmissionId;
    @JsonProperty("taxId")
    private String taxId;
    @JsonProperty("login")
    private Login login;
    @JsonProperty("taxOffice")
    private TaxOffice taxOffice;
    @JsonProperty("eclBranchNumber")
    private String eclBranchNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jurisdiction")
    public String getJurisdiction() {
        return jurisdiction;
    }

    @JsonProperty("jurisdiction")
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @JsonProperty("vatNumber")
    public String getVatNumber() {
        return vatNumber;
    }

    @JsonProperty("vatNumber")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @JsonProperty("registrationDate")
    public String getRegistrationDate() {
        return registrationDate;
    }

    @JsonProperty("registrationDate")
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @JsonProperty("visaRegistrationDate")
    public String getVisaRegistrationDate() {
        return visaRegistrationDate;
    }

    @JsonProperty("visaRegistrationDate")
    public void setVisaRegistrationDate(String visaRegistrationDate) {
        this.visaRegistrationDate = visaRegistrationDate;
    }

    @JsonProperty("staggerGroup")
    public Object getStaggerGroup() {
        return staggerGroup;
    }

    @JsonProperty("staggerGroup")
    public void setStaggerGroup(Object staggerGroup) {
        this.staggerGroup = staggerGroup;
    }

    @JsonProperty("filingFrequencies")
    public FilingFrequencies getFilingFrequencies() {
        return filingFrequencies;
    }

    @JsonProperty("filingFrequencies")
    public void setFilingFrequencies(FilingFrequencies filingFrequencies) {
        this.filingFrequencies = filingFrequencies;
    }

    @JsonProperty("taxOfficeDetails")
    public TaxOfficeDetails getTaxOfficeDetails() {
        return taxOfficeDetails;
    }

    @JsonProperty("taxOfficeDetails")
    public void setTaxOfficeDetails(TaxOfficeDetails taxOfficeDetails) {
        this.taxOfficeDetails = taxOfficeDetails;
    }

    @JsonProperty("activityCode")
    public String getActivityCode() {
        return activityCode;
    }

    @JsonProperty("activityCode")
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    @JsonProperty("periodStart")
    public String getPeriodStart() {
        return periodStart;
    }

    @JsonProperty("periodStart")
    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    @JsonProperty("periodEnd")
    public String getPeriodEnd() {
        return periodEnd;
    }

    @JsonProperty("periodEnd")
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    @JsonProperty("isIntrastatDThresholdReached")
    public Boolean getIsIntrastatDThresholdReached() {
        return isIntrastatDThresholdReached;
    }

    @JsonProperty("isIntrastatDThresholdReached")
    public void setIsIntrastatDThresholdReached(Boolean isIntrastatDThresholdReached) {
        this.isIntrastatDThresholdReached = isIntrastatDThresholdReached;
    }

    @JsonProperty("isIntrastatAThresholdReached")
    public Boolean getIsIntrastatAThresholdReached() {
        return isIntrastatAThresholdReached;
    }

    @JsonProperty("isIntrastatAThresholdReached")
    public void setIsIntrastatAThresholdReached(Boolean isIntrastatAThresholdReached) {
        this.isIntrastatAThresholdReached = isIntrastatAThresholdReached;
    }

    @JsonProperty("isECLThresholdReached")
    public Boolean getIsECLThresholdReached() {
        return isECLThresholdReached;
    }

    @JsonProperty("isECLThresholdReached")
    public void setIsECLThresholdReached(Boolean isECLThresholdReached) {
        this.isECLThresholdReached = isECLThresholdReached;
    }

    @JsonProperty("isVISACountries")
    public Boolean getIsVISACountries() {
        return isVISACountries;
    }

    @JsonProperty("isVISACountries")
    public void setIsVISACountries(Boolean isVISACountries) {
        this.isVISACountries = isVISACountries;
    }

    @JsonProperty("paymentInfoID")
    public Integer getPaymentInfoID() {
        return paymentInfoID;
    }

    @JsonProperty("paymentInfoID")
    public void setPaymentInfoID(Integer paymentInfoID) {
        this.paymentInfoID = paymentInfoID;
    }

    @JsonProperty("importRegime")
    public List<String> getImportRegime() {
        return importRegime;
    }

    @JsonProperty("importRegime")
    public void setImportRegime(List<String> importRegime) {
        this.importRegime = importRegime;
    }

    @JsonProperty("authorisedTaxOffice")
    public String getAuthorisedTaxOffice() {
        return authorisedTaxOffice;
    }

    @JsonProperty("authorisedTaxOffice")
    public void setAuthorisedTaxOffice(String authorisedTaxOffice) {
        this.authorisedTaxOffice = authorisedTaxOffice;
    }

    @JsonProperty("taxOfficeCode")
    public String getTaxOfficeCode() {
        return taxOfficeCode;
    }

    @JsonProperty("taxOfficeCode")
    public void setTaxOfficeCode(String taxOfficeCode) {
        this.taxOfficeCode = taxOfficeCode;
    }

    @JsonProperty("eclRegistrationId")
    public String getEclRegistrationId() {
        return eclRegistrationId;
    }

    @JsonProperty("eclRegistrationId")
    public void setEclRegistrationId(String eclRegistrationId) {
        this.eclRegistrationId = eclRegistrationId;
    }

    @JsonProperty("eclTransmissionId")
    public String getEclTransmissionId() {
        return eclTransmissionId;
    }

    @JsonProperty("eclTransmissionId")
    public void setEclTransmissionId(String eclTransmissionId) {
        this.eclTransmissionId = eclTransmissionId;
    }

    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @JsonProperty("login")
    public Login getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(Login login) {
        this.login = login;
    }

    @JsonProperty("taxOffice")
    public TaxOffice getTaxOffice() {
        return taxOffice;
    }

    @JsonProperty("taxOffice")
    public void setTaxOffice(TaxOffice taxOffice) {
        this.taxOffice = taxOffice;
    }

    @JsonProperty("eclBranchNumber")
    public String getEclBranchNumber() {
        return eclBranchNumber;
    }

    @JsonProperty("eclBranchNumber")
    public void setEclBranchNumber(String eclBranchNumber) {
        this.eclBranchNumber = eclBranchNumber;
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
