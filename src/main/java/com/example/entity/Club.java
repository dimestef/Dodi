package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "league")
    public String league;

    @ManyToOne
    @JoinColumn(name = "country_id")
    public Country country;

    @OneToOne
    @JoinColumn(name = "academy_id")
    public Academy academy;
}