package c.exception.practice;

public class Calculator{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		try{
			calc.printDivede(1,2);
			calc.printDivede(1,0);
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void printDivede (double _d1, double _d2)throws Exception{
		//try{
		{
			double result =_d1/_d2;
			System.out.println(result);
			throw new Exception("�ι������� 0�̵ɼ� �����");
		} //catch(Exception e){
		//	e.printStackTrace();
		//}
		
	}
}