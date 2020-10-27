package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TeamController {
    @Autowired
    TeamService teamService;

    @PostMapping("/team")
    public Team divideTeam(){
        List<Team> list = teamService.divideTeam(Integer id);
        return ResponseEntity.ok(list);
    }
}
