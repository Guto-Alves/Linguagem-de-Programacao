/*
 * ..............................................................................................................
.          MovimentoContas                                                                             .
.............................................................................................................
. codContaM | ValorMovimentoM | TipoMovimentoM |statusM     .
.............................................................................................................
   int        double              int             int

 TipoMovimento
   1 ----------- crédito
   2 ----------- débito

 */

package sistemadecontascorrentes;

public class MovimentoConta {
	private int cod;
	private double valor;
	private int tipo;
	private int status;

	public MovimentoConta(int cod, double valor, int tipo, int status) {
		this.cod = cod;
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
