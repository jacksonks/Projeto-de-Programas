
public class Geladeira extends LinhaBranca {
	public Geladeira(int voltagem, double preco) {
		super(voltagem, preco);
	}

	@Override
	public void ligar() {
		super.setOn_off(true);
		System.out.println("Geladeira ligada");
	}

	@Override
	public void desligar() {
		super.setOn_off(false);
		System.out.println("Geladeira desligada");
	}
}