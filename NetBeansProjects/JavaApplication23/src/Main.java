public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao tv = new Televisao(220, 500);
		Ventilador v = new Ventilador(110, 50);
		Geladeira g = new Geladeira(220, 1000);
		Fogao f = new Fogao(110, 420);
		
		tv.ligar();
		v.ligar();
		g.ligar();
		f.ligar();
	}

}