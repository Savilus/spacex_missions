package com.example.spacex_missions.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MissionDao {

    RestTemplate restTemplate;

    public MissionDao(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Mission fetchMission(){
        return  restTemplate.getForObject("/missions/F4F83DE" , Mission.class);
    }
}
