package sistemadetransito;

public class Estatistica {
	private int codCidade;
	private String nomeCidade;
	private int qtdAcidentes;
	private int tipoVeiculo;

	public Estatistica() {
		this(0, "", 0, 0);
	}

	public Estatistica(int codCidade, String nomeCidade, int qtdAcidentes, int tipoVeiculo) {
		this.setCodCidade(codCidade);
		this.setNomeCidade(nomeCidade);
		this.setQtdAcidentes(qtdAcidentes);
		this.setTipoVeiculo(tipoVeiculo);
	}

	public int getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(int codCidade) {
		this.codCidade = codCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public int getQtdAcidentes() {
		return qtdAcidentes;
	}

	public void setQtdAcidentes(int qtdAcidentes) {
		this.qtdAcidentes = qtdAcidentes;
	}

	public int getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(int tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String toString() {
		return String.format(
				"Código da Cidade: %d%nNome da Cidade: %s%nQuantidade de Acidentes: %d%nTipo de Veículo: %d%n%n",
				getCodCidade(), getNomeCidade(), getQtdAcidentes(), getTipoVeiculo());
	}

}
