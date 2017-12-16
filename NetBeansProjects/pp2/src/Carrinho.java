import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Carrinho {
	private float totalApagar;
	private ArrayList<ItemProduto> produtos;	
	private int qtdMinProdutos;

	public Carrinho(float totalApagar){
		this.totalApagar = totalApagar;
		this.produtos = new ArrayList<ItemProduto>();
		qtdMinProdutos = 1;
	}

	public void adicionarItem(ItemProduto p){
		produtos.add(p);
	}
	public  void removerItem(ItemProduto p){
		if(produtos.size() > qtdMinProdutos){
			produtos.remove(p);
		}
	}

	public void buscarItem(String temp){
		String item = "Produto: ";
		for (int i = 0; i < produtos.size();i++){
			if (produtos.get(i).getNome().equals(temp)){
				item += "Produto "+ produtos.get(i).getNome()+" valor: "+produtos.get(i).getValor(); 
			}
		}
		JOptionPane.showMessageDialog(null, item);
	}
	public int somarItem(int x){
		for (int i = 0; i < produtos.size();i++){
			x += produtos.get(i).getValor();			
		}
		return x;
	}

	public String fecharCompra(String item){
		for (int i = 0; i < produtos.size();i++){
			totalApagar += produtos.get(i).getValor();			
		}
		item+=totalApagar;
		return item;
	}

	public void mostrarItens(){
		String item = "Lista dos produtos do carrinho: \n";
		for (int i = 0; i < produtos.size();i++){
			item += "Nome: "+produtos.get(i).getNome()+" Preço: "+produtos.get(i).getValor()+"\n";			
		}
		JOptionPane.showMessageDialog(null, item);
	}

	public ArrayList<ItemProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ItemProduto> produtos) {
		this.produtos = produtos;
	}

	public int getQtdMinProdutos() {
		return qtdMinProdutos;
	}

	public void setQtdMinProdutos(int qtdMinProdutos) {
		this.qtdMinProdutos = qtdMinProdutos;
	}

	public float getTotalApagar() {
		return totalApagar;
	}

	public void setTotalApagar(float totalApagar) {
		this.totalApagar = totalApagar;
	}
}
