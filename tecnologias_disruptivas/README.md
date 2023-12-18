# Projeto Final da disciplina.

## Projeto INTEGRADO FULLSTACK GESTÃO DE TAREFAS - CRUD

Composto pelo Banco de Dados, backend e frontend.
Objetivo é Criar Projetos, Tarefas e Recursos.

**Detalhes técnicos:**

O backend da aplicação será uma API Restful, desenvolvida na liguagem Java, utilizando o framework Spring Boot.
O frontend, uma aplicação Web, será desenvolvida com o React.js.
O Banco de Dados vamos utilizar um embarcado, como H2, ou outro, MySQL ou Postgresql.

### Banco de Dados - H2

Regras de negócio - Controlar Projetos, Tarefas e Recursos.

Adicionar aqui a imagem de estrutura do DB do projeto.
(imagem01)[]
<hr>

### Backend

-   A API Restful disponibilizará, para cada entidade(Projeto, Tarefa, Status Tarefa e Recursos) endpoints para as operações CRUD.
-   Serão disponibilizados outros recursos para a recuperação de informações específicas que suprirão necessidades
    do frontend, como montagem de componentes selects.

** Funcionamento:
Em relação à comunicação como o frontend e o banco de dados, todo o projeto será **dockerizado\*\* e será disponibilizado numa mesma rede(Docker network).
<hr>

### Frontend

O frontend da aplicação será um sistema Web desenvolvida com React.js.
No sistema web, além das telas "de negócio" CRUD, haverá também uma tela de login. para autenticação no backend e obtenção do token JWT.
Todas as requisições para o backend, para as rotas protegidas, serão realizadas com o envio do token JWT.

<hr>
