<div align="center">

<p><strong>PORTFÓLIO ACADÊMICO · BANCO DE DADOS</strong></p>

<h1>João Pedro Menegasso</h1>

<p>Desenvolvimento Backend · SquadTech · Fatec São José dos Campos</p>

<p>
  <a href="https://github.com/menegasso0"><img alt="GitHub — menegasso0" src="https://img.shields.io/badge/GitHub-menegasso0-181717?style=flat-square&logo=github&logoColor=white"></a>
  <a href="https://www.linkedin.com/in/joaopedromenegasso/"><img alt="LinkedIn — João Pedro Menegasso" src="https://img.shields.io/badge/LinkedIn-Jo%C3%A3o_Pedro_Menegasso-0A66C2?style=flat-square"></a>
</p>

<h2>IPEM Control</h2>

<p>Sistema de Controle e Análise de Abastecimento de Viaturas<br><strong>API-3 · 1º semestre de 2026</strong></p>

<p>
  <img alt="Java" src="https://img.shields.io/badge/Java-E76F00?style=flat-square">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
  <img alt="MySQL" src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white">
  <img alt="API REST" src="https://img.shields.io/badge/API_REST-334155?style=flat-square">
</p>

<p>
  <a href="#sobre-mim">Sobre mim</a> ·
  <a href="#projeto">Projeto</a> ·
  <a href="#tecnologias">Tecnologias</a> ·
  <a href="#contribuicoes">Contribuições</a> ·
  <a href="#habilidades">Habilidades</a> ·
  <a href="#equipe">Equipe</a> ·
  <a href="#documentacao">Documentação</a>
</p>

</div>

---

<a id="sobre-mim"></a>

## 01 · Sobre mim

Sou João Pedro Menegasso, integrante da equipe SquadTech no projeto API-3 do curso de Banco de Dados da Fatec São José dos Campos. Atuei no desenvolvimento backend do IPEM Control, utilizando Java e Spring Boot para implementar funcionalidades relacionadas a usuários, viaturas, abastecimentos, ordens de serviço e relatórios. No histórico do backend, minhas contribuições aparecem com a assinatura JPM1.

### Contatos

- **GitHub:** [menegasso0](https://github.com/menegasso0)
- **LinkedIn:** [João Pedro Menegasso](https://www.linkedin.com/in/joaopedromenegasso/)

### Principais conhecimentos

Minha atuação no projeto envolveu Java, Spring Boot, APIs REST, entidades JPA, DTOs, repositórios, serviços e controllers. Também trabalhei com persistência e consultas em MySQL, proteção de senhas com BCrypt, recebimento de arquivos e exportação de relatórios em PDF, CSV, Excel e Word (DOCX).

---

<a id="projeto"></a>

## 02 · O projeto

> **IPEM Control** reúne registros de abastecimento e uso das viaturas para apoiar o acompanhamento da frota.

| Informação | Descrição |
|---|---|
| Curso | Banco de Dados |
| Instituição | Fatec São José dos Campos |
| Equipe | SquadTech |
| Projeto | Aprendizagem por Projetos Integrados — API-3 |
| Organização parceira | IPEM — Regional de São José dos Campos |
| Período de referência | Primeiro semestre de 2026, conforme o cronograma publicado |
| Repositório | [SquadTech-API/API-3](https://github.com/SquadTech-API/API-3) |

### Problema

O controle de abastecimento das viaturas da Regional de São José dos Campos dependia de registros manuais em pranchetas mantidas nos veículos. Os condutores anotavam dados como quilometragem, quantidade de combustível, valor do abastecimento e identificação do responsável. Depois, o diretor precisava reunir e conferir essas informações para consolidá-las e inseri-las no SGI.

Esse processo dificultava a consulta ao histórico, a comparação entre veículos e a identificação de inconsistências. A necessidade de reunir informações dispersas também tornava a conferência e o acompanhamento do consumo mais trabalhosos.

### Solução entregue pela equipe

Nossa equipe desenvolveu o **IPEM Control**, um sistema web voltado à organização dos registros de abastecimento e da utilização das viaturas. A proposta reúne o lançamento digital das informações pelos condutores, a conferência gerencial e a produção de relatórios para apoiar o acompanhamento da frota.

O repositório disponibiliza documentação, protótipos, modelos de banco de dados e links para demonstrações das sprints. O objetivo é facilitar a consolidação mensal e dar maior visibilidade aos dados usados pela gestão.

#### Funcionalidades e dados do sistema

| Área | Descrição |
|---|---|
| Abastecimentos | Registro de data, combustível, quilometragem, litros, valor e informações do posto, com campos para nota fiscal e imagem. |
| Veículos | Cadastro com placa, prefixo, modelo, marca, ano, combustível, quilometragem e disponibilidade. |
| Usuários | Dados dos colaboradores, situação de atividade e distinção entre os tipos administrador e técnico. |
| Saídas e retornos | Vínculo entre veículo, usuário e serviço, com destino, horários, quilometragens e situação da saída. |
| Trocas de óleo | Registro da quilometragem da troca e da próxima troca, associado a uma saída. |
| Documentos | Associação de arquivos às saídas e registros de acesso dos usuários. |
| Gestão | Validação gerencial e relatórios analíticos descritos como objetivos do projeto. |

Os campos e relacionamentos acima estão presentes no [modelo físico do banco de dados](https://github.com/SquadTech-API/API-3/blob/main/docs_BD/modelo_Fisico/IPEM_Control_modelo_fisico.sql).

---

<a id="tecnologias"></a>

## 03 · Tecnologias e desenvolvimento

| Tecnologia ou ferramenta | Aplicação no projeto |
|---|---|
| Java e Spring Boot | Desenvolvimento do backend. |
| Maven | Construção do projeto e gerenciamento de dependências do backend. |
| HTML5, CSS3 e JavaScript | Desenvolvimento das interfaces web. |
| SQL / MySQL | Modelagem e definição do banco relacional; o script utiliza sintaxe MySQL, tabelas InnoDB, índices e triggers. |
| IntelliJ IDEA e Visual Studio Code | Ambientes de desenvolvimento. |
| Postman | Envio e inspeção de requisições ao backend. |
| Figma, Canva e Icons8 | Prototipação e recursos visuais das interfaces. |
| GitHub, GitHub Projects e GitHub Desktop | Versionamento, organização do trabalho e colaboração. |
| Google Drive, Excel, Discord e Slack | Ferramentas de apoio à documentação, organização e comunicação. |

Fontes: [README da equipe](https://github.com/SquadTech-API/API-3/blob/main/README.md) e [script SQL](https://github.com/SquadTech-API/API-3/blob/main/docs_BD/modelo_Fisico/IPEM_Control_modelo_fisico.sql).

### Banco de dados e integridade das informações

O modelo físico organiza o domínio em nove tabelas: `veiculo`, `usuario`, `tipo_servico`, `veiculo_servico`, `registro_saida`, `troca_oleo`, `abastecimento`, `documento` e `usuario_documento`.

A tabela `registro_saida` conecta o uso de uma viatura a um usuário e a um tipo de serviço. Abastecimentos, trocas de óleo e documentos se relacionam com essa saída, permitindo contextualizar os registros operacionais.

O script inclui chaves estrangeiras e restrições de unicidade, como as aplicadas à placa e ao e-mail. Também define verificações para impedir litros ou valores de abastecimento não positivos, quilometragem final inferior à inicial e retorno anterior à saída. Há triggers destinadas a rejeitar uma nova saída sem retorno quando o veículo já possui outra nessa condição. Essas regras ajudam a manter a consistência dos registros da frota.

### Organização do desenvolvimento

O projeto foi organizado em três sprints. A documentação reúne backlog, burndown e mapeamentos de tarefas, além de materiais sobre critérios de conclusão, preparação das atividades, branches e commits.

| Etapa | Período publicado | Documentação |
|---|---|---|
| Sprint 1 | 16/03 a 05/04 | [Materiais da Sprint 1](https://github.com/SquadTech-API/API-3/tree/main/docs_por_Sprint/docs_1_Sprint) |
| Sprint 2 | 13/04 a 03/05 | [Materiais da Sprint 2](https://github.com/SquadTech-API/API-3/tree/main/docs_por_Sprint/docs_2_Sprint) |
| Sprint 3 | 11/05 a 31/05 | [Materiais da Sprint 3](https://github.com/SquadTech-API/API-3/tree/main/docs_por_Sprint/docs_3_Sprint) |


---

<a id="contribuicoes"></a>

## 04 · Minhas contribuições

> **Atuação:** desenvolvimento backend, da persistência de dados aos endpoints REST.

Contribuí para a implementação da autenticação e gestão de usuários, da integração e consulta de viaturas, do registro de abastecimentos, do gerenciamento de ordens de serviço e dos sistemas de relatórios diários e de técnicos. Essas entregas envolveram entidades, DTOs, repositórios, serviços e controladores REST, conectando a persistência de dados às funcionalidades disponibilizadas para o frontend.

### 01. Relatórios de técnicos e exportação

**Tarefa:** `A06`

Em 21 de abril de 2026, implementei relatórios gerais e individuais de técnicos, com filtros por período e consolidação de saídas, quilometragem, custos e utilização de veículos. Desenvolvi consultas nos repositórios, estruturas de transferência de dados, regras de negócio e endpoints para consulta e download.

A entrega incluiu exportação em PDF, CSV, Excel e Word (DOCX), permitindo apresentar os dados em diferentes formatos conforme a necessidade de consulta e compartilhamento.

**Evidência:** [Implementação dos relatórios de técnicos e exportação](https://github.com/SquadTech-API/API3_BACKEND/commit/ade3bfd3668914db76fd13e9e924a73d0d434c36).

### 02. Ordens de serviço

**Tarefa:** `A12`

Desenvolvi a estrutura backend das ordens de serviço em cinco commits. A implementação abrangeu entidade JPA, DTOs, repositório, serviço e controller, com vínculo a veículos e tipos de serviço e validação de informações obrigatórias.

Implementei os endpoints `POST /ordens-servico` e `GET /ordens-servico`, destinados ao registro e à consulta das ordens cadastradas.

<details>
<summary><strong>Ver commits desta entrega</strong></summary>

- [Modelagem da entidade de ordem de serviço](https://github.com/SquadTech-API/API3_BACKEND/commit/a07c40349695f9bc065edb4ee3733054b3bb98a0)
- [DTOs de entrada e resposta](https://github.com/SquadTech-API/API3_BACKEND/commit/80927a6f6aa679dc96c4cbec2056b293678a44a8)
- [Repositório de ordens de serviço](https://github.com/SquadTech-API/API3_BACKEND/commit/e5698e2429d53399be57553f6492c7ddb77b9d23)
- [Regras de negócio das ordens de serviço](https://github.com/SquadTech-API/API3_BACKEND/commit/63945bbdea64c3c7b39c501b2a89718f1599ab23)
- [Endpoints de cadastro e consulta](https://github.com/SquadTech-API/API3_BACKEND/commit/f93baba688ac00014b661e933b5403cd24976e8d)

</details>

### 03. Autenticação e usuários

**Tarefa:** `U01`

Participei da estrutura inicial de autenticação e usuários. Implementei controller, service, repository e DTOs, além do endpoint de login, da atualização de senha e do uso de BCrypt para proteção das senhas. Também trabalhei na configuração da conexão da aplicação com o MySQL.

<details>
<summary><strong>Ver commits desta entrega</strong></summary>

- [Estrutura de usuários, login e atualização de senha](https://github.com/SquadTech-API/API3_BACKEND/commit/74bc33bea5bca419528f46c648dafe8d5870c5b9)
- [Configuração da conexão com MySQL](https://github.com/SquadTech-API/API3_BACKEND/commit/33d06cd42f017b91dcd99c0eabfe02de0dd81bf2)
- [Ajustes de usuários e autenticação para integração com a tela](https://github.com/SquadTech-API/API3_BACKEND/commit/c656b994cfc1d2de3ca173cd4003ce6756f5ec4f)

</details>

### 04. Registro de abastecimentos

**Tarefa:** `T03`

Implementei o fluxo inicial de registro e gerenciamento de abastecimentos de viaturas, com DTO, repository, service e controller. Também criei um endpoint para upload de fotos relacionadas às notas fiscais, permitindo receber os arquivos associados aos abastecimentos.

<details>
<summary><strong>Ver commits desta entrega</strong></summary>

- [Registro de abastecimentos e upload de fotos](https://github.com/SquadTech-API/API3_BACKEND/commit/0cd66c605cbf9b52cf92749155ff16cab20250ea)

</details>

### 05. Integração e consulta de viaturas

**Tarefa:** `T01`

Trabalhei na modelagem de entidades relacionadas às viaturas e na disponibilização de informações para o frontend. Implementei uma API de consulta com dados como modelo, prefixo, quilometragem e disponibilidade, conectando os registros do banco às telas do sistema.

<details>
<summary><strong>Ver commits desta entrega</strong></summary>

- [Modelagem das entidades relacionadas às viaturas](https://github.com/SquadTech-API/API3_BACKEND/commit/58fd44d7568c278a93f92e4142d2a5a0c06d9c48)
- [Consulta de informações das viaturas para o frontend](https://github.com/SquadTech-API/API3_BACKEND/commit/f1491f2fb9437df3d4557af5683c9caf0175e8cd)

</details>

### 06. Relatórios diários de atividades

**Tarefa:** `A06`

Desenvolvi uma funcionalidade para consultar as atividades diárias de um técnico. A consulta reúne veículo utilizado, destino, horários de saída e retorno, distância percorrida e totalização da quilometragem do dia. A implementação foi distribuída entre DTOs, consultas ao banco, service e controller.

<details>
<summary><strong>Ver commits desta entrega</strong></summary>

- [DTOs das atividades e do relatório diário](https://github.com/SquadTech-API/API3_BACKEND/commit/bc92ad43185ca05feb39389e0ddfd6c00d6b31b6)
- [Consultas dos registros de saída](https://github.com/SquadTech-API/API3_BACKEND/commit/f3d09c2ce96ab149bc65518cbd65c7ce0dcca5bb)
- [Regras de negócio dos relatórios diários](https://github.com/SquadTech-API/API3_BACKEND/commit/9800d4394523e2b773286420f3b3e5b7fe584680)
- [Endpoint de consulta do relatório diário](https://github.com/SquadTech-API/API3_BACKEND/commit/c781ae1806ceb5b6416323324e2c3006e194f498)

</details>

### Participação no histórico

| Indicador | Valor |
|---|---|
| Repositório | [SquadTech-API/API3_BACKEND](https://github.com/SquadTech-API/API3_BACKEND) |
| Identificação | JPM1 / menegasso0 |
| Branch analisada | `main` |
| Período do histórico consultado | 17/03/2026 a 04/05/2026 |
| Commits atribuídos a JPM1 | 24 |
| Total de commits no recorte | 93 |
| Participação por quantidade de commits | 25,8% |

[Consultar o histórico completo do backend →](https://github.com/SquadTech-API/API3_BACKEND/commits/main/)

Os módulos também receberam contribuições e ajustes de outros integrantes ao longo do projeto. As entregas descritas nesta seção correspondem à minha participação nesse desenvolvimento coletivo.

---

<a id="habilidades"></a>

## 05 · Habilidades desenvolvidas

### Hard Skills

| Habilidade | Aplicação individual no projeto |
|---|---|
| Java e Spring Boot | Desenvolvimento dos módulos de usuários, viaturas, abastecimentos, ordens de serviço e relatórios. |
| APIs REST | Implementação de endpoints para cadastro, consulta, autenticação, upload e download de documentos. |
| JPA e persistência de dados | Modelagem de entidades e organização do acesso aos dados em repositórios. |
| SQL e MySQL | Configuração da conexão com o banco e consultas para relatórios e funcionalidades do sistema. |
| Organização em camadas e DTOs | Separação entre controllers, serviços, repositórios e estruturas de entrada e saída de dados. |
| BCrypt | Aplicação de hash para proteção das senhas no fluxo de usuários. |
| Exportação de relatórios | Geração de documentos em PDF, CSV, Excel e DOCX. |

No projeto, desenvolvi minha capacidade de implementar funcionalidades completas no backend, desde a modelagem das entidades até a disponibilização dos endpoints. A atuação em diferentes módulos ampliou minha experiência com consultas ao banco, regras de negócio e organização do código em camadas. Também pratiquei recursos específicos, como proteção de senhas, upload de imagens e exportação de documentos.

### Soft Skills

**Colaboração:** contribuí com funcionalidades que se conectam ao trabalho de outros integrantes. Na consulta de viaturas, por exemplo, disponibilizei os dados necessários para as telas do frontend. Essa atuação exigiu atenção à integração entre as partes do sistema e ao resultado entregue pela equipe.

**Organização:** trabalhei em diferentes módulos, dividindo as implementações entre entidades, DTOs, repositórios, serviços e controllers. Essa divisão ajudou a estruturar entregas como ordens de serviço e relatórios diários, mantendo responsabilidades distintas em cada camada.

**Resolução de problemas:** nos relatórios de técnicos, trabalhei na consolidação de informações de saídas, quilometragem, custos e utilização dos veículos. Precisei transformar esses dados em consultas e estruturas que atendessem tanto à visualização quanto à exportação dos resultados.

**Aprendizado:** ampliei minha experiência com Java e Spring Boot ao trabalhar em funcionalidades de naturezas diferentes. O desenvolvimento de autenticação, upload de fotos e exportação em múltiplos formatos permitiu aplicar recursos além das operações básicas de cadastro e consulta.

---

<a id="equipe"></a>

## 06 · Equipe

| Integrante | Função publicada |
|---|---|
| Manuela Brito Migri | Scrum Master |
| Ana Letícia Franca | Product Owner |
| Jhonatan Rossi | Desenvolvedor |
| Elder Henrique Silva | Desenvolvedor |
| João Pedro Menegasso | Desenvolvedor  |
| Pedro Henrique Quirino | Desenvolvedor |
| Giovanna Marques Rodrigues | Desenvolvedora |
| Guilherme Valim | Desenvolvedor |

---

<a id="documentacao"></a>

## 07 · Documentação e demonstrações

### Repositórios e materiais

- [Repositório oficial da API-3](https://github.com/SquadTech-API/API-3)
- [Código-fonte do backend](https://github.com/SquadTech-API/API3_BACKEND)
- [Documentação geral, backlog e manuais](https://github.com/SquadTech-API/API-3/tree/main/docs)
- [Modelos e documentação do banco de dados](https://github.com/SquadTech-API/API-3/tree/main/docs_BD)
- [Documentação por sprint](https://github.com/SquadTech-API/API-3/tree/main/docs_por_Sprint)
### Demonstrações

| Etapa | Apresentação |
|:---|:---|
| Sprint 1 | [Administrador](https://www.youtube.com/watch?v=H91QZQpGf2M) · [Técnico](https://www.youtube.com/watch?v=yK_N4FqFcNA) |
| Sprint 2 | [Assistir à demonstração](https://youtu.be/ka2Qvh4ibak) |
| Sprint 3 | [Assistir à demonstração](https://youtu.be/in1fdAIyy78) |

### Referências

- [Modelo de portfólio do TG](https://github.com/laroyprado/Bertoti/tree/main/tg-fatec/tg)
- [Documentação do projeto IPEM Control](https://github.com/SquadTech-API/API-3)
- [Repositório do backend](https://github.com/SquadTech-API/API3_BACKEND)
- [Modelo físico do banco de dados](https://github.com/SquadTech-API/API-3/blob/main/docs_BD/modelo_Fisico/IPEM_Control_modelo_fisico.sql)

---

<div align="center">
  <sub>João Pedro Menegasso · SquadTech · API-3 · 2026</sub>
</div>
