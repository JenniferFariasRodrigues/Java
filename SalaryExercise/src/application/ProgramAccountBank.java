package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DataAccountBank;
import entities.Employee;

public class ProgramAccountBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DataAccountBank dataAccountBank = new DataAccountBank();

		System.out.println("Data account: ");
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit(y/n)?");
		char response = sc.next().charAt(0);

		if(response =='n') {
			System.out.println("Account data no answer:");
			System.out.println(" Account if: "+dataAccountBank.accountNumber +",Holder: "+dataAccountBank.name  +",Balance:$ "+0);
			
			
		}else if(response=='y'){
			System.out.println("Enter initial deposit value: ");
			dataAccountBank.valueDeposit= sc.nextDouble();
			
			System.out.println("Account data yes answer:");
			System.out.println(" Account else: "+dataAccountBank.accountNumber +",Holder: "+dataAccountBank.name  +",Balance:$ "+dataAccountBank.valueDeposit);
	
			
		}
			
	
		System.out.println("Enter a deposit value: ");
		double valueIncrease = sc.nextDouble();
		
		System.out.println();
		System.out.println(" Update Account data increase: ");
		System.out.println(" Account: "+dataAccountBank.accountNumber +",Holder: "+dataAccountBank.name  +",Balance:$ "+dataAccountBank.increaseDepositValue(valueIncrease));

		System.out.println();
		System.out.println(" Enter a withdraw value: ");
		double valueDecrement = sc.nextDouble();

		System.out.println(" Update Account data decrease");
		double dataDecrease=dataAccountBank.increaseDepositValue(valueIncrease)-valueDecrement-5;

		System.out.println(" Account: "+dataAccountBank.accountNumber +",Holder: "+dataAccountBank.name  +",Balance:$ "+dataDecrease);



	}

}
