package br.edu.produto;

public class Principal {
	public static void main(String[] args) {
		Produto p1 = new Produto("Skala",10.0);
		Produto p2 = new Produto("Salon Line",30.0);
		
		Produto p3 =new Produto();
		p3.nome="Juba";
		p3.preco= 60.00;
		
		p1.exibirDados();
		p2.exibirDados();
		p3.exibirDados();
		
		Produto.exibirQuantidadeTotal();
	}
}
