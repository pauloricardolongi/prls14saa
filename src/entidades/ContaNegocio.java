package entidades;

public class ContaNegocio extends Conta {
	private Double Limite_deEmprestimo;
	
	private ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer numero, String titular, Double saldo, Double limite_deEmprestimo) {
		super(numero, titular, saldo);
		Limite_deEmprestimo = limite_deEmprestimo;
	}

	public Double getLimite_deEmprestimo() {
		return Limite_deEmprestimo;
	}

	public void setLimite_deEmprestimo(Double limite_deEmprestimo) {
		Limite_deEmprestimo = limite_deEmprestimo;
	}
	
	public void emprestimo(double quantia) {
		if(quantia <= Limite_deEmprestimo) {
		 saldo = saldo + quantia - 10.0;
		}
	}

}
