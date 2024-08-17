# API-HOSPITAL-SPRING-BOOT

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
![H2 Database](https://img.shields.io/badge/H2-Embedded%20Database-lightgrey)
![REST API](https://img.shields.io/badge/REST%20API-CRUD%20Operations-orange)

## Descrição

A **API-HOSPITAL-SPRING-BOOT** é uma aplicação RESTful desenvolvida em **Spring Boot 3.3.2** que facilita o gerenciamento de pacientes em um ambiente hospitalar. Esta API fornece uma interface robusta para operações CRUD (Create, Read, Update, Delete) que permitem o gerenciamento eficiente de informações de pacientes, como `id`, `nome`, `sobrenome` e `email`.

Projetada com foco em escalabilidade e boas práticas de desenvolvimento, a API utiliza **Java 17** e está integrada a um banco de dados em memória H2, ideal para testes e desenvolvimento rápido. As operações podem ser facilmente testadas e validadas utilizando ferramentas como o **Insomnia**.

## Funcionalidades Principais

A API-HOSPITAL-SPRING-BOOT oferece as seguintes funcionalidades:

- **Criação de Pacientes (POST)**: Insere novos registros de pacientes no sistema com informações detalhadas.

- **Leitura de Pacientes (GET)**:
    - Retorna a lista completa de pacientes cadastrados.
    - Permite a busca de um paciente específico utilizando seu ID único.

- **Atualização de Pacientes (PUT)**: Modifica as informações de um paciente existente utilizando seu ID para localização.

- **Exclusão de Pacientes (DELETE)**: Remove um paciente do sistema com base em seu ID.

## Integração com Banco de Dados H2

A aplicação utiliza o **H2 Database**, um banco de dados relacional em memória, que é excelente para desenvolvimento e testes. As operações realizadas podem ser facilmente monitoradas e verificadas através da interface web do H2.

### Acesso ao Console do H2 Database

- **URL**: `http://localhost:8080/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: (deixe em branco)

## Como Usar a API

### Requisitos

- **JDK 17** ou superior
- **Maven** 3.6.x
- **Insomnia** ou qualquer outra ferramenta de teste de API (como Postman)

### Passos para Execução

1. **Clone o Repositório**:
    ```bash
    git clone https://github.com/seu-usuario/API-HOSPITAL-SPRING-BOOT.git
    cd API-HOSPITAL-SPRING-BOOT
    ```

2. **Compile e Execute a Aplicação**:
    ```bash
    mvn spring-boot:run
    ```

3. **Realize Testes de API**:
   Com a aplicação em execução, utilize o **Insomnia** ou outra ferramenta para enviar requisições HTTP para a API.

### Exemplos de Requisições

- **Criar um Paciente**:
    - Método: `POST`
    - URL: `http://localhost:8080/api/paciente`
    
- **Obter Todos os Pacientes**:
    - Método: `GET`
    - URL: `http://localhost:8080/api/paciente/{id}`

- **Obter um Paciente por ID**:
    - Método: `GET`
    - URL: `http://localhost:8080/api/patients/{id}`

- **Atualizar um Paciente**:
    - Método: `PUT`
    - URL: `http://localhost:8080/api/pacientes/{id}`
    
- **Excluir um Paciente**:
    - Método: `DELETE`
    - URL: `http://localhost:8080/api/pacientes/{id}`

