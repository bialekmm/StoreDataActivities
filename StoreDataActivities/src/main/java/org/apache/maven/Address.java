
package org.apache.maven;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "geolocation",
        "city",
        "street",
        "number",
        "zipcode"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("geolocation")
    private Geolocation geolocation;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("geolocation")
    public Geolocation getGeolocation() {
        return geolocation;
    }

    @JsonProperty("geolocation")
    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
