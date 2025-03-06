import java.util.*;

public class SistemaCPTM {

    // Função principal
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMenu Principal");
        System.out.println("1 - Consultar caminho mais curto");
        System.out.println("2 - Informações sobre lotação de trens");
        System.out.println("3 - Dúvidas frequentes");
        System.out.println("4 - Encerrar atendimento");

        String opcao = scanner.nextLine();

        // Tratamento de erro
        while (!opcao.matches("[1-4]")) {
            System.out.println("\nOpção inválida. Escolha uma opção entre 1 e 4.");
            opcao = scanner.nextLine();
        }

        switch (opcao) {
            case "1":
                consultarCaminho();
                break;
            case "2":
                duvidaLotacao();
                break;
            case "3":
                duvidasFrequentes();
                break;
            case "4":
                encerrar();
                break;
        }
    }

    public static void consultarCaminho() {
        Scanner scanner = new Scanner(System.in);

        // Definindo o grafo com todas as informações das estações
        Map<String, Map<String, Integer>> grafo = new HashMap<>();
        grafo.put("Estacao1", Map.of("Estacao2", 10, "Estacao3", 15, "Estacao4", 20));
        grafo.put("Estacao2", Map.of("Estacao1", 10, "Estacao5", 25));
        grafo.put("Estacao3", Map.of("Estacao1", 15, "Estacao6", 30));
        grafo.put("Estacao4", Map.of("Estacao1", 20, "Estacao7", 35));
        grafo.put("Estacao5", Map.of("Estacao2", 25, "Estacao8", 40));
        grafo.put("Estacao6", Map.of("Estacao3", 30, "Estacao9", 45));
        grafo.put("Estacao7", Map.of("Estacao4", 35, "Estacao10", 50));
        grafo.put("Estacao8", Map.of("Estacao5", 40, "Estacao11", 55));
        grafo.put("Estacao9", Map.of("Estacao6", 45, "Estacao12", 60));
        grafo.put("Estacao10", Map.of("Estacao7", 50, "Estacao13", 65));
        grafo.put("Estacao11", Map.of("Estacao8", 55, "Estacao14", 70));
        grafo.put("Estacao12", Map.of("Estacao9", 60, "Estacao15", 75));
        grafo.put("Estacao13", Map.of("Estacao10", 65, "Estacao16", 80));
        grafo.put("Estacao14", Map.of("Estacao11", 70, "Estacao17", 85));
        grafo.put("Estacao15", Map.of("Estacao12", 75, "Estacao18", 90));
        grafo.put("Estacao16", Map.of("Estacao13", 80, "Estacao19", 95));
        grafo.put("Estacao17", Map.of("Estacao14", 85, "Estacao20", 100));
        grafo.put("Estacao18", Map.of("Estacao15", 90, "Estacao21", 105));
        grafo.put("Estacao19", Map.of("Estacao16", 95, "Estacao22", 110));
        grafo.put("Estacao20", Map.of("Estacao17", 100, "Estacao23", 115));
        grafo.put("Estacao21", Map.of("Estacao18", 105, "Estacao24", 120));
        grafo.put("Estacao22", Map.of("Estacao19", 110, "Estacao25", 125));
        grafo.put("Estacao23", Map.of("Estacao20", 115, "Estacao26", 130));
        grafo.put("Estacao24", Map.of("Estacao21", 120, "Estacao27", 135));
        grafo.put("Estacao25", Map.of("Estacao22", 125, "Estacao28", 140));
        grafo.put("Estacao26", Map.of("Estacao23", 130, "Estacao29", 145));
        grafo.put("Estacao27", Map.of("Estacao24", 135, "Estacao30", 150));
        grafo.put("Estacao28", Map.of("Estacao25", 140, "Estacao31", 155));
        grafo.put("Estacao29", Map.of("Estacao26", 145, "Estacao32", 160));
        grafo.put("Estacao30", Map.of("Estacao27", 150, "Estacao33", 165));

        System.out.print("\nQual estação você está?\nR: ");
        String origem = scanner.nextLine();

        System.out.print("\nQual estação você quer ir?\nR: ");
        String destino = scanner.nextLine();

        // Encontrar o caminho mais curto
        List<String> caminhoMaisCurto = shortestPath(grafo, origem, destino);

        System.out.println("Caminho mais curto: " + caminhoMaisCurto);
        pergunta();
    }

    public static List<String> shortestPath(Map<String, Map<String, Integer>> grafo, String origem, String destino) {
        // Aqui você implementaria o algoritmo de caminho mais curto (Dijkstra ou outro)
        // Neste exemplo, estamos apenas retornando um caminho fictício
        return Arrays.asList(origem, "Estacao2", destino);
    }

    public static void duvidaLotacao() {
        Random random = new Random();

        // Criação das variáveis de lotação de cada vagão 
        int vag1 = random.nextInt(90) + 10;
        int vag2 = random.nextInt(90) + 10;
        int vag3 = random.nextInt(90) + 10;
        int vag4 = random.nextInt(90) + 10;
        int vag5 = random.nextInt(90) + 10;
        int vag6 = random.nextInt(90) + 10;
        int vag7 = random.nextInt(90) + 10;
        int vag8 = random.nextInt(90) + 10;

        // Criação das variáveis de tempo de chegada do próximo trem
        int tempoChegadaMin = random.nextInt(16);
        int tempoChegadaSeg = random.nextInt(60);

        // Exibição das informações
        System.out.println("\nA lotação de cada vagão é:");
        System.out.println("Vagão 1 = " + vag1 + "%");
        System.out.println("Vagão 2 = " + vag2 + "%");
        System.out.println("Vagão 3 = " + vag3 + "%");
        System.out.println("Vagão 4 = " + vag4 + "%");
        System.out.println("Vagão 5 = " + vag5 + "%");
        System.out.println("Vagão 6 = " + vag6 + "%");
        System.out.println("Vagão 7 = " + vag7 + "%");
        System.out.println("Vagão 8 = " + vag8 + "%");
        System.out.println("\nA chegada do próximo trem está prevista para " + tempoChegadaMin + " minutos e " + tempoChegadaSeg + " segundos");

        pergunta();
    }

    public static void duvidasFrequentes() {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário sobre qual é a sua dúvida
        System.out.println("\nSelecione uma dentre as opções ");
        System.out.println("1- Horário de funcionamento");
        System.out.println("2- Compra de bilhetes");
        System.out.println("3- Frequência de Trens");
        System.out.println("4- Opções de integração");
        System.out.println("5- Atendimento ao Cliente");
        System.out.print("Qual seria sua dúvida?: ");
        String duvida = scanner.nextLine();

        // Tratamento de erro
        while (!duvida.matches("[1-5]")) {
            System.out.println("\nOpção inválida. Por favor, selecione uma das opções.");
            duvida = scanner.nextLine();
        }

        // Exibição das informações de acordo com a opção do cliente
        switch (duvida) {
            case "1":
                System.out.println("\nHorário Geral: Das 4h até às 23:59 \nObservações: \n - Este horário pode ser prolongado em ocasiões especiais \n - Em feriados, este horário pode ser reduzido");
                break;
            case "2":
                System.out.println("\nTarifa: \n - A tarifa é de R$5, mas pode sofrer alteraçõs em casos de reajuste \n\nComo Comprar Passagens:\n - Máquinas Automáticas: Disponíveis em todas as estações, permitem a compra de bilhetes. \n - Bilheteiras: Algumas estações possuem bilheteiras onde você pode comprar passagens diretamente com uma pessoa");
                break;
            case "3":
                System.out.println("\nLinha 7-Rubi: Intervalos de 6 a 15 minutos, dependendo do horário.\nLinha 8-Diamante: Pode variar entre 5 a 12 minutos.\nLinha 9-Esmeralda: Intervalos menores durante o pico, entre 4 e 8 minutos.\nLinha 10-Turquesa: Intervalos variam entre 5 a 12 minutos.\nLinha 11-Coral: Uma das mais movimentadas, com intervalos menores nos horários de pico, cerca de 3 a 6 minutos.\nLinha 12-Safira: Intervalos variam de 5 a 15 minutos, dependendo do horário.\nLinha 13-Jade: Frequência menor, com intervalos que podem chegar a 20 ou 30 minutos, principalmente fora dos horários de pico.");
                break;
            case "4":
                System.out.println("\nBilhete Único: Integração com ônibus municipais da SPTrans e com o Metrô, permitindo combinações entre os meios de transporte pagando uma tarifa reduzida.");
                break;
            case "5":
                System.out.println("\nCentral de Atendimento: Disponível pelo telefone 0800-055-0121, funcionando 24 horas por dia para dúvidas, sugestões ou reclamações.");
                break;
        }
        pergunta();
    }

    public static void encerrar() {
        // Função para encerrar o programa
        System.out.println("\nAtendimento Encerrado.");
        System.exit(0);
    }

    public static void pergunta() {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário informando se deseja algo a mais ou não
        System.out.println("\nPodemos te ajudar com mais alguma coisa?");
        System.out.println("1 - Sim (Voltar ao Menu)");
        System.out.println("2 - Não (Encerrar Atendimento)");
        System.out.print("O que deseja?: ");
        String opcao = scanner.nextLine();

        // Tratamento de erro
        while (!opcao.matches("[1-2]")) {
            System.out.println("\nOpção inválida. Escolha entre 1 ou 2.");
            opcao = scanner.nextLine();
        }

        switch (opcao) {
            case "1":
                menuPrincipal();
                break;
            case "2":
                encerrar();
                break;
        }
    }
}



