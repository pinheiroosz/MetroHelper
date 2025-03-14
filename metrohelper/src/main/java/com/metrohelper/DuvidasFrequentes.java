package com.metrohelper;

import java.util.Scanner;

public class DuvidasFrequentes {
    public static void duvidasFrequentes() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nSelecione uma dentre as opções ");
            System.out.println("1- Horário de funcionamento");
            System.out.println("2- Compra de bilhetes");
            System.out.println("3- Frequência de Trens");
            System.out.println("4- Opções de integração");
            System.out.println("5- Atendimento ao Cliente");
            System.out.print("Qual seria sua dúvida?: ");
            String duvida = scanner.nextLine();

            while (!duvida.matches("[1-5]")) {
                System.out.println("\nOpção inválida. Por favor, selecione uma das opções.");
                duvida = scanner.nextLine();
            }

            switch (duvida) {
                case "1":
                    System.out.println("\nHorário Geral: Das 4h até às 23:59 \nObservações: \n - Este horário pode ser prolongado em ocasiões especiais \n - Em feriados, este horário pode ser reduzido");
                    break;
                case "2":
                    System.out.println("\nTarifa: \n - A tarifa é de R$5, mas pode sofrer alteraçõs em casos de reajuste \n\nComo Comprar Passagens: \n - Você pode adquirir seu bilhete nas máquinas e nos guichês.");
                    break;
                case "3":
                    System.out.println("\nFrequência de Trens: \n - Nos horários de pico, o intervalo de tempo entre trens é de 3 a 5 minutos \n - Fora do horário de pico, o intervalo pode ser maior.");
                    break;
                case "4":
                    System.out.println("\nIntegrações: \n - Integração com metrô está disponível em várias estações \n - Integrações com ônibus são viáveis em pontos principais.");
                    break;
                case "5":
                    System.out.println("\nAtendimento ao Cliente: \n - Caso precise de mais informações, nossa central de atendimento está disponível 24h.");
                    break;
            }
        }

        
    }
}
