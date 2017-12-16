package uea.est.edu.br.Pesquisador;

import uea.est.edu.br.Projeto.Projeto;

public abstract class Pesquisador {
        protected String Nome;
	protected int Matricula;
	protected double SalarioBase;
        protected double SalarioBruto;
	protected String Categoria;
	
	public abstract void CalculaSalario();
	
	public Pesquisador(String Nome, int Matricula, double SalarioBase,double SalarioBruto, String Categoria) {
		this.Nome = Nome;
		this.Matricula = Matricula;
                this.SalarioBase = SalarioBase;
		this.SalarioBruto = SalarioBruto;
                this.Categoria = Categoria;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public int getMatricula() {
		return Matricula;
	}
	
	public void setMatricula(int Matricula) {
		this.Matricula = Matricula;
	}
        
       	public double getSalarioBase() {
		return Matricula;
	}
	
	public void setSalarioBase(double SalarioBase) {
		this.SalarioBase = SalarioBase;
	}
	public double getSalarioBruto() {
		return SalarioBruto;
	}        
}