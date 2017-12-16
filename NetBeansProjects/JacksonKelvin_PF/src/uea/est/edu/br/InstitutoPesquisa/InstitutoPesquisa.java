package uea.est.edu.br.InstitutoPesquisa;

import java.util.ArrayList;
import uea.est.edu.br.Alocacao.Alocacao;
import uea.est.edu.br.Pesquisador.Pesquisador;
import uea.est.edu.br.Projeto.Projeto;

public class InstitutoPesquisa {

public void IniciaInstituto {
    ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();
    pesquisadores.add(new Pesquisador("robo domestico", 100000.0, 48, 11,01,2007));
    pesquisadores.add(new Pesquisador("motor a vento", 200000.0, 15, 02,03,2007));
                
    ArrayList<Projeto> projetos = new ArrayList<Projeto>();
    projetos.add(new Projeto(11, "cascão", 1000.0, Senior));
}     
}

