package estruturarepeticao;

import java.util.Scanner;

public class inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero=0, somapar=0, somaimpar=0;

		for(int i =1; i<=10; i++) {
			System.out.println("Informe o número inteiro:");
			numero = ler.nextInt();
			if (numero % 2 == 0) {
				somapar++;
			}
			else  {
				
			}
		}
		System.out.println("A quantidade de números pares é:" +somapar);
		System.out.println("A quantidade de números ímpares é:" +somaimpar);
		
		ler.close();
	}
}