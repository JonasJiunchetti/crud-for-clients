package com.challenge.Challenge3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.Challenge3.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;
    
}
