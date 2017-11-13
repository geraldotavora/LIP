package br.com.quixada.ufc.lip;

import java.util.Scanner;

public class Main {
	private static Scanner scan;

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
//		Livro l1 = new Livro(2, "Cecilia", 800, 2);
//		Livro a1 = new Livro(1, "Ola", 24, 3);
//		estoque.addLivro(l1);
//		System.out.println("tam: "+estoque.size()+" qtd: " + l1.getQtd() + " cod: "+l1.getCodigo() + " nome: "+l1.getTitulo());
//		estoque.addLivro(a1);
//		System.out.println("tam: "+estoque.size()+" qtd: " + a1.getQtd() + " cod: "+ a1.getCodigo() + " nome: "+ a1.getTitulo());
//		
//		System.out.println("Caixa atual: R$ " + estoque.getCaixa());
//		System.out.println(l1.getQtd());
//		estoque.venderLivro(l1);
//		estoque.venderLivro(a1);
//		estoque.venderLivro(a1);
//		estoque.venderLivro(a1);
//		estoque.venderLivro(l1);
//		estoque.venderLivro(l1);
		while(true) {
		scan = new Scanner(System.in);
		
		
		System.out.println(	"\n################\n" +
							"# LIVRARIA LIP #\n"+
							"################");
		System.out.println("Escolha uma opção: \n"+
							"1 - Adicionar Livro\n"+
							"2 - Qtd titulos na livraria\n"+
							"3 - Remover livro\n"+
							"4 - Vender livro\n"+
							"5 - Buscar titulo\n"+
							"6 - Saldo caixa: R$ \n"+
							"0 - Sair");
		
		int opcao = scan.nextInt();
		switch (opcao) {
			case 1:
				System.out.println("Adicionar Livro");
				Livro livro = new Livro();
				livro.setCodigo(scan.nextInt());
				scan.nextLine();
				livro.setTitulo(scan.nextLine());
				livro.setValor(scan.nextFloat());
				livro.setQtd(scan.nextInt());
				estoque.addLivro(livro);
				break;
			case 2:
				System.out.println(estoque.size());
				break;
			case 3:
				scan.nextLine();
				String a = scan.nextLine();
				estoque.removerLivro(a);
				break;
			case 4:
				scan.nextLine();
				estoque.venderLivro(scan.nextLine());
				break;
			case 5:
				scan.nextLine();
				estoque.buscarTituto(scan.nextLine());
				break;
			case 6:
				System.out.println("Saldo em caixa: R$ "+estoque.getCaixa());
				break;
			case 0:
				System.out.println("Saindo");
				return;
			default:
				break;
			}
		}
	}
}

