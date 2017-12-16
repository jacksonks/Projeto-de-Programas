package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		ArrayList<Contas> listaContas = new ArrayList<Contas>();		
		String opcao;

		do {
			opcao = JOptionPane.showInputDialog(null,"Informe uma operação:\n [ i ] - Adicionar\n "
					+ "[ l ] - Listar contas a pagar por mes\n [ b ] - Buscar e pagar\n [ e ] - Elencar contas a pagar\n "
					+ "[ t ] - Buscar contas a pagar por tipo\n [ r ] - Remover uma conta\n [ f ] - Sair\n");

			if (opcao.charAt(0) == 'i'){
				do{
					Contas conta = new Contas();

					String tipo = JOptionPane.showInputDialog("Digite ao que a conta se refere: ");
					conta.setTipoConta(tipo);
					String valor = JOptionPane.showInputDialog("Digite o valor da conta: ");
					conta.setValor(Float.parseFloat(valor));
					String mes = JOptionPane.showInputDialog("Digite o mês referente da conta");
					conta.setMes(mes);
					String situacao = JOptionPane.showInputDialog("A conta está paga? sim ou nao?");
					if (situacao == "sim")
						conta.setSituacao(true);
					else
						conta.setSituacao(false);
					listaContas.add(conta);					
					opcao = JOptionPane.showInputDialog("Deseja continuar? sim ou nao?");
				}while (!opcao.equals("nao"));

			}else if (opcao.charAt(0) == 'l'){
				String listaDeContas = "--------- Lista de Contas a pagar por mês ---------\n";
				String temp = JOptionPane.showInputDialog(null,"Digite o mês das contas a buscar:");
				for (int i = 0; i < listaContas.size(); i++){
					if (listaContas.get(i).getMes().equals(temp) && listaContas.get(i).getSituacao()==false){

						listaDeContas += "Tipo da Conta: " + 
								listaContas.get(i).getTipoConta() + "\n" + "Valor da conta: " +
								listaContas.get(i).getValor() + "\n"+ "Mês: "+listaContas.get(i).getMes()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, listaDeContas);	

			}else if (opcao.charAt(0) == 'b'){
				String indicarConta = "----------Conta a pagar------------\n";
				String temp1 = JOptionPane.showInputDialog(null,"Digite o tipo da conta: ");
				String temp2 = JOptionPane.showInputDialog(null,"Digite o mês referente: ");
				int j=0;
				for(int i = 0; i < listaContas.size();i++){
					if(listaContas.get(i).getTipoConta().equals(temp1) && listaContas.get(i).getMes().equals(temp2)){
						indicarConta+= "Tipo da Conta: " + 
								listaContas.get(i).getTipoConta() + "\n" + "Valor da conta: " +
								listaContas.get(i).getValor() + "\n"+ "Mês: "+listaContas.get(i).getMes()+"\n";
						j=i;
						break;
					}			
				}
				JOptionPane.showMessageDialog(null, indicarConta);
				String temp3 = JOptionPane.showInputDialog(null, "Deseja pagar esta conta? sim ou nao?");
				if (temp3.equals("sim"))
					listaContas.get(j).setSituacao(true);

			}else if (opcao.charAt(0) == 'e'){
				String listaDeContas = "--------- Lista de Contas a pagar ---------\n";
				for (int i = 0; i < listaContas.size(); i++){
					if (listaContas.get(i).getSituacao()==false){

						listaDeContas += "Tipo da Conta: " + 
								listaContas.get(i).getTipoConta() + "\n" + "Valor da conta: " +
								listaContas.get(i).getValor() + "\n"+ "Mês: "+listaContas.get(i).getMes()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, listaDeContas);
			}else if (opcao.charAt(0) == 't'){

			}else if(opcao.charAt(0) == 'r'){
				String temp5 = JOptionPane.showInputDialog(null,"Digite o tipo de conta a ser removido");
				String temp6 = JOptionPane.showInputDialog(null,"Digite o mês a que ela se refere");
				for(int i = 0; i < listaContas.size();i++){
					if(listaContas.get(i).getTipoConta().equals(temp5) && listaContas.get(i).getMes().equals(temp6)){
						listaContas.remove(i);
					}			
				}
				JOptionPane.showMessageDialog(null,"A conta "+temp5+" do mês "+temp6+" foi removida \n");
			}
		}while (opcao.charAt(0) != 'f');


		System.exit(0);
	}

}
