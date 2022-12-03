package com.example.spacex_missions.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpacexController {


    @GetMapping(path = "/mission/{mission_id}")
    ResponseEntity<String> findOneMission(@PathVariable(name = "mission_id") String id){
       return ResponseEntity.ok("Hello spacex " + id);
    }
}
