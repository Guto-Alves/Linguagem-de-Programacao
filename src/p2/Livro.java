package p2;

public class Livro {
	int cod;
	int categoria;
	String nomeDaCategoria;
	int qtdEmprestado;
	
	public Livro() {
		this(0, 0, "", 0);
	}
	
	public Livro(int cod, int categoria, String nomeDaCategoria, int qtdEmprestado) {
		this.cod = cod;
		this.categoria = categoria;
		this.nomeDaCategoria = nomeDaCategoria;
		this.qtdEmprestado = qtdEmprestado;
	}
	
	public String toString() {
		return String.format("%d %d %s %d%n", cod, categoria, nomeDaCategoria, qtdEmprestado);
	}
}