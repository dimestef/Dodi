package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "footballer")
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "number_of_goals")
    public Long numberOfGoals;

    @Column(name = "position")
    public String position;

    @Column(name = "number")
    public Long number;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "age")
    public Long age;

    @ManyToOne
    @JoinColumn(name = "country_id")
    public Country country;

    @OneToOne
    @JoinColumn(name = "skill_id")
    public Skill skill;
}
