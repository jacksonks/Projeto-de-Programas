import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		int x, y,z;

		String valor = JOptionPane.showInputDialog("Digite o valor do primeiro número: ");		
		try
		{		
			x = Integer.parseInt(valor);
			valor = JOptionPane.showInputDialog("Digite o valor do segundo número: ");
			y = Integer.parseInt(valor);
			JOptionPane.showMessageDialog(null, "Produto: "+ (x*y));
			JOptionPane.showMessageDialog(null, "Divisao: "+ (x/y));

		}catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "*********Digite um float*********");
		}catch(ArithmeticException e)
		{
			JOptionPane.showMessageDialog(null, "*********Divisão por zero*********");

		}finally
		{
			JOptionPane.showMessageDialog(null, "*********Final da execução*********");
		}
		/*String valores = "----------Valores--------\n";
		valores+= x+" "+y;
		JOptionPane.showMessageDialog(null, valores);*/


		/*
		String frase = null;
		String novaFrase = null;

		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			//Tratamento da exceção
			System.out.println("Foi atribuido um valor default");
			frase = "Frase vazia";

		}
		finally
		{
			novaFrase= frase.toUpperCase();
		}
		System.out.println("Frase antiga: "+frase);
		System.out.println("Nova frase: "+novaFrase);*/
	}
}