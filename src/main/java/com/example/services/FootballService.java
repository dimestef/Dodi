package com.example.services;


import com.example.entity.Skill;
import com.example.repository.ClubRespository;
import com.example.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballService {

    @Autowired
    ClubRespository clubRespository;

    @Autowired
    SkillRepository skillRepository;

    public Skill addSkill(Skill skill){
        skillRepository.saveAndFlush(skill);    //TUka treba i footballer da primi
        return skill;
    }
}
