package com.miguel.doiche.integrationviacepjava.controllers;

import com.miguel.doiche.integrationviacepjava.dto.CepDTO;
import com.miguel.doiche.integrationviacepjava.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cep")
public class ViaCepController {
    @Autowired
    private ViaCepService service;
    @GetMapping(value = "/{cep}")
    public CepDTO consultViaCep(@PathVariable String cep){

        return service.sendRequest(cep);
    }

}
