public class Cavaleiro extends Personagem implements ComportamentoHeroico {

	public Cavaleiro() {
		// TODO Auto-generated constructor stub
	}

	public Cavaleiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void guardarItem() {
		System.out.println(this.getNome()+"guardando item");

	}

	@Override
	public void usarItem() {
		System.out.println(this.getNome()+" usando item");

	}

	@Override
	public void atacar() {
		System.out.println(this.getNome()+" atacando");

	}
	@Override
	public void andar() {
		System.out.println(this.getNome()+" andando");

	}

	@Override
	public void defender() {
		System.out.println(this.getNome()+" defendendo");

	}

	@Override
	public void saltar() {
		System.out.println(this.getNome()+" saltando");

	}
}