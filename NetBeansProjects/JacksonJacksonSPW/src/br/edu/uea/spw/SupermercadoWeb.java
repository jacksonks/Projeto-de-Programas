package br.edu.uea.spw;

import java.util.ArrayList;

import br.edu.uea.carrinho.Carrinho;
import br.edu.uea.data.Data;
import br.edu.uea.estoque.Estoque;
import br.edu.uea.genero.Achocolotado;
import br.edu.uea.genero.Genero;
import br.edu.uea.genero.Leite;
import br.edu.uea.genero.Presunto;
import br.edu.uea.itemProduto.ItemProduto;
import br.edu.uea.marca.Marca;
import br.edu.uea.produto.Produto;

public class SupermercadoWeb {
	ArrayList<Genero> generos = new ArrayList<Genero>();
	ArrayList<Marca> marcas = new ArrayList<Marca>();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	ArrayList<Data> datas = new ArrayList<Data>();
	ArrayList<ItemProduto> itens = new ArrayList<ItemProduto>();
	ArrayList<Estoque> estoques = new ArrayList<Estoque>();
	Estoque estoque;
	Carrinho carrinho;
	
	
	public ArrayList<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(ArrayList<Marca> marcas) {
		this.marcas = marcas;
	}
	
	public ArrayList<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(ArrayList<Genero> generos) {
		this.generos = generos;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}	
	public ArrayList<Estoque> getEstoques() {
		return estoques;
	}
	public void setEstoques(ArrayList<Estoque> estoques) {
		this.estoques = estoques;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoques(Estoque estoque) {
		this.estoque = estoque;
	}
	public ArrayList<ItemProduto> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemProduto> itens) {
		this.itens = itens;
	}
	public ArrayList<Data> getDatas() {
		return datas;
	}
	public void setDatas(ArrayList<Data> datas) {
		this.datas = datas;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public void iniciaSupermercado(){
		Genero leite = new Leite("leite");
		Genero presunto = new Presunto("presunto");
		Genero achocolatado = new Achocolotado("achocolatado");
		generos.add( leite );
		generos.add( presunto );
		generos.add( achocolatado );


		Marca itambe = new Marca("Itambé");
		Marca nestle = new Marca("Nestlê");
		Marca tradicao = new Marca("Tradição");
		Marca sadia = new Marca("Sadia");
		Marca perdigao = new Marca("Perdigão");
		Marca seara = new Marca ("Seara");
		Marca nescau = new Marca ("Nescau");
		Marca nesquik = new Marca ("Nesquik");
		Marca toddy = new Marca ("Toddy");
		marcas.add( itambe ); 
		marcas.add( nestle ); 
		marcas.add( tradicao );
		marcas.add( sadia ); 
		marcas.add( perdigao ); 
		marcas.add( seara );
		marcas.add( nescau ); 
		marcas.add( nesquik );
		marcas.add( toddy );

		Produto leiteNinho = new Produto(1,      "LeiteNinho**************", 7.55f, nestle, leite); produtos.add(leiteNinho);
		Produto leiteMolico = new Produto(2,     "Leite Molico************", 3.23f, nestle, leite); produtos.add(leiteMolico);
		Produto leiteVida = new Produto(3,        "Leite Vida**************", 4.20f, tradicao, leite); produtos.add(leiteVida);
		Produto leiteEmLataIta = new Produto(4,   "Leite em lata Itambé****", 10.0f,itambe, leite); produtos.add(leiteEmLataIta);
		Produto leiteEmPoIta = new Produto(5,     "Leite em pó Itambé******", 5.20f, itambe, leite); produtos.add(leiteEmPoIta);
		Produto leiteCondesadoIta = new Produto(6,"Leite condens Itambé****", 2.50f, itambe, leite); produtos.add(leiteCondesadoIta);
		Produto leiteEmPoNes = new Produto(7,     "Leite em pó Nestlê******", 5.20f, nestle, leite); produtos.add(leiteEmPoNes);
		Produto LeiteEmLataNes = new Produto(8, "Leite lata Nestlê*******", 11.00f, nestle, leite); produtos.add(LeiteEmLataNes);
		Produto leiteCondesadoNes = new Produto(9,"Leite condens Nestlê****", 2.50f, nestle, leite); produtos.add(leiteCondesadoNes);
		Produto leiteEmCaixaTrad = new Produto(10, "Leite em caixa Tradição", 4.80f, tradicao, leite); produtos.add(leiteEmCaixaTrad);

		Produto presuntoPerdigao1 = new Produto(11, "Presunto Perdigão 1****", 5.00f, perdigao, presunto);produtos.add(presuntoPerdigao1);
		Produto presuntoPerdigao2 = new Produto(12, "Presunto Perdigão 2****", 5.30f, perdigao, presunto);produtos.add(presuntoPerdigao2);
		Produto presuntoPerdigao3 = new Produto(13, "Presunto Perdigão 3****", 5.50f, perdigao, presunto);produtos.add(presuntoPerdigao3);
		Produto presuntoPerdigao4 = new Produto(14, "Presunto Perdigão 4****", 6.00f, perdigao, presunto);produtos.add(presuntoPerdigao4);
		Produto presuntoSadia1 = new Produto(15, "Presunto Sadia 1******", 5.10f, sadia, presunto);produtos.add(presuntoSadia1);
		Produto presuntoSadia2 = new Produto(16, "Presunto Sadia 2******", 5.25f, sadia, presunto);produtos.add(presuntoSadia2);
		Produto presuntoSadia3 = new Produto(17, "Presunto Sadia 3******", 5.50f, sadia, presunto);produtos.add(presuntoSadia3);
		Produto presuntoSeara1 = new Produto(18, "Presunto Seara 1******", 4.90f, seara, presunto);produtos.add(presuntoSeara1);
		Produto presuntoSeara2 = new Produto(19, "Presunto Seara 2******", 5.10f, seara, presunto);produtos.add(presuntoSeara2);
		Produto presuntoSeara3 = new Produto(20, "Presunto Seara 3******", 5.30f, seara, presunto);produtos.add(presuntoSeara3);

		Produto achocolatadoNescau1 = new Produto(21, "Achocolatado Nescau 1", 6.00f, nescau, achocolatado);produtos.add(achocolatadoNescau1);
		Produto achocolatadoNescau2 = new Produto(22, "Achocolatado Nescau 2", 6.10f, nescau, achocolatado);produtos.add(achocolatadoNescau2);
		Produto achocolatadoNescau3 = new Produto(23, "Achocolatado Nescau 3", 6.30f, nescau, achocolatado);produtos.add(achocolatadoNescau3);
		Produto achocolatadoNescau4 = new Produto(24, "Achocolatado Nescau 4", 6.50f, nescau, achocolatado);produtos.add(achocolatadoNescau4);
		Produto achocolatadoNesquik1 = new Produto(25, "Achocolatado Nesquik 1", 5.80f, nesquik, achocolatado);produtos.add(achocolatadoNesquik1);
		Produto achocolatadoNesquik2 = new Produto(26, "Achocolatado Nesquik 2", 6.20f, nesquik, achocolatado);produtos.add(achocolatadoNesquik2);
		Produto achocolatadoNesquik3 = new Produto(27, "Achocolatado Nesquik 3", 6.40f, nesquik, achocolatado);produtos.add(achocolatadoNesquik3);
		Produto achocoladoToddy1 = new Produto(28, "Achocolatado Toddy 1", 5.50f, toddy, achocolatado);produtos.add(achocoladoToddy1);
		Produto achocolatadoToddy2 = new Produto(29, "Achocolatado Toddy 2", 5.70f, toddy, achocolatado);produtos.add(achocolatadoToddy2);
		Produto achocolatadoToddy3 = new Produto(30, "Achocolatado Toddy 3", 6.00f, toddy, achocolatado);produtos.add(achocolatadoToddy3);


		//Inserindo algumas datas

		Data data6 = new Data(12, 3-1, 2015);
		datas.add(data6);
		Data data7 = new Data(29, 8-1, 2016);
		datas.add(data7);
		Data data8 = new Data(29, 1-1, 2016);
		datas.add(data8);
		Data data9 = new Data(12, 6-1, 2016);
		datas.add(data9);
		Data data10 = new Data(29, 8-1, 2016);
		datas.add(data10);
		Data data11 = new Data(29, 1-1, 2016);
		datas.add(data11);

		//Inserindo datas nos itemProdutos


		ItemProduto item1 = new ItemProduto(11,datas.get(1),getProduto(1));
		itens.add(item1);
		ItemProduto item2 = new ItemProduto(12,datas.get(0),getProduto(2));
		itens.add(item2);
		ItemProduto item3 = new ItemProduto(13,datas.get(0),getProduto(3));
		itens.add(item3);
		ItemProduto item4 = new ItemProduto(14,datas.get(2),getProduto(4));
		itens.add(item4);
		ItemProduto item5 = new ItemProduto(15,datas.get(1),getProduto(5));
		itens.add(item5);
		ItemProduto item6 = new ItemProduto(16,datas.get(1),getProduto(6));
		itens.add(item6);
		ItemProduto item7 = new ItemProduto(17,datas.get(2),getProduto(7));
		itens.add(item7);
		ItemProduto item8 = new ItemProduto(18,datas.get(1),getProduto(8));
		itens.add(item8);
		ItemProduto item9 = new ItemProduto(19,datas.get(3),getProduto(9));
		itens.add(item9);
		ItemProduto item10 = new ItemProduto(20,datas.get(3),getProduto(10));
		itens.add(item10);
		ItemProduto item11 = new ItemProduto(21,datas.get(4),getProduto(11));
		itens.add(item11);
		ItemProduto item12 = new ItemProduto(22,datas.get(4),getProduto(12));
		itens.add(item12);
		ItemProduto item13 = new ItemProduto(23,datas.get(3),getProduto(13));
		itens.add(item13);
		ItemProduto item14 = new ItemProduto(24,datas.get(0),getProduto(14));
		itens.add(item14);
		ItemProduto item15 = new ItemProduto(25,datas.get(0),getProduto(15));
		itens.add(item15);
		ItemProduto item16 = new ItemProduto(26,datas.get(1),getProduto(16));
		itens.add(item16);
		ItemProduto item17 = new ItemProduto(27,datas.get(1),getProduto(17));
		itens.add(item17);
		ItemProduto item18 = new ItemProduto(28,datas.get(1),getProduto(18));
		itens.add(item18);
		ItemProduto item19 = new ItemProduto(29,datas.get(1),getProduto(19));
		itens.add(item19);
		ItemProduto item20 = new ItemProduto(29,datas.get(1),getProduto(20));
		itens.add(item20);
		ItemProduto item21 = new ItemProduto(30,datas.get(3),getProduto(21));
		itens.add(item21);
		ItemProduto item22 = new ItemProduto(31,datas.get(4),getProduto(22));
		itens.add(item22);
		ItemProduto item23 = new ItemProduto(32,datas.get(2),getProduto(23));
		itens.add(item23);
		ItemProduto item24 = new ItemProduto(33,datas.get(0),getProduto(24));
		itens.add(item24);
		ItemProduto item25 = new ItemProduto(34,datas.get(1),getProduto(25));
		itens.add(item25);
		ItemProduto item26 = new ItemProduto(35,datas.get(3),getProduto(26));
		itens.add(item26);
		ItemProduto item27 = new ItemProduto(36,datas.get(4),getProduto(27));
		itens.add(item27);
		ItemProduto item28 = new ItemProduto(37,datas.get(2),getProduto(28));
		itens.add(item28);
		ItemProduto item29 = new ItemProduto(38,datas.get(0),getProduto(29));
		itens.add(item29);
		ItemProduto item30 = new ItemProduto(39,datas.get(2),getProduto(30));
		itens.add(item30);

		//Inserindo no estoque

		estoques.add(new Estoque());
		
		estoques.get(0).entraItem(itens.get(5));
		estoques.get(0).entraItem(itens.get(6));
		estoques.get(0).entraItem(itens.get(7));
		estoques.get(0).entraItem(itens.get(8));
		estoques.get(0).entraItem(itens.get(9));
		estoques.get(0).entraItem(itens.get(10));
		estoques.get(0).entraItem(itens.get(0));
		estoques.get(0).entraItem(itens.get(1));
		estoques.get(0).entraItem(itens.get(2));
		estoques.get(0).entraItem(itens.get(3));
		estoques.get(0).entraItem(itens.get(4));
		estoques.get(0).entraItem(itens.get(11));
		estoques.get(0).entraItem(itens.get(12));
		estoques.get(0).entraItem(itens.get(13));
		estoques.get(0).entraItem(itens.get(14));		
		estoques.get(0).entraItem(itens.get(18));
		estoques.get(0).entraItem(itens.get(19));
		estoques.get(0).entraItem(itens.get(20));
		estoques.get(0).entraItem(itens.get(21));
		estoques.get(0).entraItem(itens.get(22));
		estoques.get(0).entraItem(itens.get(23));
		estoques.get(0).entraItem(itens.get(15));
		estoques.get(0).entraItem(itens.get(16));
		estoques.get(0).entraItem(itens.get(17));
		estoques.get(0).entraItem(itens.get(24));	
		estoques.get(0).entraItem(itens.get(27));
		estoques.get(0).entraItem(itens.get(28));
		estoques.get(0).entraItem(itens.get(29));
		estoques.get(0).entraItem(itens.get(25));
		estoques.get(0).entraItem(itens.get(26));

		setEstoques(estoques.get(0));

	}

	public ArrayList<Produto> getProdutos(Genero genero){
		ArrayList<Produto> temp1 = new ArrayList<Produto>();
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getGenero().getNome() == genero.getNome()){
				temp1.add(produtos.get(i));
			}			
		}
		return temp1;
	}
	public Produto getProduto(int codigo){
		Produto temp = null;
		for (int i = 0; i < produtos.size();i++){
			if(produtos.get(i).getCodigo() == codigo){
				temp = produtos.get(i);
			}			
		}
		return temp;
	}

}
