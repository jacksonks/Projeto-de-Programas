public class Triangulo extends FiguraGeometrica{
	
	public Triangulo(){}
	
	public Triangulo(float base, float altura){
		super(base, altura);
	}
	
	public void calcularArea(){
		super.setArea(super.getBase()*super.getAltura()/2);
	}
	
	public void calcularArea(float base, float altura){
		super.setArea(base*altura/2);
	}
}