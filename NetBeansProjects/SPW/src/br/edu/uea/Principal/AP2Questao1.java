package br.edu.uea.principal;

import java.text.ParseException;

import br.edu.uea.SPW.SupermercadoWeb;

public class AP2Questao1 {

	public static void main(String[] args) throws ParseException {
		SupermercadoWeb spw = new SupermercadoWeb ();
		spw.iniciaSupermercado();

		System.out.println("\n###### ESTOQUE######");
		System.out.println("\nCÓD   NOME                         GENERO     MARCA     PREÇO   VALIDADE   VÁLIDO?");
		System.out.println("\n--- ------------- ------------- --------- ------- ---------- -------");
		spw.getEstoque().mostraEstoque();
	}
}