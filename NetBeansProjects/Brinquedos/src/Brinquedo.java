public abstract class Brinquedo implements Mobilidade{
	private String cor;
	private float preco;
	
	public Brinquedo(String cor, float preco){
		this.cor = cor;
		this.preco = preco;
	}
	
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
}