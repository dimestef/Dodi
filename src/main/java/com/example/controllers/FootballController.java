package com.example.controllers;

import com.example.entity.Club;
import com.example.entity.Footballer;
import com.example.entity.Skill;
import com.example.services.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FootballController {

    @Autowired
    private FootballService footballService;

    @RequestMapping(value = "/getAllClubs", method = RequestMethod.GET)
    public List<Club> getAllClubs() {
        return footballService.getAllClubs();
    }

    @RequestMapping(value = "/deleteClub/{id}", method = RequestMethod.DELETE)
    public void deleteClub(@PathVariable Long id) {
        footballService.deleteClub(id);
    }

    @RequestMapping(value = "/getAllFootballers", method = RequestMethod.GET)
    public List<Footballer> getAllFootballers() {
        return footballService.getAllFootballers();
    }

    @RequestMapping(value = "/deleteFootballer/{id}", method = RequestMethod.DELETE)
    public void deleteFootballer(@PathVariable Long id) {
        footballService.deleteFootballer(id);
    }

    @RequestMapping(value = "/showFootballerSkills/{id}", method = RequestMethod.GET)
    public Skill showFootballerSkills(@PathVariable Long id) {
        return footballService.showFootballerSkills(id);
    }


}
