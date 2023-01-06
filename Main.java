package aplicacao;

import java.util.Scanner;

import aplicacao.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro l = new Livro();
		
		int n;
			 
		Scanner sc = new Scanner(System.in);
			 
	    l.biblioteca();

	     do {
	    	 
	    	System.out.println("=== BEM VINDO AO MENU BIBLIOTECA ===");
	 	    System.out.println("1 - Adicionar Livro");
	 	    System.out.println("2 - Remover Livro");
	 	    System.out.println("3 - Obter Livro pelo título");
	 	    System.out.println("4 - Listar Livros");
	 	    System.out.println("0 - sair do MENU");
	 	    System.out.println("Digite a opção desejada: ");
	    	System.out.print("->");
	 	    n = sc.nextInt();
	 	    sc.nextLine();
	 	    System.out.println();
	    	 
		 switch (n) {
		 
		 case (1):
			 l.adicionarLivros();
		     System.out.println();
			 break;
		 
	     case (2):
			 l.removerLivros();
	         System.out.println();
			 break;
	     
	     case (3):
			 l.obterLivros(null);
	         System.out.println();
			 break;
	     
	     case (4):
			 l.listarLivros();
	         System.out.println();
			 break;
	     
	     case (5):
			 System.out.println("Opção INVÁLIDA!! Tente novamente...");
	         System.out.println();
			 break;
		 
		 }
	     } while (n != 0);
	}
}

