package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "continent")
    public String continent;

    @Column(name = "fifa_ranking")
    public Long fifaRanking;
}