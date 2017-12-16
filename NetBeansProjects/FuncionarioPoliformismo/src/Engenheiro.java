public class Engenheiro extends Funcionario{
	
	private int crea;
	
	public Engenheiro(){
		
	}
	
	public Engenheiro(String nome, float salario, int crea){
		super(nome, salario);
		this.crea = crea;
	}
	
	public int getCrea(){
		return crea;
	}
	
	public void setCrea(int crea){
		this.crea = crea;
	}
}