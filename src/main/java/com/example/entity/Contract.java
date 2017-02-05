package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "transfer_fee")
    public Long transferFee;

    @Column(name = "wage")
    public Long wage;

    @Column(name = "duration_in_months")
    public Long durationInMonths;

    @Column(name = "date_signed")
    public String dateSigned;

    @ManyToOne
    @JoinColumn(name = "footballer_id")
    public Footballer footballer;

    @ManyToOne
    @JoinColumn(name = "club_id")
    public Club club;
}