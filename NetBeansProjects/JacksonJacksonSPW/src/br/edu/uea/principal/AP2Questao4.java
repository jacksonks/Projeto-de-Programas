package br.edu.uea.principal;

import br.edu.uea.spw.SupermercadoWeb;

public class AP2Questao4 {

	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		int vencidos = 0, validos = 0;
		for(int i = 0; i < spw.getEstoque().getProdutos().size();i++){
			if(spw.getEstoque().getProdutos().get(i).valido(spw.getEstoque().getProdutos().get(i).getValidade().getAno(),
					spw.getEstoque().getProdutos().get(i).getValidade().getMes(), spw.getEstoque().getProdutos().get(i).getValidade().getDia())){
				validos++;
			}else{
				vencidos++;
			}
		}

		System.out.println("\n###### ESTOQUE######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		spw.getEstoque().mostraEstoque();
		
		System.out.println("Existem "+validos+" produtos válidos no Estoque!");
		System.out.println("Existem "+vencidos+" produtos vencidos no Estoque!");
		System.out.println("A soma dos produtos válidos e vencidos é "+(validos+vencidos));

	}

}


