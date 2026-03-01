# 📚 Sistema Alunos

## 📌 Descrição

O Sistema Alunos é uma API REST simples desenvolvida com Spring Boot para gerenciamento de cursos, estudantes e professores.

A aplicação implementa operações básicas de CRUD (Create, Read, Update e Delete) para cada entidade do sistema, permitindo o gerenciamento completo dos dados.

Este projeto foi desenvolvido com foco em aprendizado do framework Spring Boot e aplicação prática da linguagem Java, possuindo caráter acadêmico e experimental. O objetivo principal é consolidar conhecimentos nessas tecnologias amplamente utilizadas no mercado.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- JSON

---

## 🌐 Base URL

http://localhost:8080

---

## 📌 Endpoints Disponíveis

### 🔹 Sistema

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/sistema/info` | Retorna informações do sistema |

Exemplo de uso:

GET http://localhost:8080/sistema/info

---

### 🔹 Curso

| Método | Endpoint |
|--------|----------|
| GET | `/curso` |
| POST | `/curso` |
| PUT | `/curso/{id}` |
| DELETE | `/curso/{id}` |

Exemplo de uso:

GET http://localhost:8080/curso

---

### 🔹 Estudante

| Método | Endpoint |
|--------|----------|
| GET | `/estudante` |
| POST | `/estudante` |
| PUT | `/estudante/{id}` |
| DELETE | `/estudante/{id}` |

Exemplo de uso:

GET http://localhost:8080/estudante

---

### 🔹 Professor

| Método | Endpoint |
|--------|----------|
| GET | `/professor` |
| POST | `/professor` |
| PUT | `/professor/{id}` |
| DELETE | `/professor/{id}` |

Exemplo de uso:

GET http://localhost:8080/professor

---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

git clone <URL_DO_REPOSITORIO>

### 2️⃣ Acessar a pasta do projeto

cd sistema-alunos

### 3️⃣ Executar via Maven

mvn spring-boot:run

Ou executar a classe principal do projeto pela IDE.

---

## 🧪 Como Testar

Você pode testar os endpoints utilizando:

- Postman
- Insomnia
- Navegador (para requisições GET)

Basta utilizar a Base URL:

http://localhost:8080

E adicionar o endpoint desejado.

---

## 👨‍💻 Autor

Nome: Marcos Eduardo

---
