package entities;

public class Conta {
	
	private int numero_conta;
	private String nome_titular;
	private double saldo;
	
	public Conta( int numero_conta, String nome_titular) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;
	}
	
	public Conta( int numero_conta, String nome_titular, double deposito_inicial) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;
		depositar(deposito_inicial);
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero_conta() {
		return numero_conta;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Account " 
			+ numero_conta
			+ ", Holder: "
			+ nome_titular
			+ ", Balance: $ "
			+ String.format("%.2f",saldo); 
			
	}
}

