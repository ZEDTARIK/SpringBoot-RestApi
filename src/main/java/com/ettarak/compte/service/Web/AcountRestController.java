package com.ettarak.compte.service.Web;

import com.ettarak.compte.service.Dtos.VirementRequestDto;
import com.ettarak.compte.service.Services.CompteService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcountRestController {

    private  final CompteService compteService;

    public AcountRestController(CompteService compteService) {
        this.compteService = compteService;
    }

    @PutMapping(path="/compte/virement")
    public void virement(@RequestBody VirementRequestDto virementRequestDto) {
        compteService.virement(virementRequestDto.getCoedSource(), virementRequestDto.getCodeDestination(), virementRequestDto.getMantant());
    }
}
