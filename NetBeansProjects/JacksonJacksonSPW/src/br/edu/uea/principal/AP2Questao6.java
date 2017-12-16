package br.edu.uea.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.edu.uea.carrinho.Carrinho;
import br.edu.uea.itemProduto.ItemProduto;
import br.edu.uea.spw.SupermercadoWeb;

public class AP2Questao6 {


	public static void main(String[] args) {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();
		ArrayList<Carrinho> carrinho = new ArrayList<Carrinho>();
		carrinho.add(new Carrinho());

		ArrayList<ItemProduto> itensEstoqueAux = new ArrayList<ItemProduto>();
		Random gerador = new Random();

		for (ItemProduto item2 : spw.getEstoque().getItens()) {
			if(item2.valido(item2.getValidade().getAno(),
					item2.getValidade().getMes(), item2.getValidade().getDia())){
				itensEstoqueAux.add(item2);
			}
		}
		int k = gerador.nextInt(itensEstoqueAux.size()-1);

		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i < itensEstoqueAux.size()-1; i++) { //Sequencia de 0 ao tamanho da lista
			numeros.add(i);
		}
		//Embaralhamos os números:
		Collections.shuffle(numeros);

		for(int i = 0; i < k;i++){
			ItemProduto temp3 = itensEstoqueAux.get(numeros.get(i));
			carrinho.get(0).adicionaItem(temp3,spw.getEstoque());
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
