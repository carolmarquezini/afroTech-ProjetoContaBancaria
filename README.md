# **Tech Afro Pretas - Projeto Conta Bancaria 💰**

Projeto criado para simular o manuseio de contas (corrente, poupança, especial, empresarial e estudantil).

A **[conta](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/Conta.java)** é a classe que determina as principais propriedades de uma conta.

E é possível executar as operações através da classe **[TestaConta.java](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/TestaConta.java)**.

## Documentação 📄
- [Tema](#tema)
- [Aprendizado](#aprendizado)
- [Estrutura](#estrutura)
- [Regras](#regras)

### Tema

Programação Orientada a Objetos (POO) - Desenvolvimento de uma aplicação para contas.

### Aprendizado
**Principais aprendizados desenvolvidos com este projeto foram:** 
- Entrada e saída de dados;
- Laços condicionais;
- Laços de repetições;
- Métodos e modificadores de acesso;
- Classes, atributos e objetos;
- Polimorfismo, Herança e Sobrecarga;
- Classe Abstrata.

### Estrutura
```
📂 API     
├─ 📂 src                       
│  ├─ 📂 contaBancaria            
│  │  └─ Conta.java
│  │  └─ ContaCorrente.java
│  │  └─ ContaEmpresarial.java
│  │  └─ ContaEspecial.java
│  │  └─ ContaEstudantil.java
│  │  └─ ContaPoupanca.java  
│  │  └─ TestaConta.java  
├─ .gitignore 
└─ README.md             

```

### Regras

- [x] 10 Movimentos - DEBITO OU CREDITO
- [x] Saldo zero é possível
- [ ] Nenhuma conta pode ficar negativa depois dos possíveis 10 movimentos;
- [x] O banco deve ter um nome: **CMA BANK**
- [x] O banco deve ter um SLOGAN: **CMA BANK - FACILITANDO SUA VIDA FINANCEIRA!!!**

#### Regras de negócios

- [x] **[Conta corrente:](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/ContaCorrente.java)** Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar cheque, limitando em apenas 3 cheques. cada talão debita a conta em R$ 30.00;

- [x] **[Conta poupança:](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/ContaPoupanca.java)** Comparar se a data informada pelo usuario é a mesma data do dia do aniversário, se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo;

- [x] **[Conta especial:](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/ContaEspecial.java)** Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta no saldo e diminuir no limite.Limite de R$ 1.000;

- [x] **[Conta empresarial:](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/ContaEmpresarial.java)** Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo (limitado a R$ 10.000) levando o valor para o saldo.;

- [x] **[Conta estudantil:](https://github.com/carolmarquezini/afroTech-ProjetoContaBancaria/blob/main/contaBancaria/src/contaBancaria/ContaEstudantil.java)** Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo estudantil (limitado a R$ 5.000) levando o valor para o saldo.


