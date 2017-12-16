public class Cliente {
	private int codigo;
	private String nome;
	private Carrinho cart;
	
	public Cliente(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Carrinho getCart() {
		return cart;
	}
	public void setCart(Carrinho cart) {
		this.cart = cart;
	}
}
