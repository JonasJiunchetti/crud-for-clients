package com.challenge.Challenge3.DTO;

import java.time.LocalDate;

import com.challenge.Challenge3.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ClientDTO {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "It must be a past or present date")
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
