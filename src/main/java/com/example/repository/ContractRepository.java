package com.example.repository;

import com.example.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    List<Contract> findByClubId(Long clubId);

    List<Contract> findByFootballerId(Long footballerId);
}
