package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHigherPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?: ");
		int qtdNumbers = sc.nextInt();
		double[] number = new double[qtdNumbers];
		 double maior;
		 int  posmaior;
//		int[] count = new int[1];
//		int[] numberList = new int[qtdNumbers];
		for (int i = 0; i < qtdNumbers; i++) {
			System.out.println("Digite um numero: ");
			number[i] = sc.nextInt();

			}


	    maior = number[0];
	    posmaior = 0;

	    for (int i=1; i<qtdNumbers; i++) {
	        if (number[i] > maior) {
	            maior = number[i];
	            posmaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}
}
	

