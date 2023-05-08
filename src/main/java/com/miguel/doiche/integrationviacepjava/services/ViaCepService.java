package com.miguel.doiche.integrationviacepjava.services;

import com.miguel.doiche.integrationviacepjava.dto.CepDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class ViaCepService {


    public CepDTO sendRequest(String cep, String mensagem) {
        URI uri = UriComponentsBuilder.fromHttpUrl("https://viacep.com.br")
                .path("/ws/" + cep + "/json/")
                .build()
                .toUri();

        CepDTO cepDTO = WebClient
                .builder()
                .build()
                .method(HttpMethod.GET)
                .uri(uri).retrieve()
                .bodyToMono(CepDTO.class)
                .block();
        cepDTO.setMensagem(mensagem);

        return cepDTO;
    }
}
