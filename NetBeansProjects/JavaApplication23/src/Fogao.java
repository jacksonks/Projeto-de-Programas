
public class Fogao extends LinhaBranca {
	public Fogao(int voltagem, double preco) {
		super(voltagem, preco);
	}

	@Override
	public void ligar() {
		super.setOn_off(true);
		System.out.println("Fogao ligado");
	}

	@Override
	public void desligar() {
		super.setOn_off(false);
		System.out.println("Fogao desligado");
	}
}