package contaBancaria;

public abstract class Conta {

	private int numeroConta;
	private String cpf;
	private double saldo;
	private boolean ativo;

	public Conta(int numeroConta, String cpf) {

		this.numeroConta = numeroConta;
		this.cpf = cpf;
		
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
