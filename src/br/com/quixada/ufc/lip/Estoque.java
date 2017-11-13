package br.com.quixada.ufc.lip;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	ArrayList<Livro> estoque = new ArrayList<>();
	private float caixa = 0;
		
	public Estoque() {
		super();
	}

	public void addLivro(Livro livro) {
		estoque.add(livro);
		System.out.println("Livro " + livro.getTitulo() + " adicionado com sucesso\n");
	}
	
	public void removerLivro(String titulo) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i).getTitulo().equals(titulo)) {
				estoque.remove(i);
				System.out.println("Livro removido");
			}
		}
		System.out.println("Titulo nao localizado");
	}
	
	public void venderLivro(String titulo) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i).getTitulo().equals(titulo)) {
				if(estoque.get(i).getQtd() > 0) {
					estoque.get(i).setQtd(estoque.get(i).getQtd() - 1);
					this.setCaixa(getCaixa()+estoque.get(i).getValor());
					System.out.println("Caixa atual: R$ " + this.getCaixa());
				} else if(estoque.get(i).getQtd() == 0){
					System.out.println("Sem exemplares disponiveis, realizar novo pedido ao fornecedor");
				}
			}
		}
	}
	
	public void buscarTituto(String titulo) {
		for(int i = 0; i < estoque.size(); i++) {
			if(estoque.get(i).getTitulo().equals(titulo)) {
				System.out.println(	"\nCodigo: "+estoque.get(i).getCodigo()+
									"\nLivro: " + estoque.get(i).getTitulo()+
									"\nValor: R$"+estoque.get(i).getValor()+
									"\nExemplares: "+estoque.get(i).getQtd());
				return;
			}
		}
		System.out.println("Titulo não encontrado!\n");
	}

	public List<Livro> getEstoque() {
		return estoque;
	}
	
	public int size() {
		return estoque.size();
	}

	public float getCaixa() {
		return caixa;
	}

	public void setCaixa(float caixa) {
		this.caixa = caixa;
	}
	
	
	
}
