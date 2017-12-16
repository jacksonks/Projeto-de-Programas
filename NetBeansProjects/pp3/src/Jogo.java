import java.util.ArrayList;

public class Jogo {
	//ArrayList<Personagem> personagem = new ArrayList<Personagem>();

	public Jogo() {


	}
	public void executaAcoesComuns(Personagem cPersonagem){

		if (cPersonagem instanceof Cavaleiro){
			Cavaleiro cCavaleiro =(Cavaleiro)cPersonagem;
			cCavaleiro.andar();
			cCavaleiro.atacar();
			cCavaleiro.guardarItem();
			cCavaleiro.usarItem();
			cCavaleiro.defender();
		}else if(cPersonagem instanceof Dragao){
			Dragao cDragao = (Dragao) cPersonagem;
			cDragao.andar();
			cDragao.atirarFogo();
			cDragao.voar();
		}else if(cPersonagem instanceof Mago){
			Mago cMago = (Mago) cPersonagem;
			cMago.andar();
			cMago.invisibilidade();
			cMago.ultraRapidez();

		}
	}
}