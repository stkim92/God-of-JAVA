/*
2017.01.23
Chap 11. Practice ,it is writed by st.
*/

package c.inheritance;

public class ManageStu{
	
	public static void main(String[] args){
		ManageStu test = new ManageStu();
		test.checkReturn();
		
	}
	public void checkReturn(){
		Student a = new Student("KIM","SEOUL","010","stkim92@aa.aa");
		Student b = new Student("KIM","SEOUL","010","stkim92@aa.aa");
		
		if(a.equals(b)){
			System.out.println("Same");
		} else{
			System.out.println("Not same.");
		}
	}
}