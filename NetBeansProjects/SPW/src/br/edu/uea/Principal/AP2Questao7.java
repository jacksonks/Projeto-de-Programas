package br.edu.uea.principal;
import javax.swing.JOptionPane;

import br.edu.uea.SPW.SupermercadoWeb;

public class AP2Questao7 {

	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		String a = JOptionPane.showInputDialog("Digite a marca a ser pesquisada");

		System.out.println("\n###### ESTOQUE POR MARCA ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		int temp = 0;
		for(int i = 0; i < spw.getEstoque().getProdutos().size();i++){
			if((spw.getEstoque().getProdutos().get(i).getValidade().ehValido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),
					spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia()) == "Sim")&&(
							spw.getEstoque().getProdutos().get(i).getProduto().getMarca().getNome().equals(a))){
				System.out.println(spw.getEstoque().getProdutos().get(i).getProduto().getCodigo()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getGenero().getNome()+"  -  "+
						spw.getEstoque().getProdutos().get(i).getProduto().getMarca().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getPreco()+"  -  "+
						spw.getEstoque().getProdutos().get(i).getValidade().toString(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia())+"  -  "+
						spw.getEstoque().getProdutos().get(i).getValidade().ehValido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia()));
				temp++;
			}
		}
		System.out.println("TOTAL: "+temp+" itens encontrados da marca "+a);
	}

}