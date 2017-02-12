package com.example.controllers;

import com.example.entity.*;
import com.example.services.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FootballController {

    @Autowired
    private FootballService footballService;

    /*      Working      */
    @RequestMapping(value = "/getAllClubs", method = RequestMethod.GET)
    public List<Club> getAllClubs() {
        return footballService.getAllClubs();
    }

    /*      Working      */
    @RequestMapping(value = "/deleteClub/{id}", method = RequestMethod.DELETE)
    public void deleteClub(@PathVariable Long id) {
        footballService.deleteClub(id);
    }

    /*      Working      */
    @RequestMapping(value = "/addClub", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addClub(@RequestBody Club club) {
        footballService.addClub(club);
    }

    /*      Working      */
    @RequestMapping(value = "/getAllFootballers", method = RequestMethod.GET)
    public List<Footballer> getAllFootballers() {
        return footballService.getAllFootballers();
    }

    /*      Working      */
    @RequestMapping(value = "/deleteFootballer/{id}", method = RequestMethod.DELETE)
    public void deleteFootballer(@PathVariable Long id) {
        footballService.deleteFootballer(id);
    }

    /*      Working      */
    @RequestMapping(value = "/addFootballer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addClub(@RequestBody Footballer footballer) {
        footballService.addFootballer(footballer);
    }

    /*      Working      */
    @RequestMapping(value = "/showFootballerSkills/{id}", method = RequestMethod.GET)
    public Skill showFootballerSkills(@PathVariable Long id) {
        return footballService.showFootballerSkills(id);
    }

    /*      Working      */
    @RequestMapping(value = "/updateSkill", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateSkill(@RequestBody Skill skill) {
        footballService.updateSkill(skill);
    }

    /*      Working      */
    @RequestMapping(value = "/getAllCountry", method = RequestMethod.GET)
    public List<Country> getAllCountry() {
        return footballService.getAllCountry();
    }

    /*      Working      */
    @RequestMapping(value = "/getAllAcademy", method = RequestMethod.GET)
    public List<Academy> getAllAcademy() {
        return footballService.getAllAcademy();
    }

    /*      Working      */
    @RequestMapping(value = "/makeContract", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateSkill(@RequestBody Contract contract) {
        footballService.makeContract(contract);
    }

    /*      Working      */
    @RequestMapping(value = "/getAllManagers", method = RequestMethod.GET)
    public List<Manager> getAllManagers() {
        return footballService.getAllManagers();
    }

    /*      Working      */
    @RequestMapping(value = "/addNewManager", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addNewManager(@RequestBody Manager manager) {
        footballService.addNewManager(manager);
    }

}
