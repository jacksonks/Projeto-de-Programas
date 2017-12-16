import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Personagem> personagem = new ArrayList();
		
		personagem.add(new Cavaleiro("Arthur"));
		personagem.add(new Dragao("Banguela"));
		personagem.add(new Mago("Mestre dos Magos"));
		Jogo cJogo = new Jogo();
		for (int x = 0; x < personagem.size();x++){
			cJogo.executaAcoesComuns(personagem.get(x));
			System.out.println("");
		}
		
		System.out.println("\n");
		Mago p = new Mago("Mago 1");
		p.invisibilidade();

	}
}