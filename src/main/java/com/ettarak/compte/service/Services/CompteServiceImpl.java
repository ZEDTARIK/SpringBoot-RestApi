package com.ettarak.compte.service.Services;

import com.ettarak.compte.service.Entities.Compte;
import com.ettarak.compte.service.Repositories.CompteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {

    private final CompteRepository compteRepository;

    public CompteServiceImpl(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Override
    public void virement(Long codeSource, Long coedDestination, double mantant) {
        Compte c1 = compteRepository.getById(codeSource);
        Compte c2 = compteRepository.getById(coedDestination);
        c1.setSolde(c1.getSolde() - mantant);
        c2.setSolde((long) (c2.getSolde() + mantant));
        // compteRepository.save(c1);
        // compteRepository.save(c2);
    }
}
