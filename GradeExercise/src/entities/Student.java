package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double gradeData() {
		double totalData=grade1+grade2+grade3;
		return totalData;
	}
	
	
}
