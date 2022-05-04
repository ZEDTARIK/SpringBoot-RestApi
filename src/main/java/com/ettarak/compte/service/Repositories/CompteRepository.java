package com.ettarak.compte.service.Repositories;

import com.ettarak.compte.service.Entities.Compte;
import com.ettarak.compte.service.Enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Long> {
    @RestResource(path = "/ByType")
    List<Compte> findByType(@Param(value="type")TypeCompte typeCompte);
}
