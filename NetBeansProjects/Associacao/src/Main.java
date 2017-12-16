public class Main {

	public static void main(String[] args){
		Endereco endereco = new Endereco(22,"Flores",690100230,"AP 100");
		Cliente cliente = new Cliente ("Jackson","7777789-04",endereco);
		
		System.out.println("Nome: "+cliente.getNome()+". Endereço: "
		+cliente.getEnd().getRua()+", "+cliente.getEnd().getNumero());
		
	}
}