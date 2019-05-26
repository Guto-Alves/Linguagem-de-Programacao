package sistemadecontascorrentes;

import javax.swing.JOptionPane;

public class Validation {
	private String regexAccount = "\\d+\\s{1}[A-Z][a-z]+\\s{1}\\d+\\s{1}\\d+\\s{1}\\d+";
	private String regexMovement = "\\d+\\s{1}\\d+\\s{1}\\d+\\s{1}\\d{1}";

	public boolean validarMovimento(String movimento) {
		if (movimento.matches(regexMovement)) {
			if (validarTipoDeMovimento(movimento)) {
				if (validarStatusDoMovimento(movimento))
					return true;
				else
					JOptionPane.showMessageDialog(null, "Status de movimento existentes:\n1 - \n2 - ",
							"Error - status do movimento inválido", JOptionPane.ERROR_MESSAGE);
			} else
				JOptionPane.showMessageDialog(null, "Tipos de movimento existentes:\n1 - crédito\n2 - débito",
						"Error - tipo de movimento inválido", JOptionPane.ERROR_MESSAGE);
		} else
			JOptionPane.showMessageDialog(null, "Dado(s) inválido(s). Tente novamente!", "Error",
					JOptionPane.ERROR_MESSAGE);
		return false;
	}

	private boolean validarTipoDeMovimento(String movimento) {
		int tipoDeMovimento = getDado(movimento, 2);
		return tipoDeMovimento < 1 || tipoDeMovimento > 2 ? false : true;
	}

	private boolean validarStatusDoMovimento(String movimento) {
		int statusDoMovimento = getDado(movimento, 3);
		return statusDoMovimento < 1 || statusDoMovimento > 2 ? false : true;
	}

	private int getDado(String string, int index) {
		String[] tokens = string.split(" ");
		return Integer.parseInt(tokens[index]);
	}

	public boolean validarContaCorrente(String conta) {
		if (conta.matches(regexAccount)) {
			if (validarTipoDeConta(conta))
				return true;
			else
				JOptionPane.showMessageDialog(null,
						"Tipo de conta existente:\n1 - Física\n2 - Conjunta\n3 - Jurídica\n4 - Especial\n",
						"Error - tipo de conta inválido", JOptionPane.ERROR_MESSAGE);
		} else
			JOptionPane.showMessageDialog(null, "Dado(s) inválido(s). Tente novamente!", "Error",
					JOptionPane.ERROR_MESSAGE);

		return false;
	}

	private boolean validarTipoDeConta(String conta) {
		int tipoConta = getDado(conta, 4);
		return tipoConta < 1 || tipoConta > 4 ? false : true;
	}
}
