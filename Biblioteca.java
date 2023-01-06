package aplicacao;

import java.util.Scanner;

public class Biblioteca {
	//Atributos:
	private String nome;
	private String endereco;
	private String secao;
	
	//Construtores:
	public Biblioteca() {
		
	}

	public Biblioteca(String nome, String endereco, String secao) {
		this.nome = nome;
		this.endereco = endereco;
		this.secao = secao;
	}

	//Métodos acessores:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}
	
	//Método para impressão das informações da biblioteca:
	public void biblioteca() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("==== DIGITE AS INFORMAÇÕES DA BIBLIOTECA ====");
		System.out.println("Digite o nome da Biblioteca: ");
		System.out.print("->");
		setNome(sc.nextLine());
		System.out.println("Digite o endereço da Biblioteca: ");
		System.out.print("->");
		setEndereco(sc.nextLine());
		System.out.println("Digite o número da seção em que deseja cadastrar os livros: ");
		System.out.print("->");
		setSecao(sc.nextLine());
		System.out.println();
		System.out.println("==== INFORMAÇÕES DA BIBLIOTECA ====");
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Seção: " + getSecao());
		System.out.println();
	}
}


