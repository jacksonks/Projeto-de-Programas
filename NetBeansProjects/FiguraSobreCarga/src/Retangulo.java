public class Retangulo extends FiguraGeometrica{
	
	public Retangulo(){}
	
	public Retangulo(float base, float altura){
		super(base, altura);
	}
	
	public void calcularArea(){
		super.setArea(super.getBase()*super.getAltura());
	}
	
	public void calcularArea(float base, float altura){
		super.setArea(base*altura);
	}
}