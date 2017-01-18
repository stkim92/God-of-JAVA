/*
2017.01.16 
Chap 3. Practice ,it is writed by st.
*/

public class Profile{
	
	String name;
	int age; //  변수를 선언할때, 전역 변수처럼 아래의 메소드에서 참조하려면 메인 함수 위에 선언 ( 한글 주석오류날때는 notepad++의 인코딩-> ANSI로 변환 하여 저장
	
	public static void main(String[] args){
		
		Profile profilePractice = new Profile();

		profilePractice.setName("Min");
		profilePractice.setAge(20);
		profilePractice.printName();
		profilePractice.printAge();
		
		}
		
		public void setName(String _str){
			//name=_str;
			name=_str;
		}
		
		public void setAge(int _val){
			age=_val;
		}
		
		public void printName(){
			System.out.println("name = "+name);
		}
		
		public void printAge(){
			System.out.println("age = "+age);
		}
		
		
}