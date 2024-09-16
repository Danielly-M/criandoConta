package desafioV;
import java.util.Scanner;
public class ContaCorrente extends ContaBancaria{
	private String agencia;
	private String ContaCorrente;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria novaContaCorrente = new ContaBancaria();
		
		
		
		novaContaCorrente.setCliente("Marcelo Silva");
		novaContaCorrente.setConta("1122");
		novaContaCorrente.getSaldo();
		
		
		novaContaCorrente.exibeDadosCliente();
		//System.out.println(novaContaCorrente.exibeDadosCliente());
		
		//novaContaCorrente.depositar(100);
		
		novaContaCorrente.menu();
		//System.out.println("Depositar valor: " );
		Scanner leitura = new Scanner(System.in);
		double valorDeposito = leitura.nextDouble();
		novaContaCorrente.depositar(valorDeposito);
		
		
		System.out.println("Digita valor para sacar: " );
		double valorSacar = leitura.nextDouble();
		novaContaCorrente.sacar(valorSacar);
		
	}
}
