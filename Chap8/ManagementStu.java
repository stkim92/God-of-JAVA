/*
2017.01.19
Chap 8. Practice ,it is writed by st.
*/

public class ManagementStu{
	
	public static void main(String[] args){
		Student student[];
		ManagementStu test = new ManagementStu();
		student = test.addStudent();
		test.printStudent(student);
		
	}
	
	public Student[] addStudent(){
		Student[] _stu = new Student[3];
		_stu[0] = new Student("kim");
		_stu[1] = new Student("min");
		_stu[2] = new Student("seook", "seoul", "010101012", "stkim@as.as");
		return _stu;
		
	}
	
	public void printStudent(Student[] _stu){
		for(int i=0; i<_stu.length; i++){
			System.out.println(_stu[i]);
		}
		
	}
	
}