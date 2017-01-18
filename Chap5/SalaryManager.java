/*
2017.01.17 
Chap 5. Practice ,it is writed by st.
*/

public class SalaryManager{
	
	public double getMonthlySalary(double _yearlySalary){
		double monthSal = 0;
		double workTax =0;
		double pensionTax = 0;
		double healthTax = 0;
		double sumTax = 0;
		
		monthSal = _yearlySalary/12; // 12로 나누는 것이랑 12.0으로 나누는것이랑 차이가 조금 남
		workTax = calculateTax(monthSal);
		System.out.println(monthSal);
		pensionTax = calculatePension(monthSal);
		healthTax = calculateHealth(monthSal);
		sumTax = workTax + pensionTax + healthTax;
		monthSal -= sumTax;
		System.out.println("workTax : "+workTax);
		System.out.println("pensionTax : "+pensionTax);
		System.out.println("healthTax : "+healthTax);
		return monthSal;
		
	}
	public double calculateTax(double _monthSal){
		double workTax = 0;
		workTax = _monthSal *((double)125/1000);
		return workTax;
	}
	
	public double calculatePension(double _monthSal){
		double pensionTax = 0;
		pensionTax = _monthSal *((double)81/1000);
		return pensionTax;
	}
	
		public double calculateHealth(double _monthSal){
		double healthTax = 0;
		healthTax = _monthSal *((double)135/1000);
		return healthTax;
	}
	
	public static void main(String[] args){
		SalaryManager test = new SalaryManager();
		System.out.println(test.getMonthlySalary(20000000));
		
	}
}