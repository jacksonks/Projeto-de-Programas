package br.edu.uea.principal;

import java.util.ArrayList;

import br.edu.uea.carrinho.Carrinho;
import br.edu.uea.itemProduto.ItemProduto;
import br.edu.uea.spw.SupermercadoWeb;

public class AP2Questao5 {
	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		ArrayList<Carrinho> carrinho = new ArrayList<Carrinho>();
		carrinho.add(new Carrinho());

		ArrayList<ItemProduto> itensEstoqueAux = new ArrayList<ItemProduto>();

		for (ItemProduto item2 : spw.getEstoque().getItens()) {
			itensEstoqueAux.add(item2);
		}

		for(int i = 0; i < itensEstoqueAux.size();i++){			
			if(itensEstoqueAux.get(i).getProduto().getCodigo() % 2 != 0){
				ItemProduto temp3 = itensEstoqueAux.get(i);
				carrinho.get(0).adicionaItem(temp3,spw.getEstoque());
			}
		}
		spw.setCarrinho(carrinho.get(0));
		System.out.println("\n###### ITENS DO CARRINHO ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");

		System.out.println(spw.getCarrinho().getItens1());
		System.out.println("\n\n###### ITENS RESTANTE NO ESTOQUE ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		spw.getEstoque().mostraEstoque();
	}
}


