# API de consulta de CEP da ViaCEP

Esta é uma API para consulta de CEPs (Código de Endereçamento Postal) no Brasil. Ela utiliza os dados disponibilizados pela ViaCEP, um serviço gratuito de consulta de CEP mantido pelos Correios brasileiros.

## Uso

### Consulta de CEP

Para consultar um CEP, faça uma requisição GET para a seguinte URL:

```
localhost:8080/cep/{cep}
```

Substitua `{cep}` pelo número do CEP desejado, sem espaços ou hífens.

A resposta será um objeto JSON com os dados correspondentes ao CEP consultado. Exemplo:

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```
## Limitações

A ViaCEP possui algumas limitações em seu serviço de consulta de CEPs:

- A API permite no máximo 5 requisições por segundo por IP.
- A API não permite o uso em massa de seus dados, como por exemplo para criação de bancos de dados.

## Contribuições

Contribuições são bem-vindas! Se você quiser ajudar a melhorar esta API, por favor abra um pull request com suas sugestões.

## Licença

Esta API é distribuída sob a licença MIT. Veja o arquivo LICENSE para mais informações.
