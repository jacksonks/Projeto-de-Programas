
public class TC {

	public static void main(String[] args) {
		int x = 10, y = 0, z = 0;
		try {
			z =  x/y;
		}
		catch(Exception erro){
			System.out.println(erro.getMessage());
			erro.printStackTrace();
		}
	
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
			novaFrase= frase.toUpperCase();

		}

		System.out.println("Frase antiga: "+frase);
		System.out.println("Nova frase: "+novaFrase);*/

	}
}
