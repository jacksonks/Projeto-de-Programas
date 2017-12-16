package br.edu.uea.Principal;

import java.util.ArrayList;
import java.util.Random;

import br.edu.uea.Carrinho.Carrinho;
import br.edu.uea.ItemProduto.ItemProduto;
import br.edu.uea.SPW.SupermercadoWeb;

public class AP2Questao6 {

	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		ArrayList<Carrinho> carrinho = new ArrayList<Carrinho>();
		carrinho.add(new Carrinho());

		ArrayList<ItemProduto> itensEstoqueAux = new ArrayList<ItemProduto>();
		Random gerador = new Random();

		for (ItemProduto item2 : spw.getEstoque().getItens()) {
			if(item2.getValidade().ehValido(item2.getValidade().getAno(),
					item2.getValidade().getMes(), item2.getValidade().getDia()) == "Sim"){
				itensEstoqueAux.add(item2);
			}
		}
		int k = gerador.nextInt(itensEstoqueAux.size());
		for(int i = 0; i < k;i++){
			ItemProduto temp3 = itensEstoqueAux.get(gerador.nextInt(itensEstoqueAux.size()));
			carrinho.get(0).adicionaItem(temp3,spw.getEstoque());
		}
		spw.setCarrinho(carrinho.get(0));

		System.out.println("\n###### ITENS DO CARRINHO ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");

		System.out.println(spw.getCarrinho().getItens());
		System.out.println("\n\n###### ITENS RESTANTE NO ESTOQUE ######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		spw.getEstoque().mostraEstoque();
	}
}