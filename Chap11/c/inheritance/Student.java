 
 

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
	
	public boolean equals(Object _obj){
		if(this == _obj) return true;
		if(this == null) return false;
		if(getClass() != _obj.getClass()) return false;
		
		Student other = (Student)_obj;
		
		if(name ==null){
			if(other.name != null)
				return false;
		} else if ( ! name.equals(other.name))
			return false;
		
		if(addr ==null){
			if(other.addr != null)
				return false;
		} else if ( ! addr.equals(other.addr))
			return false;
		
		if(phone ==null){
			if(other.phone != null)
				return false;
		} else if ( ! phone.equals(other.phone))
			return false;
		
		if(email ==null){
			if(other.email != null)
				return false;
		} else if ( ! email.equals(other.email))
			return false;
		
		return true;
	}
}