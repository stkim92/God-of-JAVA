/*
2017.01.23
Chap 11. Practice ,it is writed by st.
*/

package c.inheritance;



public class InheritanceObj{
	int a= 0;
	String name;
	public InheritanceObj(int _a, String _name){
		System.out.println("매개 변수 a : "+ _a + "매개 변수 name : " + _name);
		this.a = _a;
		this.name = _name;
	}
	public static void main(String[] args){
		//InheritanceObj test = new InheritanceObj(1,"kst");
		//System.out.println(test);
		//test.toStringMethod(test);

		
		
	}
	/*
	public void toStringMethod(InheritanceObj obj){
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus "+obj);
		
	}*/
	public String toString(){
		return "Name = "+name+"int a = "+a;
	}
	

}