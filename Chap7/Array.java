/*
2017.01.18
Chap 7. Practice ,it is writed by st.
*/

public class Array{
	/*
	public void init(){
		int lottoNum[];
		lottoNum = new int[7];
		
		lottoNum[0] = 1;
		lottoNum[1] = 13;
		lottoNum[2] = 11;
		lottoNum[3] = 24;
		lottoNum[4] = 5;
		lottoNum[5] = 8;
		lottoNum[6] = 65;
	}
	public void primitiveType(){
		byte []byteArray = new byte[1];
		short []shortArray = new short[1];
		int intArray[] = new int[1];
		long longArray[] = new long[1];
		char charArray[] = new char[1];
		double doubleArray[] = new double[1];
		float floatArray[] = new float[1];
		
		System.out.println("byteArray : "+byteArray[0]);
		System.out.println("shortArray : "+shortArray[0]);
		System.out.println("intArray : "+intArray[0]);
		System.out.println("longArray : "+longArray[0]);
		System.out.println("charArray : "+charArray[0]);
		System.out.println("doubleArray : "+doubleArray[0]);
		System.out.println("floatArray : "+floatArray[0]);
		
	}
	
	
	
	public void referenceTypes(){
		String stringTest[] = new String[2];
		Array arrayTest[] = new Array[2];
		stringTest[0] = "hihihi everyone !!";
		arrayTest[0] = new Array();
		System.out.println("String[0] : "+stringTest[0]);
		System.out.println("String[1] : "+stringTest[1]);
		System.out.println("arrayTest[0] : "+arrayTest[0]);
		System.out.println("arrayTest[1] : "+arrayTest[1]);
		
		System.out.println("stringTest : "+stringTest);
		System.out.println("arrayTest : "+arrayTest);
	}
	
	public void otherInit(){
		int lottoNum[] = {1,2,3,4,5,6};
		String stringTest1[] = new String[1]; // String을 참조 자료형처럼 선언하면 인덱로 참조 가능 아니면 해시값나옴
		stringTest1[0] = "asdasdasd"; //
		String stringTest = "gggiggigi"; //String을 기본 자료형처럼 선언하면 인덱스를 추가하지 않고 참조가능
		
		System.out.println(lottoNum[0]);
		System.out.println(stringTest);
		System.out.println(stringTest1[0]);
	}
	
	public void twoDim(){

		int twoDim[][] = new int[3][5];
		
		System.out.println(twoDim.length);
		System.out.println(twoDim[0].length);
		System.out.println(twoDim[1].length);
	}
	
	
	
	public void printArray(){
		int twoDim[][] = {{1,2,3},{4,5,6}};
		int twoDimLeng = twoDim.length;
		System.out.println("twoDim.length : " + twoDim.length);
		System.out.println("twoDim[0].length : " + twoDim[0].length);
		
		for(int i=0; i<twoDimLeng; i++){
			for(int j=0; j<twoDim[0].length; j++){
				System.out.println("twoDim ["+i+"]["+j+"]="+twoDim[i][j]);
			}
		}
	}
	*/
	public static void main(String[] args){
		Array testArry = new Array();
		//testArry.init();
		//testArry.primitiveType();
		//testArry.referenceTypes();
		//testArry.otherInit();
		//testArry.twoDim();
		//testArry.printArray();
		
		if(args.length>0){
			/*
			for(String arg : args){
				System.out.println(arg);
			}
			*/
			for(int i=0; i<args.length; i++){
				System.out.println(args[i]);
			}
		}
	}
}