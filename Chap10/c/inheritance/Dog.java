/*
2017.01.223
Chap 10. Practice ,it is writed by st.
*/

package c.inheritance;

public class Dog extends Animal{
	//String color; //Animal 클래스로 이동
	
	public void move(){
		System.out.println("move!!! - Dog");
	}
	
	public void eatFood(){
		System.out.println("eatFood !!! - Dog");
	}
}