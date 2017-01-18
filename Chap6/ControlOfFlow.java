/*
2017.01.17 
Chap 5. Practice ,it is writed by st.
*/

public class ControlOfFlow{
	/*
	public void ifStatement(){
		if(true);
		if(true) System.out.println("it's true");
		if(true)
			System.out.println("이것도 트루");
		if(false) System.out.println("its false");
	}
	
	public void ifStatement2(){
		int intVal=5;
		if(intVal>5) System.out.println("5보다 큼.");
		else System.out.println("5보다 작거나 같음.");
		
		if(intVal<=5)
			System.out.println("5보다 작거나 같음.");
		else
			System.out.println("5보다 큼.");
	}
	
	
	public void ifStatement3(){
		int age = 25;
		boolean ismarried = true;
		if(age>25 && ismarried ){
			System.out.println("25세 이상이며 결혼을 했음.");
		}
		if(age>25 || ismarried ){
			System.out.println("25세 초과이거나 결혼을 했음.");
		}
		double height = 180;
		if(age>25 || ismarried && height >= 180){
			System.out.println("25세 초과이거나 결혼을 했고 키가 180 이상임.");
		}
	}
	
	
	public void ifStatement4(int point){
		if(point>90){
			System.out.println("A");
		}else if(point>80){
			System.out.println("B");
		}else if(point>70){
			System.out.println("C");
		}else if(point>60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
	
	
	public void switchStatement(int numberOfWheel){
		switch(numberOfWheel){
			case 1:
			System.out.println("it is one foot bicycle");
			//break;
			
			case 2:
			System.out.println("it is a motor cycle or bicycle.");
			//break;
			
			case 3:
			System.out.println("it is a three wheel car");
			break;
			
			default:
			System.out.println("제일 비싼차");
			break;
		}
	}
	
	public void switchStatement1(int month){
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println(month+" has 31 days");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println(month+" has 30 days");
			break;
			case 2:
			System.out.println(month+" has 28 days");
			break;
			default:
			System.out.println(month+" is not a month");
			break;
		}
	}
	
	public void whileLoop(){
		int loop =0;
		do{
			loop++;
			switchStatement1(loop);
		}while(loop<12);
	}
	*/
	public void forLoop(int _until){
		int sum = 0;
		for( int loop = 0; loop<=_until; loop++){
			sum += loop;
		}
		System.out.println("1에서~"+_until+"="+sum);
	}
	
	
	public static void main(String[] args){
		ControlOfFlow test = new ControlOfFlow();
		//test.ifStatement();
		//test.ifStatement2();
		//test.ifStatement3();
		//test.ifStatement4(77);
		//test.switchStatement(98);
		//test.switchStatement1(3);
		//test.whileLoop();
		test.forLoop(10);
	}
}