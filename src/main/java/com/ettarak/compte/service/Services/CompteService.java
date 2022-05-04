package com.ettarak.compte.service.Services;

public interface CompteService  {
    void virement(Long codeSource, Long coedDestination , double mantant);
}
