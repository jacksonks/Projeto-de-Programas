package uea.est.edu.br.Sub;

import uea.est.edu.br.Pesquisador.Pesquisador;


public class Senior extends Pesquisador {
    private final String S;

    public Senior(String Nome, int Matricula, double SalarioBase, double SalarioBruto, String Categoria) {
        super(Nome, Matricula, SalarioBase, SalarioBruto, Categoria);
        this.S = "Assistente";
    }

    @Override
    public void CalculaSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
