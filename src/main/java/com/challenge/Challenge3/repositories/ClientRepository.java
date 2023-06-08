package com.challenge.Challenge3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.Challenge3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
