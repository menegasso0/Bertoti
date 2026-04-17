Endpoints da API

Abaixo estão as rotas disponíveis na aplicação:
1. Listar Produtos

    Método: GET

    URL: /api/produtos

    Descrição: Retorna uma lista com todos os produtos cadastrados.

2. Buscar Produto por ID

    Método: GET

    URL: /api/produtos/{id}

    Descrição: Retorna os detalhes de um produto específico.

3. Cadastrar Produto

    Método: POST

    URL: /api/produtos

    Corpo da Requisição (JSON):

4. Atualizar Produto

    Método: PUT

    URL: /api/produtos/{id}

    Descrição: Atualiza os dados de um produto existente baseado no ID informado.

5. Excluir Produto

    Método: DELETE

    URL: /api/produtos/{id}

    Descrição: Remove o produto do banco de dados.

Como Executar

Clone o repositório ou copie os arquivos para sua máquina.
Atualize as dependências do Maven no seu ambiente de desenvolvimento.
Configure o acesso ao MySQL no arquivo de propriedades.
Execute a classe Projeto1Application.java.
A API estará disponível em http://localhost:8080.
