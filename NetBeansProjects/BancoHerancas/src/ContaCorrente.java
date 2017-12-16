public class ContaCorrente extends ContaBancaria {
	final static double LIMITE = 500;
	public ContaCorrente(int numConta,double saldo){
		super(numConta,saldo);
	}

	boolean sacar(double quantidade){
		if (this.LIMITE < this.getSaldo()){
			this.setSaldo(getSaldo()-quantidade);
			return true;
		}
		else{
			return false;
		}
	}
}