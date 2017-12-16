import java.util.Date;

public class Movimentacao {
	private float valor;
	private Date data;
	private String descricao;
	public Movimentacao(float valor, Date data, String descricao){
		this.valor = valor;
		this.data = data;
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}