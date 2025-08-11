# ForumHub

![java](https://img.shields.io/badge/java-21-blue) ![spring boot](https://img.shields.io/badge/spring%20boot-3.x-brightgreen) ![status](https://img.shields.io/badge/status-concluído-green)

api rest para um fórum de discussões, desenvolvida no challenge back-end da alura, que permite que usuários autenticados criem, leiam, atualizem e excluam tópicos.

---

## ✨ funcionalidades

- **autenticação:** cadastro e login com geração de token jwt para acesso seguro.
- **crud de tópicos:** criação, listagem (paginada), detalhamento, atualização e exclusão.
- **validações:** evita duplicação e trata erros de forma clara.
- **documentação:** endpoints documentados (ex.: swagger).

---

## 🛠️ tecnologias utilizadas

- java 21
- spring boot 3
- spring web
- spring data jpa
- spring security
- jwt
- mysql
- flyway
- lombok
- maven

---

# 🚀 como executar

### pré-requisitos
- [jdk 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [maven](https://maven.apache.org/download.cgi)
- [mysql](https://dev.mysql.com/downloads/installer/)

### 🛠 passos

1. **clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/forumhub.git

2. **crie o banco de dados**
   ```bash
   (no mysql)
   create database forumhub;

3. **configure o arquivo `application.properties`**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost/forumhub
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

4. **execute o projeto**

   ```bash
   mvn spring-boot:run
   ```

   a api estará disponível em **[http://localhost:8080](http://localhost:8080)** :D

---

# 📖 endpoints

> **nota:** endpoints marcados com 🔒 exigem envio do header
> `authorization: bearer <seu_token>`

| método | endpoint        | descrição                             | auth |
| ------ | --------------- | ------------------------------------- |------|
| POST   | `/login`        | autentica usuário e retorna token jwt | não! |
| POST   | `/topicos`      | cria novo tópico                      | 🔒   |
| GET    | `/topicos`      | lista tópicos (paginado)              | não! |
| GET    | `/topicos/{id}` | detalha tópico por id                 | não! |
| PUT    | `/topicos/{id}` | atualiza título, mensagem ou status   | 🔒   |
| DELETE | `/topicos/{id}` | exclui tópico                         | 🔒   |

---

## 🧩 exemplos de request body

**autenticação**
`POST /login`

```json
{
  "login": "seu.nome@email.com",
  "senha": "123456"
}
```

**criar tópico**
`POST /topicos`

```json
{
  "titulo": "dúvida sobre spring security",
  "mensagem": "como configuro a autenticação stateless?",
  "idcurso": 1
}
```

**atualizar tópico**
`PUT /topicos/{id}`

```json
{
  "titulo": "dúvida [atualizado]",
  "status": "nao_respondido"
}
```
---

## 🔗 Links Úteis

-   **Repositório no GitHub:** [ForumHub](https://github.com/luyaragao/forumhub.git)
-   **Documentação Interativa:** [Swagger](http://localhost:8080/swagger-ui/index.html#/)
   ⚠️ Para acessar a documentação Interativa, execute o projeto primeiro e depois acesse o link do swagger, senão não vai funcionar.

---


Este projeto foi desenvolvido com propósito educacional, sendo o último challenge proposto pela alura na formação de desenvolvimento back end java. (g8)

O projeto está **concluído**, com todas as funcionalidades da API implementadas conforme o escopo do desafio. porem aberto a novas melhorias e, quem sabe, até contribuições?

*obrigado por usar :D*

feito por luy 🌱

[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?logo=linkedin)](https://www.linkedin.com/in/luy-aragao/)
[![GitHub](https://img.shields.io/badge/GitHub-black?logo=github)](https://github.com/luyaragao)

---

<p align="center">
   <img width="500" height="500" alt="Badge-Spring" src="https://github.com/user-attachments/assets/b6dd5062-f606-4885-8e32-386f0edb3166" />
</p>


