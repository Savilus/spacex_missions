package com.example.spacex_missions.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Mission {

    @JsonProperty(value = "mission_name")
    String name;
    @JsonProperty(value = "wikipedia")
    String wikipediaURL;
    String description;
}
