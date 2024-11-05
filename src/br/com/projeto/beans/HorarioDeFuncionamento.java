package br.com.projeto.beans;

public class HorarioDeFuncionamento {
    private Estacao estacao;
    private String horarioAbertura;
    private String horarioFechamento;

    public HorarioDeFuncionamento(Estacao estacao, String horarioAbertura, String horarioFechamento) {
        this.estacao = estacao;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
    }

    // Getters e Setters
    public Estacao getEstacao() {
        return estacao;
    }

    public String getHorarioAbertura() {
        return horarioAbertura;
    }

    public String getHorarioFechamento() {
        return horarioFechamento;
    }
}

