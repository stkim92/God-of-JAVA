/*
2017.01.19
Chap 8. Practice ,it is writed by st.
*/

public class StaticBlock{
	static int data = 1;
	public StaticBlock(){
		System.out.println("staticblock contributor");
	}
	static {
		System.out.println("----first-----");
		data = 3;
	}
	
	static {
		System.out.println("----second-----");
		data = 6;
	}
	
	public static int getData(){
		return data;
	}
}