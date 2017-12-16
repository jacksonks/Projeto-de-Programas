package br.edu.uea.Principal;

import br.edu.uea.SPW.SupermercadoWeb;

public class AP2Questao2 {

	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		
		System.out.println("\n###### ESTOQUE POR GÊNERO ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		
			for (int j = 0; j < spw.getGeneros().size();j++){
				int temp = 0;
				for (int i = 0; i < spw.getEstoque().getProdutos().size();i++){
					if(spw.getGeneros().get(j).getNome() == spw.getEstoque().getProdutos().get(i).getProduto().getGenero().getNome()){
						System.out.println(spw.getEstoque().getProdutos().get(i).getProduto().getCodigo()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getGenero().getNome()+"  -  "+
								spw.getEstoque().getProdutos().get(i).getProduto().getMarca().getNome()+"  -  "+spw.getEstoque().getProdutos().get(i).getProduto().getPreco()+"  -  "+
								spw.getEstoque().getProdutos().get(i).getValidade().toString(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia())+"  -  "+
								spw.getEstoque().getProdutos().get(i).getValidade().ehValido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia()));
						temp++;
					}
				}
				System.out.println("TOTAL GENERO: "+temp+" itens no estoque\n");
			}
			System.out.println("TOTAL: "+spw.getEstoque().getProdutos().size()+" itens no estoque");
		
	}
}