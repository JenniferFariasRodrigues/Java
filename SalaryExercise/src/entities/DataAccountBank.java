package entities;

public class DataAccountBank {
	//holder
	public String name;
	//number
	public double accountNumber;
	//balance
	public double valueDeposit;
	

	public double valueInitialDeposit;
	public String statusDeposit;
	public double grossSalary;
	public double tax;
	
//	public DataAccountBank(String name, double accountNumber, double valueInitialDeposit, String statusDeposit,
//			double grossSalary, double tax) {
//		super();
//		this.name = name;
//		this.accountNumber = accountNumber;
//		this.valueInitialDeposit = valueInitialDeposit;
//		this.statusDeposit = statusDeposit;
//		this.grossSalary = grossSalary;
//		this.tax = tax;
//	}
//	public DataAccountBank(String name, double accountNumber) {
//		super();
//		this.name = name;
//		this.accountNumber = accountNumber;
//		
//	}

	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getAccountNumber() {
		return accountNumber;
	}


	public double getValueDeposit() {
		return valueDeposit;
	}

	public double getValueInitialDeposit() {
		return valueInitialDeposit;
	}


	public void setValueInitialDeposit(double valueInitialDeposit) {
		this.valueInitialDeposit = valueInitialDeposit;
	}


	public String getStatusDeposit() {
		return statusDeposit;
	}


	public void setStatusDeposit(String statusDeposit) {
		this.statusDeposit = statusDeposit;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}

	public double increaseDepositValue(double valueIncrease) {
		   return valueDeposit+valueIncrease;
	   }
	
   public double decrementDepositValue(double valueDecrement) {
	   return increaseDepositValue(valueDecrement)-5;
	   
   }
	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;

	}

	public String toString() {
		return name + " ,$ " + String.format("%.2f", netSalary());
	}

}
