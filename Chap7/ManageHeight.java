public class ManageHeight{
	
	//int  gradeHeight[][]= new int[5][];        // ���� ��ȿ����� �ν��Ͻ� ������ ���� ����, �µ����Ϳ��� �྿ �ʱ�ȭ ��Ŵ
	static int gradeHeight[][] = {{ 170, 180, 173, 175, 177 }, // static���� �������� �����Լ����� gradeHeight�� �����ؾ��ϱ� ������ static���� ����(main �Լ��� ����ƽ�̱� ������ ����ƽ �Լ������� ����ƽ ������ ��������)
								  { 160, 165, 167, 186 },
								  { 158, 177, 187, 176 },
								  { 173, 182, 181 },
								  { 170, 180, 165, 177, 172 }};

	public static void main(String[] args){
		
		int count=1;
		ManageHeight test = new ManageHeight();
		//test.setData();                        // �������� �� �����͸� �ʱ�ȭ �ϱ����� ȣ��
		
		/*
		for(int i=1; i<gradeHeight.length+1; i++){
			System.out.println("Class no. "+ i);
			test.printHeight(i);
			}
			*/                                    // 6������ �ּ��϶�� ��
			
		while(count<6){
			System.out.println("Class no. "+ count);
			test.printAverage(count);
			count++;
		}
	}
	
	/*
	public void setData(){ // �྿ �ʱ�ȭ �ϴ¹� ����
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