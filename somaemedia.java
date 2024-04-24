package estruturarepeticao;

import java.util.Scanner;

public class somaemedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero,soma=0, media;
		Scanner ler = new Scanner(System.in);

		for(double i =0; i<=4; i++) {
			System.out.println("Informe o número:");
			numero = ler.nextDouble();
			soma += numero;

		}
		media = soma / 5;
		System.out.println("A média é:" +media );

	}

}
