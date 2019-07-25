
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
    "vatReturn",
    "vatMonthlyPayment",
    "ecl",
    "intrastatAcquisitions",
    "intrastatDispatches"
})

@ToString
public class FilingFrequencies {

    @JsonProperty("vatReturn")
    private Integer vatReturn;
    @JsonProperty("vatMonthlyPayment")
    private Object vatMonthlyPayment;
    @JsonProperty("ecl")
    private Integer ecl;
    @JsonProperty("intrastatAcquisitions")
    private Integer intrastatAcquisitions;
    @JsonProperty("intrastatDispatches")
    private Integer intrastatDispatches;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vatReturn")
    public Integer getVatReturn() {
        return vatReturn;
    }

    @JsonProperty("vatReturn")
    public void setVatReturn(Integer vatReturn) {
        this.vatReturn = vatReturn;
    }

    @JsonProperty("vatMonthlyPayment")
    public Object getVatMonthlyPayment() {
        return vatMonthlyPayment;
    }

    @JsonProperty("vatMonthlyPayment")
    public void setVatMonthlyPayment(Object vatMonthlyPayment) {
        this.vatMonthlyPayment = vatMonthlyPayment;
    }

    @JsonProperty("ecl")
    public Integer getEcl() {
        return ecl;
    }

    @JsonProperty("ecl")
    public void setEcl(Integer ecl) {
        this.ecl = ecl;
    }

    @JsonProperty("intrastatAcquisitions")
    public Integer getIntrastatAcquisitions() {
        return intrastatAcquisitions;
    }

    @JsonProperty("intrastatAcquisitions")
    public void setIntrastatAcquisitions(Integer intrastatAcquisitions) {
        this.intrastatAcquisitions = intrastatAcquisitions;
    }

    @JsonProperty("intrastatDispatches")
    public Integer getIntrastatDispatches() {
        return intrastatDispatches;
    }

    @JsonProperty("intrastatDispatches")
    public void setIntrastatDispatches(Integer intrastatDispatches) {
        this.intrastatDispatches = intrastatDispatches;
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
