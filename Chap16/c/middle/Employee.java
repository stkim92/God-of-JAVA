package c.middle;

public class Employee{
	private String name;
	private int type;
	private long salary;
	
	Employee(String _name, int _type, long _salary){
		name = _name;
		type = _type;
		salary = _salary;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setType(int _type){
		type = _type;
	}
	
	public void setSalary(long _salary){
		salary = _salary;
	}
	
	public String getName(){
		return name;
	}
	
	public int getType(){
		return type;
	}
	
	public long getSalary(){
		return salary;
	}
}