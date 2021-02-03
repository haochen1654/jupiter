package com.laioffer.job.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    @JsonProperty("id") private String id;
    @JsonProperty("title") private String title;
    @JsonProperty("location") private String location;
    @JsonProperty("company_logo") private String companyLogo;
    @JsonProperty("url") private String url;
    @JsonProperty("description") private String description;
    private Set<String> keywords;
    private boolean favorite;
}
