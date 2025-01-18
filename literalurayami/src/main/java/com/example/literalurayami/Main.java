package com.example.literalurayami;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        // Laço de repetição para exibir o menu
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Consultar dados");
            System.out.println("3 - Sair");
            System.out.print("Digite o número da opção desejada: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do Scanner

            switch (opcao) {
                case 1:
                    inserirDados(scanner);
                    break;
                case 2:
                    consultarDados(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;  // Sai da aplicação
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void inserirDados(Scanner scanner) {
        System.out.print("Digite o nome do autor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        // Aqui você pode adicionar a lógica para salvar esses dados no banco de dados
        System.out.println("Dados inseridos: " + nome + " - " + titulo);
    }

    private void consultarDados(Scanner scanner) {
        System.out.print("Digite o nome do autor para consultar: ");
        String nome = scanner.nextLine();

        // Aqui você pode adicionar a lógica para consultar dados no banco de dados
        System.out.println("Consultando dados para o autor: " + nome);
    }
}
