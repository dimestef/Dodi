package com.example.services;

import com.example.entity.*;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballService {

    @Autowired
    private AcademyRepository academyRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private FootballerRepository footballerRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private SkillRepository skillRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public void deleteClub(Long clubId) {
        List<Contract> contractsToDelete = contractRepository.findByClubId(clubId);
        contractRepository.delete(contractsToDelete);

        List<Manager> managersToDelete = managerRepository.findByClubId(clubId);
        managerRepository.delete(managersToDelete);

        clubRepository.delete(clubId);
    }

    public void addClub(Club club) {
        clubRepository.save(club);
    }



    public List<Footballer> getAllFootballers() {
        return footballerRepository.findAll();
    }

    public void deleteFootballer(Long footballerId) {
        List<Contract> contractsToDelete = contractRepository.findByFootballerId(footballerId);
        contractRepository.delete(contractsToDelete);

        footballerRepository.delete(footballerId);
    }

    public void addFootballer(Footballer footballer) {
        skillRepository.save(footballer.skill);
        footballerRepository.save(footballer);
    }



    public Skill showFootballerSkills(Long footballerId) {
        Footballer footballer = footballerRepository.findOne(footballerId);
        return footballer.skill;
    }

    public Skill updateSkill(Skill skill) {
        return skillRepository.saveAndFlush(skill);
    }



    public List<Country> getAllCountry() {
        return countryRepository.findAll();
    }

    public List<Academy> getAllAcademy() {
        return academyRepository.findAll();
    }

}
