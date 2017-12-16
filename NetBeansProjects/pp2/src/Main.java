import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		final int TOTAL_CARRINHOS = 100;
		final int TOTAL_PRODUTOS = 100;

		Cliente cliente = new Cliente(1, "Jackson");

		ArrayList<Carrinho> carrinhos = new ArrayList<Carrinho>(TOTAL_CARRINHOS);
		carrinhos.add(new Carrinho(0));


		ArrayList<ItemProduto> produtos = new ArrayList<ItemProduto>(TOTAL_PRODUTOS);
		produtos.add(new ItemProduto("p01","Açucar","alimenticio",2));
		produtos.add(new ItemProduto("p01","Café","alimenticio",3));
		produtos.add(new ItemProduto("p01","Carne","alimenticio",15));

		ItemProduto produto = produtos.get(0);
		ItemProduto produto1 = produtos.get(1);
		ItemProduto produto2 = produtos.get(2);


		carrinhos.get(0).adicionarItem(produto);
		carrinhos.get(0).adicionarItem(produto1);
		carrinhos.get(0).adicionarItem(produto2);	

		cliente.setCart(carrinhos.get(0));

		cliente.getCart().mostrarItens();

		int x=0,y=0;
		String item = "Soma total dos produtos: ";
		y = cliente.getCart().somarItem(x);
		item += y;
		JOptionPane.showMessageDialog(null, item);

		cliente.getCart().buscarItem("Carne");

		cliente.getCart().removerItem(carrinhos.get(0).getProdutos().get(1));

		cliente.getCart().mostrarItens();

		String s = "Valor da compra fechada: \n";
		item = cliente.getCart().fecharCompra(s);
		JOptionPane.showMessageDialog(null, item);

	}
}
