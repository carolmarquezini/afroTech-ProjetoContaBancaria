package contaBancaria;

public class ContaEstudantil extends Conta {

	double limiteEstudantil = 5000;

	public ContaEstudantil(int numeroConta, String cpf) {
		super(numeroConta, cpf);

	}

	public void usarLimiteEstudantil(double valorEstudantil) {

		if (valorEstudantil > limiteEstudantil) {
			System.out.println("Limite estudantil não disponivel para o valor solicitado R$ " + valorEstudantil
					+ ". O limite disponível é de: R$ " + limiteEstudantil);

			return;
		}

		this.creditar(valorEstudantil);
		limiteEstudantil -= valorEstudantil;

		System.out.println("Ëmprestimo estudantil solicitado, limite disponível: R$ " + limiteEstudantil
				+ " e o saldo atual é: R$ " + this.getSaldo());

	}

}
