package br.com.quixada.ufc.lip;

public class Aventura extends Livro {
	private String tipo = "Ilustração";

	public String getTipo() {
		return tipo;
	}

	public Aventura(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	
}
