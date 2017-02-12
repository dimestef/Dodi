package com.example.services;

import com.example.entity.*;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OnStartService {

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

    @PostConstruct
    public void initDB() {
        fillCountries();
        fillAcademies();
        fillClubs();
        fillSkills();
        fillFootballers();
        fillContracts();
        fillManagers();
    }

    private void fillManagers() {
        if (!managerRepository.findAll().isEmpty()) {
            return;
        }

        Manager manager = new Manager();
        manager.firstName = "José";
        manager.lastName = "Mourinho";
        manager.age = 54L;
        manager.styleOfPlay = "4-3-3";
        manager.club = clubRepository.findOne(1L);
        managerRepository.save(manager);

        manager = new Manager();
        manager.firstName = "Zinedine";
        manager.lastName = "Zidane";
        manager.age = 44L;
        manager.styleOfPlay = "4-3-3";
        manager.club = clubRepository.findOne(2L);
        managerRepository.save(manager);

        manager = new Manager();
        manager.firstName = "Luis";
        manager.lastName = "Enrique";
        manager.age = 46L;
        manager.styleOfPlay = "4-3-3";
        manager.club = clubRepository.findOne(3L);
        managerRepository.save(manager);
    }

    private void fillContracts() {
        if (!contractRepository.findAll().isEmpty()) {
            return;
        }

        Contract contract = new Contract();
        contract.transferFee = 1000000L;
        contract.wage = 999999L;
        contract.durationInMonths = 24L;
        contract.dateSigned = "10-02-2012";
        contract.footballer = footballerRepository.findOne(1L);
        contract.club = clubRepository.findOne(2L);
        contractRepository.save(contract);

        contract = new Contract();
        contract.transferFee = 1430500L;
        contract.wage = 9931235L;
        contract.durationInMonths = 12L;
        contract.dateSigned = "15-01-1998";
        contract.footballer = footballerRepository.findOne(2L);
        contract.club = clubRepository.findOne(3L);
        contractRepository.save(contract);

        contract = new Contract();
        contract.transferFee = 1205067L;
        contract.wage = 12356885L;
        contract.durationInMonths = 24L;
        contract.dateSigned = "04-16-1999";
        contract.footballer = footballerRepository.findOne(3L);
        contract.club = clubRepository.findOne(3L);
        contractRepository.save(contract);
    }

    private void fillFootballers() {
        if (!footballerRepository.findAll().isEmpty()) {
            return;
        }

        Footballer footballer = new Footballer();
        footballer.firstName = "Cristiano";
        footballer.lastName = "Ronaldo";
        footballer.numberOfGoals = 100L;
        footballer.position = "Striker";
        footballer.number = 7L;
        footballer.age = 32L;
        footballer.country = countryRepository.findOne(5L);
        footballer.skill = skillRepository.findOne(1L);
        footballerRepository.save(footballer);

        footballer = new Footballer();
        footballer.numberOfGoals = 90L;
        footballer.position = "Striker";
        footballer.number = 10L;
        footballer.firstName = "Messi";
        footballer.lastName = "Lionel";
        footballer.age = 34L;
        footballer.country = countryRepository.findOne(2L);
        footballer.skill = skillRepository.findOne(2L);
        footballerRepository.save(footballer);

        footballer = new Footballer();
        footballer.numberOfGoals = 80L;
        footballer.position = "Defender";
        footballer.number = 3L;
        footballer.firstName = "Gerard";
        footballer.lastName = "Pique";
        footballer.age = 30L;
        footballer.country = countryRepository.findOne(2L);
        footballer.skill = skillRepository.findOne(3L);
        footballerRepository.save(footballer);
    }

    private void fillSkills() {
        if (!skillRepository.findAll().isEmpty()) {
            return;
        }

        Skill skill = new Skill();
        skill.intelligence = 30L;
        skill.vision = 40L;
        skill.speed = 20L;
        skill.strength = 50L;
        skill.shooting = 40L;
        skill.passing = 30L;
        skill.dribbling = 20L;
        skillRepository.save(skill);

        skill = new Skill();
        skill.intelligence = 20L;
        skill.vision = 50L;
        skill.speed = 50L;
        skill.strength = 30L;
        skill.shooting = 40L;
        skill.passing = 20L;
        skill.dribbling = 10L;
        skillRepository.save(skill);

        skill = new Skill();
        skill.intelligence = 20L;
        skill.vision = 20L;
        skill.speed = 40L;
        skill.strength = 40L;
        skill.shooting = 50L;
        skill.passing = 10L;
        skill.dribbling = 20L;
        skillRepository.save(skill);
    }

    private void fillClubs() {
        if (!clubRepository.findAll().isEmpty()) {
            return;
        }

        Club club = new Club();
        club.name = "Chelsea";
        club.league = "Premier League";
        club.country = countryRepository.findOne(1L);
        club.academy = academyRepository.findOne(3L);
        clubRepository.save(club);

        club = new Club();
        club.name = "Real Madrid";
        club.league = "LaLeague";
        club.country = countryRepository.findOne(2L);
        club.academy = academyRepository.findOne(1L);
        clubRepository.save(club);

        club = new Club();
        club.name = "Barcelona";
        club.league = "LaLeague";
        club.country = countryRepository.findOne(1L);
        club.academy = academyRepository.findOne(2L);
        clubRepository.save(club);
    }

    private void fillAcademies() {
        if (!academyRepository.findAll().isEmpty()) {
            return;
        }

        Academy academy = new Academy();
        academy.name = "Real Madrid";
        academyRepository.save(academy);

        academy = new Academy();
        academy.name = "Barcelona";
        academyRepository.save(academy);

        academy = new Academy();
        academy.name = "Chelsea";
        academyRepository.save(academy);
    }

    private void fillCountries() {
        if (!countryRepository.findAll().isEmpty()) {
            return;
        }

        Country country = new Country();
        country.name = "England";
        country.continent = "Europe";
        country.fifaRanking = 5L;
        countryRepository.save(country);

        country = new Country();
        country.name = "Spain";
        country.continent = "Europe";
        country.fifaRanking = 5L;
        countryRepository.save(country);

        country = new Country();
        country.name = "Albania";
        country.continent = "Europe";
        country.fifaRanking = 4L;
        countryRepository.save(country);

        country = new Country();
        country.name = "Macedonia";
        country.continent = "Europe";
        country.fifaRanking = 4L;
        countryRepository.save(country);

        country = new Country();
        country.name = "Portugal";
        country.continent = "Europe";
        country.fifaRanking = 4L;
        countryRepository.save(country);
    }
}
