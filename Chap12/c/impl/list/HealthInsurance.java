package c.impl.list;

public enum HealthInsurance{
	LEVEL_ONE(1000, 1.0),
	LEVEL_TWO(2000, 2.0),
	LEVEL_THREE(3000, 3.2),
	LEVEL_FOUR(4000, 4.5),
	LEVEL_FIVE(5000, 5.6),
	LEVEL_SIX(6000, 7.1);
	
	private final int maxSalary;
	private final double ratio;
	
	HealthInsurance(int _maxSalary, double _ratio){
		this.maxSalary = _maxSalary;
		this.ratio = _ratio;
	}
	
	public double getRatio(){
		return ratio;
	}
	
	public static HealthInsurance getHealthInsurance(int _salary){
		if(_salary < 1000 && 0 <= _salary) {
			return LEVEL_ONE;
		} else if(_salary<2000 && 1000 <= _salary ) {
			return LEVEL_TWO;
		} else if(_salary<3000 && 2000 <= _salary) {
			return LEVEL_THREE;
		} else if(_salary<4000 && 3000 <= _salary) {
			return LEVEL_FOUR;
		} else if(_salary<5000 && 4000 <= _salary) {
			return LEVEL_FIVE;
		} else {
			return LEVEL_SIX;
		}
	}
	
	public static void  main(String[] args) {
		int salaryArray[]=new int[]{1500,5500,8000};
		
		HealthInsurance[] insurances=new HealthInsurance[3];
		
		insurances[0]=HealthInsurance.getHealthInsurance(salaryArray[0]);
		insurances[1]=HealthInsurance.getHealthInsurance(salaryArray[1]);
		insurances[2]=HealthInsurance.getHealthInsurance(salaryArray[2]);
		
		for(int i=0; i<3; i++) {
			System.out.println(salaryArray[i]+"="+insurances[i]+","+insurances[i].getRatio());
		}
	}
	
	
	
}