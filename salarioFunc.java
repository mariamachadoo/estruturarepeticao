package estruturarepeticao;

import java.util.Scanner;

public class salarioFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int func, salafunc=0, mediasala, sala;
		
		System.out.println("Informe a quantidade de funcionarios da emporesa: ");
		func=ler.nextInt();
		
		  for (int i=1; i<=func; i++) { 
			  System.out.println("Informe o valor do salario dos funcionarios: ");
			  sala=ler.nextInt();
			  salafunc+=sala;
		}
		mediasala=salafunc/func;
		System.out.println("A média salarial da empresa é: " + mediasala + " reais");
		

	}

}
