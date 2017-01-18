/*
2017.01.16 
Chap 3. Practice ,it is writed by st.
*/

public class Calculator{
	public static void main(String[] args){
		Calculator calcPractice = new Calculator();
		int a=5;
		int b=3;
		System.out.println(calcPractice.sub(2,1));
		System.out.println(calcPractice.sub(a,b));
	}
	public int sub(int _num1, int _num2){
		return _num1-_num2;
	}
	
	public int mul(int _num1, int _num2){
		return _num1*_num2;
	}
	
	public int div(int _num1, int _num2){
		return _num1/_num2;
	}
	
	
}

q1. 임도현이라는 클래스와 생성자를 통해 객체를 만들어보세요, 