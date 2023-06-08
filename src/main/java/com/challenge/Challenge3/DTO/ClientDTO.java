package com.challenge.Challenge3.DTO;

import java.time.LocalDate;

import com.challenge.Challenge3.entities.Client;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ClientDTO {

    private Long id;

    private String name;

    private String cpf;

    private Double income;

    private LocalDate birthDate;
    
    private Integer children;

    public ClientDTO (Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
        
    }
    
}
