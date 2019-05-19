package sistemadetransito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	public static Estatistica[] cadastrarEstatistica(Estatistica[] estatisticas) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("estatisticas.txt"));

		for (int i = 0; i < estatisticas.length; i++) {
			estatisticas[i] = new Estatistica();
			estatisticas[i].setCodCidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Código da cidade:")));
			estatisticas[i].setNomeCidade(JOptionPane.showInputDialog("Nome da cidade:"));
			estatisticas[i].setQtdAcidentes(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes:")));
			estatisticas[i].setTipoVeiculo(Integer.parseInt(JOptionPane.showInputDialog("Tipo de veículo:")));

			writer.write(String.format("%d %s %d %d%n", estatisticas[i].getCodCidade(), estatisticas[i].getNomeCidade(),
					estatisticas[i].getQtdAcidentes(), estatisticas[i].getTipoVeiculo()));
		}
		writer.close();

		return estatisticas;
	}

	public static void consultarPorTipoDeVeiculo(Estatistica[] estatisticas) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("estatisticas.txt"));
		String resultado = "";

		int tipoPesquisado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de veículo:"));

		for (int i = 0; i < estatisticas.length; i++) {
			String linha = reader.readLine();
			String[] tokens = linha.split(" ");

			if (Integer.parseInt(tokens[3]) == tipoPesquisado)
				resultado += estatisticas[i];

		}
		reader.close();

		JOptionPane.showMessageDialog(null, resultado, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultarPorQtdAcidentes(Estatistica[] estatisticas) {
		String resultado = "";

		for (int i = 0; i < estatisticas.length; i++) {
			if (estatisticas[i].getQtdAcidentes() > 100 && estatisticas[i].getQtdAcidentes() < 500)
				resultado += estatisticas[i];
		}

		if (resultado.isEmpty())
			resultado = "Nenhuma cidade com quantidade de acidentes entre 100 a 500!";

		JOptionPane.showMessageDialog(null, resultado, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultarPorAcidentes(Estatistica[] estatisticas) {
		String resultado = "";

		for (int i = 0; i < estatisticas.length; i++) {
			if (estatisticas[i].getQtdAcidentes() > 100 && estatisticas[i].getQtdAcidentes() < 500)
				resultado += estatisticas[i];

		}

		JOptionPane.showMessageDialog(null, resultado, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultarTodasCidades(Estatistica[] estatisticas) {
		String resultado = "";

		for (Estatistica estatistica : estatisticas)
			resultado += estatistica;

		JOptionPane.showMessageDialog(null, resultado, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultarGeral(Estatistica[] estatisticas) {
		int menorNumeroAcidentes = estatisticas[0].getQtdAcidentes();
		int maiorNumeroAcidentes = estatisticas[0].getQtdAcidentes();
		double mediaDeAcidentes = 0;
		String cidadesAcima = "";

		for (int i = 0; i < estatisticas.length; i++) {
			mediaDeAcidentes += estatisticas[i].getQtdAcidentes();

			if (estatisticas[i].getQtdAcidentes() > maiorNumeroAcidentes)
				maiorNumeroAcidentes = estatisticas[i].getQtdAcidentes();
			else if (estatisticas[i].getQtdAcidentes() < menorNumeroAcidentes)
				menorNumeroAcidentes = estatisticas[i].getQtdAcidentes();
		}

		mediaDeAcidentes = mediaDeAcidentes / estatisticas.length;

		for (int i = 0; i < estatisticas.length; i++) {
			if (estatisticas[i].getQtdAcidentes() > mediaDeAcidentes)
				cidadesAcima += estatisticas[i].getNomeCidade() + " ";
		}

		JOptionPane.showMessageDialog(null, String.format(
				"Menor número de acidente(s): %d%nMaior número de acidentes: %d%nCidades acima da média: %s%nMédia de acidentes: %,.2f",
				menorNumeroAcidentes, maiorNumeroAcidentes, cidadesAcima, mediaDeAcidentes), "Resultado da Pesquisa",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
