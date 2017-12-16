import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date x;
		x = new Date();
		ContaBancaria contabancaria = new ContaBancaria();
		contabancaria.setNumero(100);
		contabancaria.setSaldo(1000);

		contabancaria.adicionarMovimentacao(100, x, "deposito");
		contabancaria.adicionarMovimentacao(25, x, "saque");
		contabancaria.adicionarMovimentacao(25, x, "saque");

		for (int i = 0; i < contabancaria.getMovimentacao().size();i++){
			System.out.println("Movimentacao "+i+"\n");
			System.out.println("Valor: "+contabancaria.getMovimentacao().get(i).getValor());
			System.out.println("Valor: "+contabancaria.getMovimentacao().get(i).getDescricao());
			System.out.println("Valor: "+contabancaria.getMovimentacao().get(i).getData());
		}
		System.out.println("\n");
		System.out.println("Saldo atual da CC: "+ contabancaria.getSaldo());
	}
}