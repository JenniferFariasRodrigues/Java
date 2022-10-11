package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("Entrada:");
		System.out.println("Nome: ");
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		System.out.println();
		System.out.printf("Final grade: %.2f%n",student.gradeData());
		if (student.gradeData() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f POINTS%n", (60 - student.gradeData()) );
		}

		{
			sc.close();

		}

	}

}
