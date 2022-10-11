package entities;

public class Percent {
	private String name;
	private int age;
	private double heigth;
	
	public Percent(String name, int age, double height) {
//		super();
		this.name = name;
		this.age = age;
		this.heigth=height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public String toString() {
		return name + ", " + age+ ","+heigth;
		}

}
