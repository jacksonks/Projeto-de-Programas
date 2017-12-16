package uea.est.edu.br.Projeto;

import javafx.scene.chart.PieChart.Data;

public class Projeto {
	private String Nome;
	private int Duracao;
        private Data DataInico;
        private double Custo;
	
	public Projeto(String nome, int duracao, Data DataInicio ,double custo ){
            this.Nome = Nome;
            this.Duracao = Duracao;
            this.DataInico = DataInicio;
            this.Custo = Custo;
                
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int getDuracao() {
		return Duracao;
	}

	public void setDuracao(int Duracao) {
		this.Duracao = Duracao;
	}
        
       	public double getCusto() {
		return Custo;
	}

	public void setCusto(double Custo) {
		this.Custo = Custo;
	}
}