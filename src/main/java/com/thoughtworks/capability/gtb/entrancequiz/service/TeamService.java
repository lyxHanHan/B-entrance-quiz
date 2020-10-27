package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

public class TeamService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeamRepository teamRepository;
    public void divideTeam(Integer id) {
        final List<Student> list = new LinkedList<>();
        Iterable<Student> all = studentRepository.findAll();
        if(all.size % 6 == 0) {
            int number = all.size/6;
            List<Team1> = studentRepository.findById(0-(number-1));
        }

    }

}

