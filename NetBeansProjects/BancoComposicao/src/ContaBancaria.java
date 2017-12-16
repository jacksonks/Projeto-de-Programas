import java.util.ArrayList;
import java.util.Date;

public class ContaBancaria {
	private int numero;
	private float saldo;
	ArrayList<Movimentacao> movimentacao = new ArrayList<Movimentacao>();
	public ContaBancaria(){}

	public ContaBancaria(int numero, float saldo){
		this.numero = numero;
		this.saldo = saldo;
	}

	public void adicionarMovimentacao(float valor, Date data, String descricao){
		movimentacao.add(new Movimentacao(valor, data, descricao));
		Movimentacao mov = movimentacao.get(movimentacao.size()-1);
		if (mov.getDescricao().equals("deposito")){
			setSaldo(getSaldo()+mov.getValor());
		}else{
			setSaldo(getSaldo()-mov.getValor());
		}
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(ArrayList<Movimentacao> movimentacao) {
		this.movimentacao = movimentacao;
	}	
}