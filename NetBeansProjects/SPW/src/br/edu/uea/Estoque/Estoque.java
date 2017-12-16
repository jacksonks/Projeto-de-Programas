package br.edu.uea.Estoque;

import java.util.ArrayList;
import br.edu.uea.ItemProduto.ItemProduto;
import br.edu.uea.SPW.SupermercadoWeb;

public class Estoque {
	private SupermercadoWeb supermercadoWeb;
	private ArrayList<ItemProduto> produtos;
	

	public Estoque(){
		this.produtos = new ArrayList<ItemProduto>();
	}
	public void entraItem(ItemProduto item){
		produtos.add(item);
	}
	public void saiItem(ItemProduto p){
		produtos.remove(p);
	}

	public ArrayList<ItemProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ItemProduto> produtos) {
		this.produtos = produtos;
	}


	public ArrayList<ItemProduto> getEstoque() {
		return produtos;
	}
	public void setEstoque(ArrayList<ItemProduto> estoque) {
		this.produtos = estoque;
	}
	
	public SupermercadoWeb getSupermercadoWeb() {
		return supermercadoWeb;
	}
	public void setSupermercadoWeb(SupermercadoWeb supermercadoWeb) {
		this.supermercadoWeb = supermercadoWeb;
	}
	public void mostraEstoque(){
		for (int i = 0; i < produtos.size();i++){
			System.out.println(produtos.get(i).getProduto().getCodigo()+"  -  "+produtos.get(i).getProduto().getNome()+"  -  "+produtos.get(i).getProduto().getGenero().getNome()+"  -  "+
					produtos.get(i).getProduto().getMarca().getNome()+"  -  "+produtos.get(i).getProduto().getPreco()+"  -  "+
					produtos.get(i).getValidade().toString(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia())+"  -  "+
					produtos.get(i).getValidade().ehValido(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia()));

		}
		System.out.println("\nTOTAL: "+produtos.size()+" itens no estoque");
	}
	/*public void mostraEstoqueG(){
		for (int j = 0; j < supermercadoWeb.getGeneros().size();j++){
			int temp = 0;
			for (int i = 0; i < produtos.size();i++){
				if(supermercadoWeb.getGeneros().get(j).getNome() == produtos.get(i).getProduto().getGenero().getNome()){
					System.out.println(produtos.get(i).getProduto().getCodigo()+"  -  "+produtos.get(i).getProduto().getNome()+"  -  "+produtos.get(i).getProduto().getMarca().getNome()+"  -  "+
							produtos.get(i).getProduto().getGenero().getNome()+"  -  "+
							produtos.get(i).getValidade().toString(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia())+"  -  "+
							produtos.get(i).getValidade().ehValido(produtos.get(i).getValidade().getAno(),produtos.get(i).getValidade().getMes(), produtos.get(i).getValidade().getDia()));
					temp++;
				}
			}
			System.out.println("Comtém "+temp+" itens no estoque");
		}
		System.out.println("Comtém "+produtos.size()+" itens no estoque");
	}*/


	public ArrayList<ItemProduto> getItens(){
		return produtos;
	}

	public int qtdItens(){
		return 0;

	}
	/*public ArrayList<Estoque> getItens(Marca marca){
		ArrayList<Estoque> temp1 = new ArrayList<Estoque>();
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getProduto().getMarca().getNome() == marca.getNome()){
				temp1.add(produtos.get(i));
			}			
		}
		return temp1;

	}*/

}