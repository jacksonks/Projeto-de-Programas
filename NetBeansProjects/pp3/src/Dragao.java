
public class Dragao extends Personagem {

	public Dragao() {
		// TODO Auto-generated constructor stub
	}
	
	public Dragao(String nome) {
		super(nome);
	}
	
	public void atirarFogo(){
		System.out.println(this.getNome()+" Dragão atirando fogo");
		
	}
	public void voar(){
		System.out.println(this.getNome()+" Dragão atirando voando");
		
	}
	
	public void moder(){
		System.out.println(this.getNome()+" Dragão mordendo");
		
	}
	
	@Override
	public void andar(){
		System.out.println(this.getNome()+" andando");
	}
	
	@Override
	public void guardarItem() {
		System.out.println(this.getNome()+" guardando item");

	}

	@Override
	public void usarItem() {
		System.out.println(this.getNome()+" usando item");

	}

}