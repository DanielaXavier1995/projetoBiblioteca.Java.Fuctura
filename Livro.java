package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Livro extends Biblioteca {
	//Atributos:
	private String titulo;
	private String autor;
	private String genero;
	private int edicao;
	private String volume;
	private int numPagina;
	private ArrayList <Livro> listaLivro = new ArrayList <Livro>();
	
	//Construtores:
	public Livro() {
	
	}
	
	public Livro(String titulo, String autor, String genero, int edicao, String volume, int numPagina) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
		this.volume = volume;
		this.numPagina = numPagina;
	}

	public Livro(String nome, String endereco, String secao, String titulo, String autor, String genero, int edicao, String volume, int numPagina) {
		super(nome, endereco, secao);
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
		this.volume = volume;
		this.numPagina = numPagina;
	}

	//Métodos acessores:
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	public ArrayList<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(ArrayList<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}
	
	//Métodos especiais:
	public void adicionarLivros() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos livros deseja cadastrar? ");
		System.out.print("->");
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
		System.out.println("==== CADASTRO DO LIVRO ====");
		System.out.println();
		System.out.println("======== " + (i + 1) + "° Livro ========");
		System.out.println("Digite o Título do livro: ");
		System.out.print("->");
		setTitulo(sc.nextLine());
		System.out.println("Digite o nome do Autor do livro: ");
		System.out.print("->");
		setAutor(sc.nextLine());
		System.out.println("Digite o gênero do livro: ");
		System.out.print("->");
		setGenero(sc.nextLine());
		System.out.println("Digite a edição do livro: ");
		System.out.print("->");
		setEdicao(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite o volume do livro: ");
		System.out.print("->");
		setVolume(sc.nextLine());
		System.out.println("Digite o número de páginas do livro: ");
		System.out.print("->");
		setNumPagina(sc.nextInt());
		System.out.println();
		sc.nextLine();
		listaLivro.add(new Livro(getTitulo(), getAutor(), getGenero(), getEdicao(), getVolume(), getNumPagina()));
		}
	} 
	
	public void listarLivros() {
		System.out.println("===== LISTA DE LIVROS REGISTRADOS =====");
		for (Livro l: listaLivro) {
			System.out.println("Título: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
			System.out.println("Genero: " + l.getGenero());
			System.out.println("Edição: " + l.getEdicao());
			System.out.println("Volume: " + l.getVolume());
			System.out.println("Número de páginas: " + l.getNumPagina());
			System.out.println("=======================================");
		}
	}
	
	public void removerLivros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o título do livro que deseja remover: ");
		System.out.print("->");
		setTitulo(sc.nextLine());
		for (int i = 0; i < listaLivro.size(); i++) {
			if (listaLivro.get(i).getTitulo().equalsIgnoreCase(getTitulo())) {
				listaLivro.remove(i);
			}
		}
		System.out.println();
		System.out.println("Livro removido com sucesso!!");
		}
	
	public void obterLivros(String titulo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o título do livro que deseja recuperar: ");
		System.out.print("->");
		titulo = sc.nextLine();
		for (int i = 0; i < listaLivro.size(); i++) {
			if (listaLivro.get(i).titulo.equalsIgnoreCase(titulo)) {
				 System.out.println("=== INFORMAÇÕES DO LIVRO " + titulo.toLowerCase() + " ===");
			     System.out.println("Título: " + listaLivro.get(i).getTitulo());
			     System.out.println("Autor: " + listaLivro.get(i).getAutor());
			     System.out.println("Gênero: " + listaLivro.get(i).getGenero());
			     System.out.println("Edição: " + listaLivro.get(i).getEdicao());
			     System.out.println("Volume: " + listaLivro.get(i).getVolume());
			     System.out.println("Número de páginas: " + listaLivro.get(i).getNumPagina());
			}
	    }
	}
}


