package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Percent;

public class ProgramPercentIndent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas?: ");
		int qtdNumbers  = sc.nextInt();
		double sum = 0.0, avgHeight = 0.0, percentData=0,count=0;		
		String [] nomes = new String[qtdNumbers ];
		int[] idades = new int[qtdNumbers ];
		double[] altura = new double[qtdNumbers ];
		Percent percent = new Percent("Nat", 29,1.68);
		String [] nomesAdd = new String[qtdNumbers ];
		for(int i=0;i<qtdNumbers ;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.println("Nome: ");
			nomes[i]=sc.next();
			percent.setName(nomes[i]);
			System.out.println("Idade: ");
			idades[i]=sc.nextInt();
			percent.setAge(idades[i]);
			System.out.println("Altura: ");
			altura[i]=sc.nextDouble();
			percent.setHeigth(altura[i]);
			
			sum += percent.getHeigth();
			if(percent.getAge()<16) {
				count ++;
				nomesAdd[i]=percent.getName();
			}
		}
		avgHeight =sum/qtdNumbers;
		System.out.print("Altura média: "+avgHeight);
		System.out.println(" ");
		percentData=(count*100)/qtdNumbers;
		System.out.println("Pessoas com menos de 16 anos: "+percentData+" %");
//		for(int i=0;i<vect.length;i++) {
//			System.out.println("Nome menor 16 anos:"+nomesAdd[i]);
//
//	}
		for(int i=0;i<qtdNumbers ;i++) {
			if(idades[i]<16) {
		     System.out.println("Nome: "+nomes[i]);
		    }
		}

		
	}

}
