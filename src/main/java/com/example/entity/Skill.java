package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "intelligence")
    public Long intelligence;

    @Column(name = "vision")
    public Long vision;

    @Column(name = "speed")
    public Long speed;

    @Column(name = "strength")
    public Long strength;

    @Column(name = "shooting")
    public Long shooting;

    @Column(name = "passing")
    public Long passing;

    @Column(name = "dribbling")
    public Long dribbling;
}