# Cambio Project

![GitHub repo size](https://img.shields.io/github/repo-size/weslemarques/cambio_project?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/weslemarques/cambio_project?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/weslemarques/cambio_project?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/github/issues/weslemarques/cambio_project?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/github/issues-pr/weslemarques/cambio_project?style=for-the-badge)


> Interação entre dois microsserviços para a conversão de preço de produtos.

### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [x] Criação do microsserviço de Cambio
- [x] Criaçâo de toda estrutura basica
- [x] Conexão do banco de dados (Docker)
- [ ] Criação do microsserviço de Books
- [ ] Comunicação do microsserviços como o Server Config
- [ ] Integração entre os  microsserviços

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Você instalou a versão do jdk-17 ou superiores
- Você tem uma máquina `<Windows / Linux / Mac>`.
- Você tem o algum banco de dados ou o Docker instalado


## 🚀 Como criar a instancia do postgreSQL no docker

Comandos para o docker:

```
<docker run -d --name cambio_project -e POSTGRES_PASSWORD=<yourpassword> -e PGDATA=/var/lib/postgresql/data/pgdata -v /custom/mount:/var/lib/postgresql/data -p 5432:5432 -d postgres>

```
Comandos para criar os dois bancos:
```
create database cambio_service
create database book_service
```
