package com.metrohelper;

import java.util.Scanner;

public class SistemaCPTM {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nMenu Principal");
            System.out.println("1 - Consultar caminho mais curto");
            System.out.println("2 - Informações sobre lotação de trens");
            System.out.println("3 - Dúvidas frequentes");
            System.out.println("4 - Encerrar atendimento");

            String opcao = scanner.nextLine();

            while (!opcao.matches("[1-4]")) {
                System.out.println("\nOpção inválida. Escolha uma opção entre 1 e 4.");
                opcao = scanner.nextLine();
            }

            switch (opcao) {
                case "1":
                    Caminho.consultarCaminho();  // Chama o método na classe Caminho
                    break;
                case "2":
                    Lotacao.duvidaLotacao();
                    break;
                case "3":
                    DuvidasFrequentes.duvidasFrequentes();
                    break;
                case "4":
                    encerrar();
                    break;
            }
        }
    }

    public static void encerrar() {
        System.out.println("\nAtendimento Encerrado.");
        System.exit(0);
    }
}


