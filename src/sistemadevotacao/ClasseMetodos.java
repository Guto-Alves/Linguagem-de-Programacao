package sistemadevotacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	private String fileName = "votacao2019.txt";
	private String fileNameUpdated = "votacao2019-classified.txt";

	public Votacao[] cadastrarVotacao(Votacao[] votacoes) {
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < votacoes.length; i++) {
			votacoes[i] = new Votacao();
			votacoes[i].setSecao(random.nextInt(11));
			votacoes[i].setCanditado(random.nextInt(301));
		}

		return votacoes;
	}

	// classifica lendo o arquivo
	public void classificarSecao() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameUpdated));

		Votacao[] votacoes = new Votacao[100];

		for (int i = 0; i < votacoes.length; i++) {
			String line = reader.readLine();
			String[] tokens = line.split(" ");

			votacoes[i] = new Votacao();
			votacoes[i].setSecao(Integer.parseInt(tokens[0]));
			votacoes[i].setCanditado(Integer.parseInt(tokens[1]));
		}

		for (int i = 0; i < votacoes.length - 1; i++) {
			for (int j = i + 1; j < votacoes.length; j++) {
				if (votacoes[i].getSecao() > votacoes[j].getSecao()) {
					Votacao votacaoAux = new Votacao();
					votacaoAux = votacoes[j];
					votacoes[j] = votacoes[i];
					votacoes[i] = votacaoAux;
				}
			}
		}

		for (int i = 0; i < votacoes.length; i++)
			writer.write(String.format("%02d %03d%n", votacoes[i].getSecao(), votacoes[i].getCanditado()));

		reader.close();
		writer.close();
	}

	// classifica sem ler o arquivo
	public void classificarSecao(Votacao[] votacoes) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameUpdated));

		for (int i = 0; i < votacoes.length - 1; i++) {
			for (int j = i + 1; j < votacoes.length; j++) {
				if (votacoes[i].getSecao() > votacoes[j].getSecao()) {
					Votacao votacaoAux = new Votacao();
					votacaoAux = votacoes[j];
					votacoes[j] = votacoes[i];
					votacoes[i] = votacaoAux;
				}
			}
		}

		for (int i = 0; i < votacoes.length; i++)
			writer.write(String.format("%02d %03d%n", votacoes[i].getSecao(), votacoes[i].getCanditado()));

		writer.close();
	}

	public void gravarVotacao(Votacao[] votacoes) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

		for (int i = 0; i < votacoes.length; i++)
			writer.write(String.format("%02d %03d%n", votacoes[i].getSecao(), votacoes[i].getCanditado()));

		writer.close();
	}

	public void mostrarIndicadores() {
		MetodosIncadores metodosIncadores = new MetodosIncadores();
		String message = String.format("%s%n%s%n%s%n%s%n%s%n%s", " Estatísticas de Votação em 2019",
				"1 – Quantidade Eleitores por Seção", "2 – Seção com Maior e Menor número de Eleitores",
				"3 – Quantidade de votos por candidato", "4 – Dez primeiros colocados", "9 – Finalizar consulta");

		int option;

		do {
			option = Integer.parseInt(
					JOptionPane.showInputDialog(null, message, "Mostrar Indicadores", JOptionPane.QUESTION_MESSAGE));

			switch (option) {
			case 1:
				try {
					metodosIncadores.displayQtdEleitoresPorSecao();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Erro na consulta!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 2:
				try {
					metodosIncadores.displayNumSecaoMaiorEMenorLeitores();
				} catch (IOException e) {

				}
				break;
			case 3:
				try {
					metodosIncadores.displayQtdVotosPorCandidato();
				} catch (IOException e) {

				}
				break;
			case 4:
				try {
					metodosIncadores.displayCandidatosMaisVotados();
				} catch (IOException e) {
				}
				break;
			case 9:

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!", "Error",
						JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (option != 9);

	}

	private class MetodosIncadores {

		public void displayQtdEleitoresPorSecao() throws IOException {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameUpdated));
			String result = String.format("%s %5s%n", "Seção", "Eleitores");
			int[] secoes = new int[11];

			for (int i = 0; i < 100; i++) {
				String[] tokens = reader.readLine().split(" ");

				secoes[Integer.parseInt(tokens[0])]++;
			}
			reader.close();

			for (int i = 0; i < secoes.length; i++)
				result += String.format("%02d %15d%n", i, secoes[i]);

			JOptionPane.showMessageDialog(null, result, "Quantidade de Eleitores Por Seção", JOptionPane.PLAIN_MESSAGE);
		}

		public void displayNumSecaoMaiorEMenorLeitores() throws IOException {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameUpdated));
			String result = String.format("%s %5s%n", "Seção", "Eleitores");
			int[] secoes = new int[11];

			for (int i = 0; i < 100; i++) {
				String[] tokens = reader.readLine().split(" ");

				secoes[Integer.parseInt(tokens[0])]++;
			}
			reader.close();

			int largerSectionIndex = 0;
			int smallerSectionIndex = 0;
			for (int i = 1; i < secoes.length; i++) {
				if (secoes[i] > secoes[largerSectionIndex])
					largerSectionIndex = i;
				else if (secoes[i] < secoes[smallerSectionIndex])
					smallerSectionIndex = i;
			}

			result += String.format("%02d %15d%n%02d %15d", largerSectionIndex, secoes[largerSectionIndex],
					smallerSectionIndex, secoes[smallerSectionIndex]);

			JOptionPane.showMessageDialog(null, result, "Seção com Maior e Menor números de Eleitores ",
					JOptionPane.PLAIN_MESSAGE);
		}

		public void displayQtdVotosPorCandidato() throws IOException {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameUpdated));

			String result = String.format("%s %10s%n", "Candidato", "Votos");

			int[] candidatos = new int[301];

			for (int i = 0; i < 100; i++) {
				String[] tokens = reader.readLine().split(" ");
				candidatos[Integer.parseInt(tokens[1])]++;
			}
			reader.close();

			for (int i = 0; i < candidatos.length; i++)
				result += String.format("%03d %10d%n", i, candidatos[i]);

			JOptionPane.showMessageDialog(null, result, "Seção com Maior e Menor números de Eleitores ",
					JOptionPane.PLAIN_MESSAGE);
		}

		public void displayCandidatosMaisVotados() throws IOException {
			BufferedReader reader = new BufferedReader(new FileReader(fileNameUpdated));
			String result = String.format("  %15s %15s%n", "Candidato", "Qtde Votos");
			int[] candidatos = new int[301];

			for (int i = 0; i < 100; i++) {
				String[] tokens = reader.readLine().split(" ");
				candidatos[Integer.parseInt(tokens[1])]++;
			}
			reader.close();

			int[] candidato = new int[301];
			int[] votos = new int[301];

			for (int i = 0; i < candidatos.length - 1; i++) {
				candidato[i] = i;
				votos[i] = candidatos[i];
			}

			for (int i = 0; i < votos.length - 1; i++) {
				for (int j = i + 1; j < votos.length; j++) {
					if (votos[i] < votos[j]) {
						int aux = votos[i];
						votos[i] = votos[j];
						votos[j] = aux;

						aux = candidato[i];
						candidato[i] = candidato[j];
						candidato[j] = aux;
					}
				}
			}

			for (int i = 0; i < 10; i++)
				result += String.format("%02dº            %-10d%10d%n", i + 1, candidato[i], votos[i]);

			JOptionPane.showMessageDialog(null, result, "Os 10 Candidatos mais Votados", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
