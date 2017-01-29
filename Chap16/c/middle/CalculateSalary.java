package c.middle;

public class CalculateSalary{
	public static void main(String[] args){
		CalculateSalary test = new CalculateSalary();
		test.calculateSalaries();
	}
	
	public long getSalaryIncrease(Employee _employee){
		long salary=_employee.getSalary();
		if(_employee.getType() == 1){
			//System.out.println("type = 1");
			salary *= 0.05;
			return salary;
		} else if( _employee.getType() == 2){
			//System.out.println("type = 2");
			salary *=1.1;
			return salary;
		} else if( _employee.getType() == 3){
			//System.out.println("type = 3");
			salary *=1.2;
			return salary;
		} else if( _employee.getType() == 4){
			//System.out.println("type = 4");
			salary *=1.3;
			return salary;
		} else if( _employee.getType() == 5){
			//System.out.println("type = 5");
			salary *=2.0;
			return salary;
		} else{
			System.out.println(" 잘못 입력 ");
			return 0;
		}
	}
	
	public void calculateSalaries(){
		Employee test[] = new Employee[5];
		test[0] = new Employee("LeeDaeRi",1,1000000000);
		test[1] = new Employee("KimManager",2,100000000);
		test[2] = new Employee("Whangdesign",3,70000000);
		test[3] = new Employee("ParkArchi",4,80000000);
		test[4] = new Employee("LeeDevelop",5,60000000);
		
		for(int i=0; i<5; i++){
			System.out.println(test[i].getName() + " = " + getSalaryIncrease(test[i]));
			
			
		}
	}
}