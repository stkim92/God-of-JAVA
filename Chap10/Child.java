package c.inheritance;

public class Child extends Parent{
	public Child(){
		super(null);
		System.out.println("Child Constructor1.");
	}
	
	public void printAge(){
		System.out.println("printAge() - 18menth");
	}
	
	public void printName(){
		System.out.println("printName() - Child");
	}
}