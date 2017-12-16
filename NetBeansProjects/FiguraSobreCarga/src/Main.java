public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo triangulo = new Triangulo(10, 5);
		triangulo.calcularArea();
		float area = triangulo.getArea();
		System.out.printf("Área do triangulo = " + area + "\n");
		
		triangulo.calcularArea(50, 25);
		area = triangulo.getArea();
		System.out.printf("Área do triangulo = " + area + "\n");
	}
}
