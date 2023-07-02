package com.example.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/* O Record é uma forma de criar uma classe que possue atributos
* eles são úteis para criar DTOs (Data Transfere Object), ou seja
* eles servem para transferir dados sem a necessidade de mandar a
* entidade inteira, então é útil para transferir somente os objetos.*/
public record RequestProduct(String id, @NotBlank String name, @NotNull Integer price_in_cents) {
}
