package com.ettarak.compte.service.Repositories;

import com.ettarak.compte.service.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
