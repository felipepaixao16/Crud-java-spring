package com.example.crud.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

// Product se refere a entidade(Classe Product) a ser manipulada e o String se refere ao tipo da minha Primary Key
public interface ProductRepository extends JpaRepository<Product, String> {


}
