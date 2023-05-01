package contaBancaria;

public class ContaPoupanca extends Conta {

	int diaAniversarioPoupanca;

	public ContaPoupanca(int numeroConta, String cpf, int diaAniversario) {
		super(numeroConta, cpf);

		this.diaAniversarioPoupanca = diaAniversario;

	}

	public void corrigirValor(int diaAniversario) {
		System.out.println("Corrigindo valor ... ");

		if (this.diaAniversarioPoupanca != diaAniversario) {
			System.out.println("nao é a data de aniversario!");

			return;
		}

		double rendimento = this.getSaldo() * 0.05;

		System.out.println("Valor do rendimento: R$ " + rendimento + " valor do saldo antes do rentimento " + this.getSaldo());

		this.creditar(rendimento);

		System.out.println("Valor corrigido!");

	}

}
