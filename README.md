# API de Classificação de Mensagens – Spring Boot

Este projeto consiste em uma API REST simples desenvolvida com Spring Boot, cujo objetivo é classificar mensagens textuais enviadas por usuários em categorias pré-definidas, utilizando regras heurísticas.

---
## Objetivo do Projeto

A API foi criada para atender ao seguinte cenário:

Uma equipe precisa de uma API backend capaz de receber mensagens curtas e classificá-las automaticamente em categorias simples.

A solução foi pensada para ser:
- Simples
- Extensível
- Fácil de entender e executar localmente

---

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Web
- Spring Validation
- Maven
- REST API (JSON)

---

## Arquitetura da Solução

O projeto segue uma arquitetura básica em camadas:

```text
controller → service → model 
``` 
## Responsabilidades

### Controller
Responsável por expor os endpoints REST, receber e validar as requisições e retornar as respostas HTTP.

### Service
Contém a lógica de classificação das mensagens e centraliza as regras de negócio.

### Model
Representam os dados de entrada e saída da API.

## Lógica de Classificação

A classificação é feita através de regras simples baseadas em palavras-chave, conforme exemplos abaixo:

### Categoria 
SPAM, ELOGIO, RECLAMAÇÃO e OUTROS
### Palavras-chave 
PROMOÇÃO, GANHE, CLIQUE, PROBLEMA, RUIM, PÉSSIMO, ÓTIMO, PARABÉNS. 


## Endpoint Disponível
### Classificar Mensagem

POST /classificar

Requisição
``` 
{
  "texto": "Esse serviço é péssimo, tive vários problemas"
}
``` 

Resposta
``` 
{
  "texto": "Esse serviço é péssimo, tive vários problemas",
  "categoria": "RECLAMACAO"
}
``` 

## Validações

* O campo texto é obrigatório

* Não é permitido enviar texto vazio

* Caso a validação falhe, a API retorna HTTP 400 (Bad Request).

## Como Executar o Projeto
### Pré-requisitos

* Java 17 instalado

* Maven instalado

* Git instalado

---

## Clonando o Repositório

```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
```
## Executando a Aplicação 
```bash
  mvn spring-boot:run
```
---
##Acessando a API

### A aplicação será iniciada em:

```bash
   http://localhost:8080
```

## Limitações

* Classificação baseada apenas em regras simples

* Não utiliza inteligência artificial ou aprendizado de máquina

* Pode falhar em textos ambíguos

### Possíveis Evoluções

* Uso de LLMs (OpenAI, Gemini, etc.)

* Persistência em banco de dados

* Inclusão de testes unitários e de integração

* Internacionalização

* Dockerização da aplicação
