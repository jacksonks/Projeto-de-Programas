
public class ContaPoupanca extends ContaBancaria {
	private double rendimento;
	public ContaPoupanca(int numConta,double saldo, double rendimento){
		super(numConta,saldo);
		this.rendimento = rendimento;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}	
	public double calculaRendimento(){
		return super.getSaldo() * getRendimento();
	}

}