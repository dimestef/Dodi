package com.example.repository;

import com.example.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRespository extends JpaRepository<Club, Long> {

}