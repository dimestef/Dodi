package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "countryName")
    private String countryName;

    @Column(name = "continent")
    private String continent;

    @Column(name = "FIFARanging")
    private Long FIFARanging;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Long getFIFARanging() {
        return FIFARanging;
    }

    public void setFIFARanging(Long FIFARanging) {
        this.FIFARanging = FIFARanging;
    }
}