# # Documentação do Projeto: Integração com Banco de Dados usando Spring Data JPA

Integrantes:

* Bruno Brandão
* Gustavo Prado
* Gabriel Henrique Vieira
* Julia

---

## 1. Introdução

Este projeto foi desenvolvido com o objetivo de aplicar, na prática, os conhecimentos adquiridos sobre Programação Orientada a Objetos (POO) e arquitetura de sistemas, por meio do uso do **Spring Framework e do Spring Data JPA.

A proposta foi criar uma aplicação backend capaz de executar operações CRUD (Create, Read, Update, Delete) e realizar consultas específicas, com integração a banco de dados relacional. A seguir, apresentamos os requisitos, a modelagem, os fluxos, os diagramas e as tecnologias utilizadas no projeto, além dos desafios enfrentados pela equipe.

---

## 2. Visão do Produto

A aplicação serve como um modelo funcional de integração com banco de dados relacional, oferecendo:

* Persistência de dados com Spring Data JPA
* Abstração de repositórios com JPARepository
* Estrutura baseada na arquitetura MVC (Model-View-Controller)
* API RESTful para interação com dados
* Consulta por atributos com parâmetros dinâmicos

É ideal tanto para fins acadêmicos quanto para profissionais que queiram aprender a integrar sistemas Java modernos com bancos de dados usando boas práticas.

---

## 3. Requisitos

### 3.1 Requisitos Funcionais

| ID   | Prioridade | Título              | Descrição                                                    | Critério de Aceitação                                       |
| ---- | ---------- | ------------------- | ------------------------------------------------------------ | ----------------------------------------------------------- |
| RF01 | Alta       | Cadastrar Entidade  | Permitir ao usuário cadastrar uma nova entidade no banco     | Os dados devem ser salvos corretamente no banco             |
| RF02 | Alta       | Listar Entidades    | Exibir todas as entidades cadastradas                        | O sistema deve retornar todos os dados disponíveis          |
| RF03 | Alta       | Atualizar Entidade  | Atualizar uma entidade já existente com base no ID           | A entidade deve ser alterada corretamente no banco          |
| RF04 | Alta       | Deletar Entidade    | Remover uma entidade específica a partir do ID               | A entidade deve ser excluída com sucesso                    |
| RF05 | Média      | Buscar por Atributo | Permitir consultas filtradas por atributos (ex: nome, email) | Os dados retornados devem corresponder ao filtro solicitado |

### 3.2 Requisitos Não Funcionais

* Desempenho: Operações otimizadas com Spring Data JPA
* Confiabilidade: Validações robustas com Bean Validation
* Manutenibilidade: Código organizado por camadas (Controller, Service, Repository)
* Escalabilidade: Suporte a expansão com novas entidades e funcionalidades
* Portabilidade: Aplicação compatível com múltiplas plataformas via JVM

---

## 4. Diagramas

### 4.1 Diagrama de Casos de Uso

> Descrição:
> O Diagrama de Casos de Uso representa as funcionalidades principais da aplicação, sob o ponto de vista do usuário. Mostra as interações com o sistema para realizar as operações CRUD e buscar entidades por atributos.

![Diagrama de Casos de Uso](attachment\:diagrama_de_caso_de_uso.png)

Casos Representados:

* Cadastrar Entidade: Inserção de dados via formulário ou requisição
* Atualizar Entidade: Modificação de registros já existentes
* Deletar Entidade: Exclusão de registros selecionados
* Listar Entidades: Visualização de todos os dados
* Buscar por Atributo: Filtro por campos como nome, e-mail, etc.

---

### 4.2 Diagrama de Atividades

> Descrição:
> O Diagrama de Atividades descreve o fluxo lógico de execução das operações, desde a requisição inicial até o retorno da resposta ao usuário. Ele ilustra como o sistema processa os dados entre as camadas Controller, Service e Repository.

![Diagrama de Atividades](attachment\:diagrama_de_atividade.png)

Etapas do Fluxo:

1. Início da aplicação (Spring Boot)
2. Escolha da operação (CRUD)
3. Envio de dados via API REST (JSON)
4. Controller recebe e valida os dados
5. Service executa a lógica de negócio
6. Repository acessa o banco de dados via JPA
7. Resposta é formatada e retornada ao cliente

---

## 5. Modelagem de Classe

| Classe             | Atributos                      | Principais Operações                                                |
| ------------------ | ------------------------------ | ------------------------------------------------------------------- |
| Pessoa           | id, nome, email, idade | create(), update(), delete(), findAll()                     |
| PessoaRepository | —                              | save(), deleteById(), findById(), findAll(), findByNome() |
| PessoaService    | —                              | Regras de negócio, chamadas ao repositório                          |
| PessoaController | —                              | Endpoints REST: recebe e envia requisições                          |

---

## 6. Guia do Usuário (API REST)

### Endpoints Disponíveis

| Método | Endpoint               | Descrição                  |
| ------ | ---------------------- | -------------------------- |
| POST   | /pessoas             | Cadastrar nova pessoa      |
| GET    | /pessoas             | Listar todas as pessoas    |
| GET    | /pessoas/{id}        | Buscar pessoa por ID       |
| PUT    | /pessoas/{id}        | Atualizar pessoa existente |
| DELETE | /pessoas/{id}        | Deletar pessoa específica  |
| GET    | /pessoas/nome/{nome} | Buscar por nome            |

---

## 7. Tecnologias Utilizadas

* Linguagem: Java 17
* Frameworks: Spring Boot 3, Spring Data JPA
* Banco de Dados: H2 (dev/teste), MySQL (produção)
* IDE: IntelliJ IDEA ou Eclipse
* Gerenciador de Build: Maven
* Testes e API: Postman, Bean Validation
* Controle de Versão: Git/GitHub

---

## 8. Problemas e Soluções

| Problema               | Solução Adotada                                                                       |
| ---------------------- | ------------------------------------------------------------------------------------- |
| Configuração do JPA    | Uso de @Entity, @Id, @GeneratedValue e application.properties bem configurado |
| Validação de dados     | Bean Validation com anotações como @NotBlank, @Email, @Min, etc.                |
| Organização em camadas | Adoção do padrão MVC com clara separação entre Controller, Service e Repository       |

---

## 9. Conclusão

O projeto nos proporcionou uma visão prática e aprofundada do desenvolvimento de sistemas Java modernos com o Spring Framework. Aplicamos boas práticas de arquitetura, integração com banco de dados, validações, estrutura modular e construção de APIs RESTful.

### Melhorias Futuras

* Autenticação com JWT
* Testes automatizados com JUnit e Mockito
* Integração com banco de dados em nuvem (AWS, Azure, etc.)

---

## 10. Cronograma Geral

| Semana   | Atividade                                                                  |
| -------- | -------------------------------------------------------------------------- |
| Semana 1 | Planejamento, criação do backlog, configuração do ambiente                 |
| Semana 2 | Desenvolvimento das funcionalidades principais (CRUD)                      |
| Semana 3 | Integração das funcionalidades, testes manuais, construção da documentação |
