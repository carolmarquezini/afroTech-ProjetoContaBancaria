package contaBancaria;

public class ContaEspecial extends Conta {

	double limite = 1000;

	public ContaEspecial(int numeroConta, String cpf) {
		super(numeroConta, cpf);

	}

	public void usarLimite() {
		System.out.println("Solicitando limite especial ...");

		if (this.getSaldo() > 0) {
			System.out.println("Saldo positivo, nao usou o limite especial, seu saldo ainda é de: R$ " + getSaldo());
			return;
		}

		double valor = this.getSaldo() * -1;

		limite -= valor;
		this.creditar(valor);

		System.out.println(
				"Limite solicitado com sucesso no valor de R$ " + valor + ". Limite especial disponível: R$ " + limite);

	}

}
