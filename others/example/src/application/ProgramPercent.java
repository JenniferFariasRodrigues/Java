package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPercent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();
		double sum = 0.0, avgHeight = 0.0, percent=0,count=0;
		double[] vect = new double[n];
		
		String [] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.println("Nome: ");
			nomes[i]=sc.next();
			System.out.println("Idade: ");
			idades[i]=sc.nextInt();
			System.out.println("Altura: ");
			altura[i]=sc.nextDouble();
		
			sum += altura[i];
			if(idades[i]<16) {
				count ++;
					
			}
			
		}
		avgHeight =sum/vect.length;
		System.out.print("Altura média: "+avgHeight);
		System.out.println(" ");
		percent=(count*100)/vect.length;
		System.out.println("Pessoas com menos de 16 anos: "+percent+" %");
		
		for(int i=0;i<vect.length;i++) {
			if(idades[i]<16) {
		     System.out.println("Nome: "+nomes[i]);
		    }
		}
		sc.close();
	}

}
