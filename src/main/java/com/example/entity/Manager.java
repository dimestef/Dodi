package com.example.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Manager {

    @ManyToOne
    @Column(name = "club_id")
    private Club club;


}
