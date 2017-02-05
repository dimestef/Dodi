package com.example.entity;


import javax.persistence.*;

@Entity
@Table(name = "Skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "inteligence")
    private Long inteligence;

    @Column(name = "vision")
    private Long vision;

    @Column(name = "speed")
    private Long speed;

    @Column(name = "strength")
    private Long strength;

    @Column(name = "shooting")
    private Long shooting;

    @Column(name = "passing")
    private Long passing;

    @Column(name = "dribbling")
    private Long dribbling;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInteligence() {
        return inteligence;
    }

    public void setInteligence(Long inteligence) {
        this.inteligence = inteligence;
    }

    public Long getVision() {
        return vision;
    }

    public void setVision(Long vision) {
        this.vision = vision;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Long getStrength() {
        return strength;
    }

    public void setStrength(Long strength) {
        this.strength = strength;
    }

    public Long getShooting() {
        return shooting;
    }

    public void setShooting(Long shooting) {
        this.shooting = shooting;
    }

    public Long getPassing() {
        return passing;
    }

    public void setPassing(Long passing) {
        this.passing = passing;
    }

    public Long getDribbling() {
        return dribbling;
    }

    public void setDribbling(Long dribbling) {
        this.dribbling = dribbling;
    }
}