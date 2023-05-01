package contaBancaria;

import java.util.Scanner;

public class TestaConta {

	static Scanner input = new Scanner(System.in);
	static int qtdMovimentacaoContaCorrente;
	static int qtdMovimentacaoContaEmpresarial;
	static int qtdMovimentacaoContaEstudantil;

	public static void main(String[] args) {

		int codigo;

		ContaCorrente contaCorrente = new ContaCorrente(1234, "45678");
		ContaPoupanca poupanca = new ContaPoupanca(1234, "45678", 15);
		ContaEspecial contaEspecial = new ContaEspecial(234, "45678");
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(234, "45678");
		ContaEstudantil contaEstudantil = new ContaEstudantil(234, "45678");

		// TELA INICIAL:
		do {
			System.out.println("\nCMA BANK");
			System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
			System.out.println("\n1 - CONTA CORRENTE");
			System.out.println("2 - CONTA POUPANÇA");
			System.out.println("3 - CONTA CONTA ESPECIAL");
			System.out.println("4 - CONTA CONTA EMPRESARIAL");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR \n");
			System.out.println("Digite o código da opção desejada: ");

			codigo = input.nextInt();
			System.out.println();

			if (codigo == 1) {
				mostrarContaCorrente(contaCorrente);
			}

			if (codigo == 2) {
				mostrarPoupanca(poupanca);
			}

			if (codigo == 3) {
				mostrarContaEspecial(contaEspecial);
			}

			if (codigo == 4) {
				mostrarContaEmpresarial(contaEmpresarial);
			}

			if (codigo == 5) {
				mostrarContaEstudantil(contaEstudantil);
			}

		} while (codigo != 6);
		System.out.println("Saindo do programa ... ");
		input.close();
	}

	private static void mostrarContaCorrente(ContaCorrente contaCorrente) {
		// TESTANDO CONTA CORRENTE:

		String desejaContinuar;

		do {
			// contaCorrente.exibirDadosConta()

			System.out.println("CMA BANK");
			System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
			System.out.println("CONTA CORRENTE");

			System.out.println("\nSaldo atual: R$ " + contaCorrente.getSaldo() + " Quantidade de talão: "
					+ contaCorrente.contadorTalao);

			realizarMovimento(contaCorrente);
			qtdMovimentacaoContaCorrente++;

			if (qtdMovimentacaoContaCorrente > 10) {
				exibirSolicitacaoTalao(contaCorrente);
			}

			System.out.println("Vc fez " + qtdMovimentacaoContaCorrente + " movimentos. Deseja continuar? (s/n)");
			desejaContinuar = input.next();
		} while (desejaContinuar.toUpperCase().equals("S"));

		exibirSolicitacaoTalao(contaCorrente);
	}

	private static void mostrarPoupanca(ContaPoupanca poupanca) {
		// TESTANDO CONTA POUPANCA:

		String desejaContinuar;
		int diaAniversario;

		do {
			System.out.println("CMA BANK");
			System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
			System.out.println("CONTA POUPANÇA");

			System.out.println("\nSaldo atual: R$ " + poupanca.getSaldo() + " Dia aniversario: "
					+ poupanca.diaAniversarioPoupanca);

			realizarMovimento(poupanca);

			System.out.println("\nSaldo atual: R$ " + poupanca.getSaldo());

			System.out.println("Informar data de aniversário: ");
			diaAniversario = input.nextInt();

			poupanca.corrigirValor(diaAniversario);
			System.out.println("\nSaldo atual: R$ " + poupanca.getSaldo());

			System.out.println("Continuar? (s/n)");
			desejaContinuar = input.next();
		} while (desejaContinuar.toUpperCase().equals("S"));
	}

	private static void mostrarContaEspecial(ContaEspecial contaEspecial) {
		// TESTANDO LIMITE ESPECIAL:
		System.out.println("CMA BANK");
		System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
		System.out.println("CONTA ESPECIAL");

		System.out.println("\nSaldo atual: R$ " + contaEspecial.getSaldo());
		realizarMovimento(contaEspecial);

		System.out.println();

		contaEspecial.usarLimite();
	}

	private static void mostrarContaEmpresarial(ContaEmpresarial contaEmpresarial) {
		// TESTANDO CONTA EMPRESARIAL:
		String desejaContinuar;

		do {
			System.out.println("CMA BANK");
			System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
			System.out.println("\nCONTA EMPRESARIAL");

			System.out.println("\nSaldo atual: R$ " + contaEmpresarial.getSaldo());
			realizarMovimento(contaEmpresarial);
			qtdMovimentacaoContaEmpresarial++;

			if (qtdMovimentacaoContaEmpresarial > 10) {
				exibirSolicitarEmprestimo(contaEmpresarial);
			}

			System.out.println("Vc fez " + qtdMovimentacaoContaCorrente + " movimentos. Deseja continuar? (s/n)");
			desejaContinuar = input.next();
		} while (desejaContinuar.toUpperCase().equals("S"));

		exibirSolicitarEmprestimo(contaEmpresarial);

	}

	private static void mostrarContaEstudantil(ContaEstudantil contaEstudantil) {
		String desejaContinuar;

		// TESTANDO CONTA ESTUDANTIL:
		do {
			System.out.println("CMA BANK");
			System.out.println("CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!");
			System.out.println("CONTA ESTUDANTIL");
			System.out.println();

			System.out.println("\nSaldo atual: R$ " + contaEstudantil.getSaldo());
			realizarMovimento(contaEstudantil);
			qtdMovimentacaoContaEstudantil++;

			if (qtdMovimentacaoContaEstudantil > 10) {
				exibirSolicitacaoLimiteEstudantil(contaEstudantil);
			}
			System.out.println("Vc fez " + qtdMovimentacaoContaCorrente + " movimentos. Deseja continuar? (s/n)");
			desejaContinuar = input.next();

		} while (desejaContinuar.toUpperCase().equals("S"));

		exibirSolicitacaoLimiteEstudantil(contaEstudantil);

	}

	private static void realizarMovimento(Conta conta) {

		double valorMovimento;
		String tipoMovimento;

		System.out.println("\nMovimento da conta: D-débito ou C-crédito: ");
		tipoMovimento = input.next();

		System.out.println("\nValor do movimento: R$ ");
		valorMovimento = input.nextDouble();

		if (tipoMovimento.toUpperCase().equals("C")) {
			conta.creditar(valorMovimento);
		} else if (tipoMovimento.toUpperCase().equals("D")) {
			conta.debitar(valorMovimento);
		}

	}

	private static void exibirSolicitacaoTalao(ContaCorrente contaCorrente) {
		String solicitarTalao;

		System.out.println("Deseja solicita talao? (s/n)");
		solicitarTalao = input.next();

		if (solicitarTalao.toUpperCase().equals("S")) {
			contaCorrente.pedirTalao();
			System.out.println("Saldo: R$ " + contaCorrente.getSaldo());
			System.out.println("Quantidade de talao disponivel: " + contaCorrente.contadorTalao);
		} else {
			System.out.println("Ok, operacao encerrada.");
		}
	}

	private static void exibirSolicitarEmprestimo(ContaEmpresarial contaEmpresarial) {
		String desejaEmprestimo;
		double valorEmprestimo;

		System.out.println("Você deseja solicitar emprestimo? (s/n) ");
		desejaEmprestimo = input.next();

		if (desejaEmprestimo.toUpperCase().equals("S")) {
			System.out.println("Informar valor do emprestimo desejado: R$ ");
			valorEmprestimo = input.nextDouble();

			contaEmpresarial.pedirEmprestimo(valorEmprestimo);
		}

	}

	private static void exibirSolicitacaoLimiteEstudantil(ContaEstudantil contaEstudantil) {

		String usarLimite;
		double valorLimiteSolicitado;

		System.out.println("Você deseja usar limite estudantil? (s/n) ");
		usarLimite = input.next();

		if (usarLimite.toUpperCase().equals("S")) {
			System.out.println("Informar valor do limite que deseja utilizar: R$ ");
			valorLimiteSolicitado = input.nextDouble();

			contaEstudantil.usarLimiteEstudantil(valorLimiteSolicitado);
		}

	}
}
