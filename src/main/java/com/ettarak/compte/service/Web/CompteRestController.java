package com.ettarak.compte.service.Web;

import com.ettarak.compte.service.Entities.Compte;
import com.ettarak.compte.service.Repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteRestController {

    private final CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @GetMapping(path = "/comptes")
    public List<Compte> ListComptes() {
        return  compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable( name = "id") Long code) {
        return  compteRepository.findById(code).get();
    }

    @PostMapping(path = "/comptes")
    public Compte saveCompte(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{id}")
    public  Compte updateCompte(@PathVariable( name = "id") Long code, Compte compte) {
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path = "/comptes/{code}")
    public void deleteCompte(@PathVariable Long code) {
        compteRepository.deleteById(code);
    }

}
