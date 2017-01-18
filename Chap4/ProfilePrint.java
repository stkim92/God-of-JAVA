/*
2017.01.17 
Chap 4. Practice ,it is writed by st.
*/

public class ProfilePrint{
	byte age;
	String name;
	boolean isMarried;
	
	public void setAge(byte _age){
		age = _age;
	}
	
	public byte getAge(){
		return age;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public String getName(){
		return name;
	}
	
	public void serMarried(boolean _flag){
		isMarried = _flag;
	}
	
	public boolean isMarried(){
		return isMarried;
	}
	
	public static void main(String[] args){
		ProfilePrint test = new ProfilePrint();
		test.setAge((byte)26);
		test.setName("KST");
		test.serMarried(false);
		
		System.out.println(test.getAge());
		System.out.println(test.getName());
		System.out.println(test.isMarried());
	}
}