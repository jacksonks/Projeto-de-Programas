
public class Ventilador extends Eletrodomestico {
	public Ventilador(int voltagem, double preco) {
		super(voltagem, preco);
	}

	@Override
	public void ligar() {
		super.setOn_off(true);
		System.out.println("Ventilador ligado");
	}

	@Override
	public void desligar() {
		super.setOn_off(false);
		System.out.println("Ventilador desligado");
	}

}