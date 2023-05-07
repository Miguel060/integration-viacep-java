package com.miguel.doiche.integrationviacepjava.dto;

import lombok.*;

/**
  Classe de transferencia de dados do CEP
  @author Miguel
  @author Lucas
  @since 2023-05-06
  @version 0.1-SNAPSHOT


 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CepDTO {
    private String cep;

    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;


}
