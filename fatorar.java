package estruturarepeticao;

import java.util.Scanner;

public class fatorar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = ler.nextInt();
		int fato = 1;
		
		for (int i = 1; i <= numero; i++) {
			fato *= i;
		}
		System.out.println("O fatorial de " + numero +  " é: " + fato);
	}

}
