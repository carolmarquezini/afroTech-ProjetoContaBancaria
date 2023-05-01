package contaBancaria;

public class ContaEmpresarial extends Conta {

	double emprestimoEmpresa = 10000;

	public ContaEmpresarial(int numeroConta, String cpf) {
		super(numeroConta, cpf);

	}

	public void pedirEmprestimo(double emprestimoSolicitado) {
		System.out.println("Iniciando pedido de emprestimo empresarial ...");

		if (emprestimoSolicitado > emprestimoEmpresa) {
			System.out.println("Limite não disponível para valor R$ " + emprestimoSolicitado
					+ ". O limite disponível para emprestimo empresarial é: R$ " + emprestimoEmpresa);

			return;
		}

		this.creditar(emprestimoSolicitado);
		emprestimoEmpresa -= emprestimoSolicitado;

		System.out.println("Ëmprestimo empresarial solicitado, limite disponível: R$ " + emprestimoEmpresa
				+ " e o saldo atual é: R$ " + this.getSaldo());
	}

}
