import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author index
 */
public class Main {
	private static ArrayList<ContaCorrente> contasCorrente;
	private static ArrayList<ContaPoupanca> contasPoupanca;

	public static void CriarContaCorrente(){
		ContaCorrente minhaConta;
		String entrada;
		entrada = JOptionPane.showInputDialog("Digite o numero da CCorrente: ");
		int numConta = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor inicial da conta: ");
		double valorConta = Double.parseDouble(entrada);

		minhaConta = new ContaCorrente(numConta, valorConta);
		JOptionPane.showMessageDialog(null, "O número da conta é: "+minhaConta.getNumConta()+
				"\nO Saldo inicial é de: "+minhaConta.getSaldo());
		contasCorrente.add(minhaConta);

		entrada = JOptionPane.showInputDialog("Deseja depositar mais algum valor?");
		double deposito = Double.parseDouble(entrada);
		minhaConta.depositar(deposito);

	}
	public static void ListarContaCorrente(){
		String item = "Lista de Contas Correntes:\n";
		for (int i = 0; i < contasCorrente.size();i++){

			item += "Conta Corrente: "+ contasCorrente.get(i).getNumConta()+"\nSaldo: "+contasCorrente.get(i).getSaldo(); 
		}
		JOptionPane.showMessageDialog(null, item);
	}

	public static void CriarContaPoupanca(){
		ContaPoupanca minhaConta;
		String entrada;
		entrada = JOptionPane.showInputDialog("Digite o numero da CPoupança: ");
		int numConta = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor inicial da conta: ");
		double valorConta = Double.parseDouble(entrada);

		minhaConta = new ContaPoupanca(numConta, valorConta,0.005);
		JOptionPane.showMessageDialog(null, "O número da conta é: "+minhaConta.getNumConta()+
				"\nO Saldo inicial é de: "+minhaConta.getSaldo());
		contasPoupanca.add(minhaConta);

		entrada = JOptionPane.showInputDialog("Deseja depositar mais algum valor?");
		double deposito = Double.parseDouble(entrada);
		minhaConta.depositar(deposito);

	}
	public static void SacarCCorrente(){
		String item = "Status do saque:\n";
		String entrada;
		boolean encontrou = false;
		entrada = JOptionPane.showInputDialog("Digite o numero da CCorrente: ");
		int numConta = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Digite o valor do saque: ");
		double valorSaque = Double.parseDouble(entrada);
		for (int i = 0; i < contasCorrente.size();i++){
			if (numConta == contasCorrente.get(i).getNumConta()){
				contasCorrente.get(i).sacar(valorSaque);
				item += "Conta Corrente: "+ contasCorrente.get(i).getNumConta()+"\nNovo Saldo: "+contasCorrente.get(i).getSaldo();
				encontrou = true;
			}
		}
		if (!encontrou)
			item += "Não foi possível realizar o saque, verifique a conta";
		JOptionPane.showMessageDialog(null, item);

	}

	public static void ListarContaPoupanca(){
		String item = "Lista de Contas Poupança:\n";
		for (int i = 0; i < contasPoupanca.size();i++){

			item += "Conta Poupanca: "+ contasPoupanca.get(i).getNumConta()+"\nSaldo: "+contasPoupanca.get(i).getSaldo()+", com rendimento mensal de $ "+contasPoupanca.get(i).calculaRendimento()+"\n"; 
		}
		JOptionPane.showMessageDialog(null, item);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contasCorrente = new ArrayList<ContaCorrente>();
		contasPoupanca = new ArrayList<ContaPoupanca>();
		String opcao;

		do {
			opcao = JOptionPane.showInputDialog(null,"Informe uma operação:\n [ c ] - Adicionar Conta Corrente\n "
					+ "[ l ] - Listar Conta Corrente\n [ s ] - Sacar Conta Corrente\n [ p ] - Adicionar Poupança\n [ e ] - Listar Poupanças\n "
					+ "[ t ] - Buscar contas a pagar por tipo\n [ r ] - Remover uma conta\n [ f ] - Sair\n");

			if (opcao.charAt(0) == 'c'){
				CriarContaCorrente();

			}else if (opcao.charAt(0) == 'l'){
				ListarContaCorrente();			

			}else if (opcao.charAt(0) == 's'){
				SacarCCorrente();

			}else if (opcao.charAt(0) == 'p'){
				CriarContaPoupanca();

			}else if (opcao.charAt(0) == 'e'){
				ListarContaPoupanca();

			}else if(opcao.charAt(0) == 'r'){



			}
		}while (opcao.charAt(0) != 'f');


		System.exit(0);
	}

}