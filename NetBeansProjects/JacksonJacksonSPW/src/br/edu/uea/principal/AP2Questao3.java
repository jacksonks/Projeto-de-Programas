package br.edu.uea.principal;

import br.edu.uea.spw.SupermercadoWeb;

public class AP2Questao3 {

	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();

		System.out.println("\n###### ESTOQUE POR GÊNERO ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		int temp = 0;
		for (int j = 0; j < spw.getGeneros().size();j++){			
			for (int k  = 0; k < spw.getMarcas().size();k++){
				for (int i = 0; i < spw.getEstoque().getProdutos().size();i++){
					if((spw.getGeneros().get(j).getNome() == spw.getEstoque().getProdutos().get(i).getProduto().getGenero().getNome()&&
							spw.getMarcas().get(k).getNome() == spw.getEstoque().getProdutos().get(i).getProduto().getMarca().getNome())&&
							(spw.getEstoque().getProdutos().get(i).getValidade().ehValido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),
									spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia())=="Sim")){
						System.out.println(spw.getEstoque().getProdutos().get(i).getProduto().getCodigo()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getGenero().getNome()+"  -  "+
								spw.getEstoque().getProdutos().get(i).getProduto().getMarca().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getPreco()+"  -  "+
								spw.getEstoque().getProdutos().get(i).getValidade().toString(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia())+"  -  "+
								spw.getEstoque().getProdutos().get(i).getValidade().ehValido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia()));
						temp++;
					}
				}
			}
		}
		System.out.println("TOTAL: "+temp+" itens no estoque");
	}

}
