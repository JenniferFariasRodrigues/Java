package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMedia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? : ");
		int qtdNumbers = sc.nextInt();
		double sum = 0.0,sumEven=0,  avg = 0.0, count = 0, mediaEven = 0;

		double[] vect = new double[qtdNumbers];

		for (int i = 0; i < qtdNumbers; i++) {
			sc.nextLine();
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
			if (vect[i] % 2 == 0) {
				sumEven= sumEven + vect[i];
				count++;
				mediaEven = sumEven / count;

			}

		}

		System.out.print("Valores:\n");
		for (int i = 0; i < qtdNumbers; i++) {
//			System.out.print("Valor posição "+i +"="+vect[i] + ", "); 
			System.out.print(vect[i]);
		}
		System.out.println("  ");
		avg = sum / qtdNumbers;
		System.out.println("Soma=" + sum);
		System.out.println("Media=" + avg);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < qtdNumbers; i++) {
			if (vect[i] < avg)
				System.out.println(vect[i]);
		}

		if (count == 0) {
			System.out.println("NENHUM NUMERO PAR");

		} else {
			System.out.println("MEDIA NUMEROS PARES: ");
			System.out.println(mediaEven);
		}

	}

}
