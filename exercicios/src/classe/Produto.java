package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(double precoInicial) {
		preco = precoInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
