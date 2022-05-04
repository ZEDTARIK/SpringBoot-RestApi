package com.ettarak.compte.service.Dtos;

import lombok.Data;

@Data
public class VirementRequestDto {
    private  Long coedSource;
    private Long codeDestination;
    private double mantant;
}
