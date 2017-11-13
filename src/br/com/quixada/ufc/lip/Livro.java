package br.com.quixada.ufc.lip;

public class Livro {
	private int codigo;
	private String titulo;
	private float valor;
	private int qtd;
	
	public Livro() {
		super();
	}
	
	public Livro(int codigo, String titulo, float valor, int qtd) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.valor = valor;
		this.qtd = qtd;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
