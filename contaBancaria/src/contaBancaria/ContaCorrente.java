package contaBancaria;

public class ContaCorrente extends Conta {

	int contadorTalao = 0;

	public ContaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);

	}

	public void pedirTalao() {
		System.out.println("Pedindo talao...");

		if (contadorTalao >= 3) {
			System.out.println("limite de talao excedido!");
			return;
		}

		this.debitar(30);
		contadorTalao++;
		System.out.println("Talão pedido com sucesso!!!");
	}

}
