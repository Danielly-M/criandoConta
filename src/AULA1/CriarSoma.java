package AULA1;

import java.util.Scanner;

public class CriarSoma {
	public static void main(String[] args) {
		Calculadora numeroCalculadora = new Calculadora();
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: " );
		
		double numero = leitura.nextDouble();
		double resultado = numeroCalculadora.Calcule(numero);
        
        // Exibir o resultado
        System.out.println("O dobro do número digitado é: " + resultado);
	}

}
