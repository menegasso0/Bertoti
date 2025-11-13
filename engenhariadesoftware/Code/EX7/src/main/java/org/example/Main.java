package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {

            biblioteca.conectar();
            biblioteca.criarTabela();

            try (Scanner sc = new Scanner(System.in)) {
                iniciarLoopPrincipal(sc, biblioteca);
            }

        } catch (Exception e) {
            System.err.println("Erro fatal ao inicializar o sistema: " + e.getMessage());
        }

        System.out.println("Sistema encerrado.");
    }


    private static void iniciarLoopPrincipal(Scanner sc, Biblioteca biblioteca) {
        int opcao = -1; // Inicia com um valor diferente de 0

        do {
            exibirMenu();
            try {

                String input = sc.nextLine();
                opcao = Integer.parseInt(input);

                switch (opcao) {
                    case 1:
                        adicionarNovoLivro(sc, biblioteca);
                        break;
                    case 2:
                        buscarLivro(sc, biblioteca);
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("️ Opção inválida! Tente novamente.");
                }

            } catch (NumberFormatException e) {

                System.out.println("️ Erro: Por favor, digite um número válido.");
                opcao = -1;
            }

        } while (opcao != 0);
    }


    private static void exibirMenu() {
        System.out.println("\n--- BEM VINDO À BIBLIOTECA ---");
        System.out.println("1 - Inserir novo livro");
        System.out.println("2 - Buscar livro");
        System.out.println("0 - Encerrar Sessão");
        System.out.print("Escolha uma opção: ");
    }


    private static void adicionarNovoLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("\n--- Adicionar Novo Livro ---");
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("ISBN: ");
        String isbn = sc.nextLine();


        if (titulo.trim().isEmpty() || autor.trim().isEmpty() || isbn.trim().isEmpty()) {
            System.out.println(" Erro: Todos os campos (Título, Autor, ISBN) são obrigatórios.");
            return;
        }

        Livro novoLivro = new Livro(titulo, autor, isbn);
        biblioteca.addLivro(novoLivro);
        System.out.println(" Livro adicionado com sucesso!");
    }


    private static void buscarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("\n--- Buscar Livro por Título ---");
        System.out.print("Digite o título do livro: ");
        String tituloBusca = sc.nextLine();

        if (tituloBusca.trim().isEmpty()) {
            System.out.println(" Por favor, digite um título para buscar.");
            return;
        }

        Livro encontrado = biblioteca.buscarLivroTitulo(tituloBusca);
        if (encontrado != null) {
            System.out.println("\n Livro encontrado!");
            System.out.println("------------------------");
            System.out.println("Título: " + encontrado.getTitulo());
            System.out.println("Autor: " + encontrado.getAutor());
            System.out.println("ISBN: " + encontrado.getIsbn());
            System.out.println("------------------------");
        } else {
            System.out.println("️ Nenhum livro encontrado com o título '" + tituloBusca + "'.");
        }
    }
}