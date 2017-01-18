/*
2017.01.17 
Chap 5. Practice ,it is writed by st.
*/

public class InterestManager{
	
	public double getInterestRate(int _day){
		if(_day < 90 && _day > 0){
			return 0.005;
		} else if(_day < 180){
			return 0.01;
		} else if(_day < 364){
			return 0.02;
		} else {
			return 0.56;
		}
		
	}
		
	public double calculateAmount(int _day, long _amount){
		double interestSum = getInterestRate(_day)*_amount;
		double totalSum = interestSum + _amount;
		return totalSum;
	}
	
	public static void main(String[] args){
		
		double totalSum =0;
		double interestSum =0;
			
		InterestManager test = new InterestManager();

		for(int i=1; i<366; i++){
			
			totalSum = test.calculateAmount(i,1000000);
			interestSum = totalSum - 1000000;
			if(i%10 ==0){
			System.out.println(i+" : "+ interestSum);
			}
		}
	}
}