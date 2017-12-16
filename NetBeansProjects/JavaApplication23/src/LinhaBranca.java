public abstract class LinhaBranca extends Eletrodomestico {
	public LinhaBranca(int voltagem, double preco) {
		super(voltagem, preco);
	}

	@Override
	public void ligar() {
		System.out.println("ED linha branca ligado");
	}

	@Override
	public void desligar() {
		System.out.println("ED liha branca desligado");
	}
}