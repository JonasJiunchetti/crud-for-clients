package com.challenge.Challenge3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.challenge.Challenge3.DTO.ClientDTO;
import com.challenge.Challenge3.entities.Client;
import com.challenge.Challenge3.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;
    
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

}
