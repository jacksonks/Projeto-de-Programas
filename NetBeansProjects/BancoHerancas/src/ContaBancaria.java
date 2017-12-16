
public class ContaBancaria {
	private double saldo;
	private int numConta;
	
	public ContaBancaria( int numConta,double saldo){
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	boolean sacar(double quantidade)
	{
		if (this.saldo < quantidade){
			return false;
		}
		else{
			this.saldo = this.saldo - quantidade;
			return true;
		}
	}
	void depositar(double quantidade){
		this.saldo = saldo + quantidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}