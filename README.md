# Crud-java-spring
Este repositório contém um projeto CRUD simples construído usando Java Spring. O objetivo deste repositório é praticar e compartilhar como você pode construir todos os métodos CRUD usando Java Spring.

## Índice

- [Instalação](#instalação)
- [Configuração](#configuração)
- [pontos de extremidade da API](#api-endpoints)
- [Banco de dados](#banco de dados)

## Instalação

1. Clone o repositório:

```bash
$ git clone https://github.com/felipepaixao16/Crud-java-spring.git
```

2. Instale dependências com Maven

## Uso

1. Inicie o aplicativo com Maven
2. A API estará acessível em http://localhost:8080


## Terminais de API
A API fornece os seguintes endpoints:

```remarcação
GET /product - Recupera uma lista de todos os dados.

POST /product - Registra um novo dado.

PUT /produto - Alterar dados.

DELETE /product/{id} - Desativar dados.
```

## Base de dados
O projeto usa PostgresSQL como banco de dados. As migrações de banco de dados necessárias são gerenciadas usando o Flyway.

Para instalar o PostgresSQL localmente você pode [clique aqui](https://www.postgresql.org/download/).
