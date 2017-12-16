
public class Televisao extends Eletrodomestico{
	public Televisao(int voltagem, double preco){
		super(voltagem, preco);
	}
	
	@Override
	public void ligar(){
		super.setOn_off(true);
		System.out.println("Televisao ligada");
	}
	
	@Override
	public void desligar(){
		super.setOn_off(false);
		System.out.println("Televisao desligada");
	}
}