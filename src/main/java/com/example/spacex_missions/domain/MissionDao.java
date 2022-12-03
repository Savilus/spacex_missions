package com.example.spacex_missions.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MissionDao {

    RestTemplate restTemplate;

    public Mission fetchMission(){
        return  restTemplate.getForObject("https://api.spacexdata.com/v3/missions/F4F83DE" , Mission.class);
    }
}
