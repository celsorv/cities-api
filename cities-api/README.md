# Cities API
___

#### Tecnologias empregadas
* Git
* Linux
* Docker
* Java 17
* IntelliJ Community

## Banco de dados
### PostgreSQL

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

#### Configuração da conexão com o PostgreSQL

- arquivo _src/main/resources/application.properties_

### Populando o banco de dados

* [Data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

Habilitando um terminal no container PostgreSQL, com acesso aos arquivos de script SQL.

```shell script
cd ~/<diretório dos scripts SQL>

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
```

Execução dos scrips utilizando o psql _(PostgreSQL CLI)_.

```shell script
psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql
```

Acessando o banco de dados utilizando o psql _(PostgreSQL CLI)_.
```shell script
psql -h localhost -U postgres_user_city cities
```

## Hibernate Types and User Types
* [Vlad Mihalcea](https://github.com/vladmihalcea/hibernate-types)
* [The Alchemist](https://github.com/The-Alchemist/hibernate-postgresql)

___
___
___
Estudo durante Bootcamp DIO _(Instrutor André Luis Gomes)_
