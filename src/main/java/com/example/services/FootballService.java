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

    /*      Working      */
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    /*      Working      */
    public void deleteClub(Long clubId) {
        List<Contract> contractsToDelete = contractRepository.findByClubId(clubId);
        contractRepository.delete(contractsToDelete);

        List<Manager> managersToDelete = managerRepository.findByClubId(clubId);
        managerRepository.delete(managersToDelete);

        clubRepository.delete(clubId);
    }

    /*      Working      */
    public void addClub(Club club) {
        clubRepository.save(club);
    }

    /*      Working      */
    public List<Footballer> getAllFootballers() {
        return footballerRepository.findAll();
    }

    /*      Working      */
    public void deleteFootballer(Long footballerId) {
        List<Contract> contractsToDelete = contractRepository.findByFootballerId(footballerId);
        contractRepository.delete(contractsToDelete);

        footballerRepository.delete(footballerId);
    }

    /*      Working      */
    public void addFootballer(Footballer footballer) {
        skillRepository.save(footballer.skill);
        footballerRepository.save(footballer);
    }

    /*      Working      */
    public Skill showFootballerSkills(Long footballerId) {
        Footballer footballer = footballerRepository.findOne(footballerId);
        return footballer.skill;
    }

    /*      Working      */
    public Skill updateSkill(Skill skill) {
        return skillRepository.saveAndFlush(skill);
    }

    /*      Working      */
    public List<Country> getAllCountry() {
        return countryRepository.findAll();
    }

    /*      Working      */
    public List<Academy> getAllAcademy() {
        return academyRepository.findAll();
    }

    /*      Working      */
    public void makeContract(Contract contract){
        contractRepository.saveAndFlush(contract);
    }

    /*      Working      */
    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    /*      Working      */
    public void addNewManager(Manager manager) {
        Long clubToBeDeletedId = manager.club.id;
        Long managerToBeDeletedId = null;
        List<Manager> allManagers = managerRepository.findAll();

        for (Manager m : allManagers){
            if(m.club.id == clubToBeDeletedId){
                managerToBeDeletedId = m.id;
            }
        }

        managerRepository.delete(managerToBeDeletedId);
        managerRepository.save(manager);
    }

}
