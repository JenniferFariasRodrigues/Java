package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? : ");
		int n= sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<9;i++) {
			sc.nextLine();
			System.out.println("Digite um numero: ");
			int number= sc.nextInt();
			vect[i]=number;
		}
		System.out.println("NUMEROS:");

		for(int i=0;i<n;i++) {
			if(vect[i]<0) {
				System.out.println(vect[i] +" "+ "é um número negativo");
			}else {
				if((vect[i]>=0)) {
				System.out.println(vect[i]+"  "+"é um número positivo.");
			}
			}
		}
		sc.close();
	}
}
