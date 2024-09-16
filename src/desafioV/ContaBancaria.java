package desafioV;
import java.util.Scanner;
public class ContaBancaria {
	private String cliente;
	private double saldo;
	private String conta;
	public void menu() {
		Scanner leitura = new Scanner(System.in);
		int digitarOpcao;
	do{
		System.out.println(
		"MENU OPÇÕES" +
		"\n 1. Depositar"+
		"\n 2. Sacar" +
		"\n 3. Consultar saldo" + 
		"\n 4. Sair");
		System.out.println("Digite sua opção: " );
		digitarOpcao = leitura.nextInt();
	switch (digitarOpcao) {
	case 1:
		System.out.println("\n Depositar valor");
		double valorDepositado = leitura.nextDouble();
		depositar(valorDepositado);
	break;
	case 2:
		System.out.println("\n Sacar valor");
		double sacarValor = leitura.nextDouble();
		sacar(sacarValor);
		break;
	case 3:
		System.out.println("\n Consultar saldo" + saldo );
		double verSaldo = leitura.nextDouble();
		consultarSaldo();
		break;
	default:
		System.out.println("Opção inválida");
		break;
	}
	}
	while (digitarOpcao != 4);
	
	leitura.close();
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente (String cliente) {
		this.cliente = cliente;
	}
	public void exibeDadosCliente() {
		System.out.println("Cliente: " + cliente + "\n conta: " + conta);
	}
	
	public void depositar(double novoSaldo) {
		if (novoSaldo > 0) {
			saldo += novoSaldo;
			System.out.println("Deposito realizado com sucesso:" + saldo);
		}else {
			System.out.println("Valor de deposito inválido");
		}
	}
	public void sacar(double novoValor) {
		if(novoValor > 0 &&  novoValor <=saldo) {
			saldo -= novoValor;
			 System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
		}

	public void consultarSaldo () {
		System.out.println("Saldo atual: " + saldo);
	
	}
}

