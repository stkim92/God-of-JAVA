package c.javapackage.sub;
import c.javapackage.Package;

public class Sub{
	
	public final static String CLASS_NAME ="sub in sub.java";
	
	public Sub(){
		
	}
	
	public static void main(String[] args){
		Package test = new Package();
		
		test.packageClass();
	}
	
	public void subClassMethod(){
		
	}
	
	public static void subClassStaticMethod(){
		System.out.println("subClassStatic Method() is called. in Sub.java");
	}
	
	public void publicMethod(){
		
	}
	
	protected void protectedMethod(){
		
	}
	
	void packagePrivateMethod(){
		
	}
	
	private void privateMethod(){
		
	}
}