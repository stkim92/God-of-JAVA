/*
2017.01.19
Chap 8. Practice ,it is writed by st.
*/

public class MemberDTO{
	public String name; 
	public String phone;
	
	public MemberDTO(){
		
	}
	
	public MemberDTO(String _name){
		this.name = _name;
	}
	
	public MemberDTO(String _name, String _phone){
		this.name = _name;
		this.phone = _phone;
	}
	

	
		public static void staticMethod(){
			System.out.println("this is static method");
			//System.out.println(name);
	}
}

