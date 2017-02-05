package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "age")
    public Long age;

    @Column(name = "style_of_play")
    public String styleOfPLay;

    @ManyToOne
    @JoinColumn(name = "club_id")
    public Club club;
}
