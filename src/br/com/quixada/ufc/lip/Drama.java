package br.com.quixada.ufc.lip;

public class Drama extends Livro{
	private String capa = "Capa dura";

	public String getCapa() {
		return capa;
	}

	public Drama(String capa) {
		super();
		this.capa = capa;
	}
	
	
}
