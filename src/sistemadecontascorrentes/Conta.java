/*
............................................................................................................................
.          ContasCorrentes                                                                                                .
...........................................................................................................................
. codContaC | nomeClientesC | saldoContaC | LimitecontaC |tipoContaC      .
..........................................................................................................................
   int         String          double        double           int

 tipoContaC
   1 ----------- física
   2 ----------- conjunta
   3 ----------- jurídica
   4 ----------- especial

 */

package sistemadecontascorrentes;

public class Conta {
	private int cod;
	private String nome;
	private double saldo;
	private double limite;
	private int tipo;

	public Conta(int cod, String nome, double saldo, double limite, int tipo) {
		this.cod = cod;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		this.tipo = tipo;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s%n", getCod(), getNome(), getSaldo(), getLimite(), getTipo());
	}

}
