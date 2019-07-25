
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
    "jurisdictionData"
})

@ToString
public class JurisdictionISOCode {

    @JsonProperty("jurisdictionData")
    private List<JurisdictionDatum> jurisdictionData = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jurisdictionData")
    public List<JurisdictionDatum> getJurisdictionData() {
        return jurisdictionData;
    }

    @JsonProperty("jurisdictionData")
    public void setJurisdictionData(List<JurisdictionDatum> jurisdictionData) {
        this.jurisdictionData = jurisdictionData;
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
