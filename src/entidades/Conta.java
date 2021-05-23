package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo; //balance
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double quantia) {
		//withdraw= saque
		saldo -= quantia + 5.0; // saldo= saldo1000 - (quantia200+5)
	}
	public void deposito( double quantia) {
		saldo +=  quantia; // saldo= saldo + quantia
	}

}
