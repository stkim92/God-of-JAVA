/*
2017.01.19
Chap 8. Practice ,it is writed by st.
*/

public class Student{
	String name;
	String addr;
	String phone;
	String email;
	
	public Student(){
		
	}
	
	public Student(String _name){
		name=_name;
	}
	
	public Student(String _name, String _addr, String _phone, String _email){
		name = _name;
		addr = _addr;
		phone = _phone;
		email = _email;
	}
	
	public String toString(){
		return name+" "+addr+" "+phone+" "+email;
		
	}
}