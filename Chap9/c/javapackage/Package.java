package c.javapackage;
import c.javapackage.sub.Sub;
//import static c.javapackage.sub.Sub.*;

//import c.javapackage.sub.Sub;

public class Package{
	public static void main(String[] args){
		System.out.println("Package class");
		Sub sub = new Sub();
		sub.publicMethod();
		sub.protectedMethod();
		sub.packagePrivateMethod();
		sub.privateMethod();
		
		
		subClassStaticMethod();
		System.out.println(CLASS_NAME);
		
		
}

	public final static String CLASS_NAME ="sub in Package.java";
	public static void subClassStaticMethod(){
		System.out.println("subClassStatic Method() is called. in Package.java");
	}
	
	public void packageClass(){
		System.out.println("This is package class");
	}
}