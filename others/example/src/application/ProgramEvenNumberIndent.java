package application;

import java.util.Locale;
import java.util.Scanner;
import entities.EvenNumber;

public class ProgramEvenNumberIndent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?: ");
		int qtdNumbers = sc.nextInt();
		EvenNumber evenNumber = new EvenNumber(null);
		int[] number = new int[qtdNumbers];
		double  count = 0;
		int[] evenList = new int[qtdNumbers];
		for (int i = 0; i < qtdNumbers; i++) {
			System.out.println("Digite um numero: ");
			number[i] = sc.nextInt();
			evenNumber.setNumber(number[i]);
			if (number[i] % 2 == 0) {
				evenList[i] = number[i];
				count++;
			}
		}
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < qtdNumbers; i++) {
			if (number[i] % 2 == 0) {
				System.out.println(evenList[i]);
			}
		}
		System.out.println("QUANTIDADE DE PARES " + count);

		sc.close();
	}

}
