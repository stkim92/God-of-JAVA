/*
2017.01.16 
Chap 3. Practice ,it is writed by st.
*/

public class Profile{
	
	String name;
	int age; //  ������ �����Ҷ�, ���� ����ó�� �Ʒ��� �޼ҵ忡�� �����Ϸ��� ���� �Լ� ���� ���� ( �ѱ� �ּ����������� notepad++�� ���ڵ�-> ANSI�� ��ȯ �Ͽ� ����
	
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