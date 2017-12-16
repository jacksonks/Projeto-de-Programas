
public abstract class Eletrodomestico {
	private int voltagem;
	private double preco;
	private boolean on_off;
	
	public abstract void ligar();
	public abstract void desligar();
	
	public Eletrodomestico(int voltagem, double preco) {
		this.voltagem = voltagem;
		this.preco = preco;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean isOn_off() {
		return on_off;
	}
	
	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}
}
