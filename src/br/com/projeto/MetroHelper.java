package br.com.projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Estacao {
    private String nome;
    private Map<Estacao, Integer> tempos; // mapa que armazena tempos para outras estações

    public Estacao(String nome) {
        this.nome = nome;
        this.tempos = new HashMap<>();
    }
    public String getNome() {
        return nome;
    }
    public void adicionarTempo(Estacao estacao, int tempo) {
        tempos.put(estacao, tempo);
    }

    public Map<Estacao, Integer> getTempos() {
        return tempos;
    }
}
class LinhaDeTrem {
    private String nome;
    private List<Estacao> estacoes;

    public LinhaDeTrem(String nome) {
        this.nome = nome;
        this.estacoes = new ArrayList<>();
    }
    public void adicionarEstacao(Estacao estacao) {
        estacoes.add(estacao);
    }

    public String getNome() {
        return nome;
    }

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    public void mostrarEstacoes() {
        System.out.println("Estações da " + nome + ":");
        for (Estacao estacao : estacoes) {
            System.out.println(estacao.getNome());
        }
    }

    // Método para calcular o tempo de viagem entre duas estações
    public int calcularTempo(Estacao origem, Estacao destino) {
        if (origem.getTempos().containsKey(destino)) {
            return origem.getTempos().get(destino);
        }
        return -1; // Se a rota não existir
    }
}

class SistemaDeMetro {
    private List<LinhaDeTrem> linhas;

    public SistemaDeMetro() {
        this.linhas = new ArrayList<>();
    }

    public void adicionarLinha(LinhaDeTrem linha) {
        linhas.add(linha);
    }

    public void mostrarLinhas() {
        System.out.println("Linhas disponíveis:");
        for (LinhaDeTrem linha : linhas) {
            System.out.println("- " + linha.getNome());
        }
    }

    // Método para encontrar a melhor rota entre duas estações
    public void encontrarRota(Estacao origem, Estacao destino) {
        for (LinhaDeTrem linha : linhas) {
            if (linha.getEstacoes().contains(origem) && linha.getEstacoes().contains(destino)) {
                int tempo = linha.calcularTempo(origem, destino);
                if (tempo != -1) {
                    System.out.println("Rota encontrada na " + linha.getNome() + ": " +
                            origem.getNome() + " -> " + destino.getNome() +
                            " em " + tempo + " minutos.");
                    return;
                }
            }
        }
        System.out.println("Nenhuma rota encontrada entre " + origem.getNome() + " e " + destino.getNome() + ".");
    }
}

public class MetroHelper {
    public static void main(String[] args) {
                SistemaDeMetro sistema = new SistemaDeMetro();

                LinhaDeTrem linha1 = new LinhaDeTrem("Linha Azul");
                Estacao estacaoA = new Estacao("Estação A");
                Estacao estacaoB = new Estacao("Estação B");
                Estacao estacaoC = new Estacao("Estação C");

                // Adicionando estações à linha
                linha1.adicionarEstacao(estacaoA);
                linha1.adicionarEstacao(estacaoB);
                linha1.adicionarEstacao(estacaoC);

                // Definindo tempos de viagem entre estações
                estacaoA.adicionarTempo(estacaoB, 5); // 5 minutos de A para B
                estacaoB.adicionarTempo(estacaoC, 3); // 3 minutos de B para C
                estacaoA.adicionarTempo(estacaoC, 8); // 8 minutos de A para C (direto)

                sistema.adicionarLinha(linha1);
                sistema.mostrarLinhas();

                // Encontrando a rota entre as estações
                sistema.encontrarRota(estacaoA, estacaoC);
    }
}
