
public class Mago extends Personagem implements ComportamentoMagico {

	public Mago() {
		// TODO Auto-generated constructor stub
	}

	public Mago(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void andar() {
		
		System.out.println(this.getNome()+" andando");

	}

	public void guardarItem() {
		System.out.println(this.getNome()+" guardando item");

	}

	public void usarItem() {
		System.out.println(this.getNome()+" usando item");

	}

	public void invisibilidade() {
		System.out.println(this.getNome()+" Mago Invisível");

	}

	public void ultraRapidez() {
		System.out.println(this.getNome()+" Mago modo rápido");

	}
}