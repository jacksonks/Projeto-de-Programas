
public class FiguraGeometrica {

	private float base;
	private float altura;
	private float area;
	
	public FiguraGeometrica(){
	}
	
	public FiguraGeometrica(float base, float altura){
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea(){
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
}
