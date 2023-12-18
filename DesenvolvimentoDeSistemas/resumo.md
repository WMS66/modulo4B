### RESUMO da Matéria Tecnologias Inovadoras de Desenvolvimento de Sistemas.

### Este projeto esta hospedado em https://gitlab.com/cabraldasilvac/

<hr>

# Documentação de CI/CD pipelines

https://docs.gitlab.com/ee/ci/pipelines/
Acesso em: 4 de dezembro de 2023.

# CI/CD utilizando Fastlane e Circle CI Parte 1

https://medium.com/android-dev-br/ci-cd-utilizando-fastlane-e-circle-ci-parte-1-e339f3cf833a
Acesso em: 4 de dezembro de 2023.

Instalação das ferramentas necessária para o Desenvolvimento do Projeto

-   vscode
-   postman
-   Eclipse
-   npm
-   Git

# Instalar as dependências do Projeto.

npm install

# Rodar o projeto

npm start

# Configurar o Banco de Dados H2

-   Editar o arquivo Application.properties

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=test
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.h2.console.enabled=true
```

# Instalar o Docker Desktop

Rodar o docker
docker run -d -p 80:80 docker/getting-started

subir uma imagem do Ngnix - docker run -d nginx:latest
Criar o primeiro container - docker run --name MeuNginx -p 9090:80 -d nginx:latest

# Criar a imagem

Criar o arquivo Dockerfile
docker build -t mynginx:latest .

# Baixar uma imagem do DockerHub

docker pull nginx:1.19.8

# Build container

docker run --name MyNginx -p 9280:80 -d mynginx:latest

# Layered system

Camadas no Dockerfile

# Tageamento

docker build -t mynginx:1.0 .
Aqui eu uso a mesma imagem com uma TAG diferente

# Volumes

Local onde estão arqmazenados os arquivos

-   Rodando minha página
    docker run --name Nginx2 -v ~/Development/projects/Modulo4B/desenvolvimentoDeSistemas/resumo/docker/volumes/ngnix:/usr/share/nginx/html -p 9180:80 -d nginx:latest

# Subindo Banco de Dados

Instalar o gerenciador de Banco de Dados - MySql

-   Para criar o Container de Banco de Dados
    docker run --name MySQL -p 3306:3306 -e MYSQL_ROOT_PASSWORD=MinhaSenha -e MYSQL_USER0=MeuUsuario -e MYSQL_PASSWORD=MinhaSenha -d mysql:latest

-   Para remover container via linha de comando
    docker container rm <nome-do-container>

# Host e Containers

É através do Host que conseguimos "segurar" os containers
Host - Windows Vs Linux Vs Mac(subir no linux)

-   Para executar um container
    docker exec -it Nginx /bin/bash

-   Para ver as redes do meu ambiente de trabalho
    docker network ls
    docker network inspect MinhaRede

# Subindo uma solução completa

Fazer o clone para fazer o build da image Oracle
github.com/oracle/docker-images

Dentro da pasta /sincleInstance/dockerfile
./buildContainerImage.sh -v 18.4.0 -x

docker run --name MeuOracle --network MinhaRede -v ~/Development/projects/Docker/Volumes/oracle/oradata:/opt/oracle/oradata -v ~/Development/projects/Docker/Volumes/oracle/setup:/opt/oracle/scripts/setup -p 1521:1521 -p 5500:5500 -e ORACLE_PWD=MinhaSenha -e ORACLE_CHARACTERSET=AL32UTF8 -d oracle/database:18.4.0-xe

FrontEnd

BackEnd

# Criar uma Pepeline CI/CD

-   Primeiro script
