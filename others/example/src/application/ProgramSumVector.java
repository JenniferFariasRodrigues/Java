package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSumVector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int qtdNumbers = sc.nextInt();
		double[] vectorA = new double[qtdNumbers];
		double[] vectorB = new double[qtdNumbers];
		double[] vectorAB = new double[qtdNumbers];


		System.out.print("Digite os valores do vetor A: ");
		for (int i = 0; i < qtdNumbers; i++) {
//			System.out.println("Digite um numero: ");
			vectorA[i] = sc.nextInt();

		}
		
		System.out.print("Digite os valores do vetor B: ");
		for (int i = 0; i < qtdNumbers; i++) {
//			System.out.println("Digite um numero: ");
			vectorB[i] = sc.nextInt();

		}
		System.out.print("VETOR RESULTANTE: ");
		for (int i = 0; i < qtdNumbers; i++) {
//			System.out.println("Digite um numero: ");
			vectorAB[i] =vectorA[i]+vectorB[i];
			System.out.println(vectorAB[i]);
		}
		

	}
}
