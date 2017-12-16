import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Funcionario e = new Engenheiro("Rai", 17800.00f, 789);
		funcionarios.add(e);
		Funcionario m = new Motorista("Jackson", 17500.00f, 123);
		funcionarios.add(m);
		/*Funcionario funcionario = new Engenheiro("Rai", 123);
		funcionarios.add(funcionario);
		Funcionario funcionario2 =  new Motorista("Jackson", 456);
		funcionarios.add(funcionario2);*/
		
		/*Funcionario[] funcionario = new Funcionario[2];
		for(Funcionario func:funcionario){
			if(func instanceof Engenheiro){
				//
			}
			else{
				//
			}
		}*/
		
		for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i) instanceof Engenheiro){
				Engenheiro eng = (Engenheiro) funcionarios.get(i);
				System.out.println("Engenheiro : " + eng.getNome());
				System.out.println("CREA : " + eng.getCrea() + "\n");
			}
			else{
				Motorista mot = (Motorista) funcionarios.get(i);
				System.out.println("Motorista : " + mot.getNome());
				System.out.println("CNH : " + mot.getCnh() + "\n");
			}
		}
	}
}