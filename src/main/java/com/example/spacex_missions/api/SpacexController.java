package com.example.spacex_missions.api;

import com.example.spacex_missions.domain.Mission;
import com.example.spacex_missions.domain.MissionDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpacexController {

    MissionDao missionDao;

    public SpacexController(MissionDao missionDao) {
        this.missionDao = missionDao;
    }

    @GetMapping(path = "/mission/{mission_id}")
    ResponseEntity<String> findOneMission(@PathVariable(name = "mission_id") String id){
        String mission = missionDao.fetchMission().toString();
        return ResponseEntity.ok(mission+ " " + id);
    }
}
