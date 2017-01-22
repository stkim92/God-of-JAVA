/*
2017.01.223
Chap 10. Practice ,it is writed by st.
*/

package c.inheritance;

public class Cat extends Animal{
	//boolean male; //Animal 클래스로 이동
	
	public void move(){
		System.out.println("move!!! - Cat");
	}
	
	public void eatFood(){
		System.out.println("eatFood !!! - Cat");
	}
}