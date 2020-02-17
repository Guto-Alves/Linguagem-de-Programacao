package p2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		Livro[] livros = new Livro[3];

		int option;

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Cadastrar livros\n2 - Mostrar livro(s) mais emprestado(s)\n3 - Mostrar quantidade por categoria\n9 - Fim"));

			switch (option) {
			case 1:
				livros = cadastrar(livros);
				break;
			case 2:
				mostrarMaisEmprestado(livros);
				break;
			case 3:
				mostrarPorCategoria(livros);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao inválida!");
				break;
			}
		} while (option != 9);
	}

	public static Livro[] cadastrar(Livro[] livros) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("livros.txt"));

		for (int i = 0; i < livros.length; i++) {
			livros[i] = new Livro();
			livros[i].cod = i;
			livros[i].categoria = Integer.parseInt(JOptionPane.showInputDialog("Categoria: "));
			livros[i].nomeDaCategoria = JOptionPane.showInputDialog(null, "Nome da categoria: ");
			livros[i].qtdEmprestado = Integer
					.parseInt(JOptionPane.showInputDialog("Quantidade de vezes que foi emprestado: "));

			writer.write("" + livros[i]);
		}

		writer.close();

		return livros;
	}

	public static void mostrarMaisEmprestado(Livro[] livros) {
		int qtdDoMaisEmprestado = livros[0].qtdEmprestado;

		for (int i = 1; i < livros.length; i++) {
			if (livros[i].qtdEmprestado > qtdDoMaisEmprestado)
				qtdDoMaisEmprestado = livros[i].qtdEmprestado;
		}

		String result = "Código do(s) livro(s) mais emprestado(s):\n";

		for (int i = 0; i < livros.length; i++) {
			if (livros[i].qtdEmprestado == qtdDoMaisEmprestado)
				result += " - " + livros[i].cod;
		}

		JOptionPane.showMessageDialog(null, result);
	}

	public static void mostrarPorCategoria(Livro[] livros) {
		livros = classificar(livros);

		System.out.print(Arrays.toString(livros));

		String result = "";
		int categoriaAtual = livros[0].categoria;
		String nomeCategoria = livros[0].nomeDaCategoria;
		int qtdCategoria = 1;

		for (int i = 1; i < livros.length; i++) {
			if (livros[i].categoria == categoriaAtual) {
				qtdCategoria++;
			} else {
				result += String.format("Categoria - %s: %d%n", nomeCategoria, qtdCategoria);
				categoriaAtual = livros[i].categoria;
				nomeCategoria = livros[i].nomeDaCategoria;
				qtdCategoria = 1;
			}
		}

		result += String.format("Categoria - %s: %d%n", nomeCategoria, qtdCategoria);

		JOptionPane.showMessageDialog(null, result);
	}

	private static Livro[] classificar(Livro[] livros) {
		for (int i = 0; i < livros.length - 1; i++) {
			for (int j = i + 1; i < livros.length; i++) {
				if (livros[i].categoria > livros[j].categoria) {
					Livro livroAux = livros[i];
					livros[i] = livros[j];
					livros[j] = livroAux;
				}
			}
		}

		return livros;
	}

}