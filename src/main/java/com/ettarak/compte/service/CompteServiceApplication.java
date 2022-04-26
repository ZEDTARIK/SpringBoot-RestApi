package com.ettarak.compte.service;

import com.ettarak.compte.service.Entities.Compte;
import com.ettarak.compte.service.Enums.TypeCompte;
import com.ettarak.compte.service.Repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepositorys) {
        return  args -> {
            compteRepositorys.save(new Compte(null, 1500, new Date(), TypeCompte.EPARGNE));
            compteRepositorys.save(new Compte(null, 5300, new Date(), TypeCompte.COURANT));
            compteRepositorys.save(new Compte(null, 700, new Date(), TypeCompte.EPARGNE));

            compteRepositorys.findAll().forEach(cp -> {
                System.out.println(cp.getCode());
                System.out.println(cp.getSolde());
                System.out.println(cp.getType());
            });
        };
    }

}
