public class ManageHeight{
	
	//int  gradeHeight[][]= new int[5][];        // 교제 답안에서는 인스턴스 변수를 선언 한후, 셋데이터에서 행씩 초기화 시킴
	static int gradeHeight[][] = {{ 170, 180, 173, 175, 177 }, // static으로 한이유는 메인함수에서 gradeHeight를 참조해야하기 때문에 static으로 선언(main 함수도 스태틱이기 때문에 스태틱 함수에서는 스태틱 변수만 참조가능)
								  { 160, 165, 167, 186 },
								  { 158, 177, 187, 176 },
								  { 173, 182, 181 },
								  { 170, 180, 165, 177, 172 }};

	public static void main(String[] args){
		
		int count=1;
		ManageHeight test = new ManageHeight();
		//test.setData();                        // 교제에서 는 데이터를 초기화 하기위해 호출
		
		/*
		for(int i=1; i<gradeHeight.length+1; i++){
			System.out.println("Class no. "+ i);
			test.printHeight(i);
			}
			*/                                    // 6번에서 주석하라고 함
			
		while(count<6){
			System.out.println("Class no. "+ count);
			test.printAverage(count);
			count++;
		}
	}
	
	/*
	public void setData(){ // 행씩 초기화 하는법 참고
		gradeHeight[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeight[1] = new int[] { 160, 165, 167, 186 };
		gradeHeight[2] = new int[] { 158, 177, 187, 176 };
		gradeHeight[3] = new int[] { 173, 182, 181 };
		gradeHeight[4] = new int[] { 170, 180, 165, 177, 172 };
		
	}
		*/ 
	
	public void printHeight(int _class){
		for(int i=0; i<gradeHeight[_class-1].length; i++){
			System.out.println(gradeHeight[_class-1][i]);
		}
		
	}
	
	public void printAverage(int _class){
		double averageSum = 0;
		for(int i=0; i<gradeHeight[_class-1].length; i++){
			averageSum += gradeHeight[_class-1][i];
		}
		System.out.println(averageSum/gradeHeight[_class-1].length);
	}
	
}