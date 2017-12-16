public class Motorista extends Funcionario {
	
	private int cnh;
	
	public Motorista(){
		
	}
	
	public Motorista(String nome, float salario, int cnh){
		super(nome, salario);
		this.cnh = cnh;
	}
	
	public int getCnh(){
		return cnh;
	}
	
	public void setCnh(int cnh){
		this.cnh = cnh;
	}
}