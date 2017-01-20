/*
2017.01.19
Chap 8. Practice ,it is writed by st.
*/

public class ReferenceType{
	
	public static void main(String[] args){
		ReferenceType test = new ReferenceType();
		//test.wantToStopIntheMiddle(true);
		//test.wantToStopIntheMiddle1();
		//MemberDTO.staticMethod();
		
		//test.checkMemberDTOName();
		//test.makeStaticBlock();
		//test.callPassByVal();
		test.calculateNumbers(4,1,2);
	}
	
	public void calculateNumbers(int... _number){
		int total =0;
		for(int i:_number){
			total += i;
		}
		System.out.println("total = "+total);
	}
	/*
	
	public void callPassByVal(){
		int a=10;
		String b="b";
		MemberDTO member = new MemberDTO("SUNGTAE");
		passByVal(a,b,member);
		
		System.out.println("callByVal method result! ");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		System.out.println("member.name "+ member.name);
	}
	
	public void passByVal(int _a, String _b, MemberDTO _member){
		_a=20;
		_b="z";
		//_member = new MemberDTO("DOHYUN");
		_member.name = "DOHYUN";
		System.out.println("passByVal method result! ");
		System.out.println("a= " +_a);
		System.out.println("b= " +_b);
		System.out.println("member.name "+ _member.name);
	}
	
	
	public void wantToStopIntheMiddle(boolean _flag)
	{
		System.out.println("1");
		System.out.println("2");
		
		if(_flag)return;
		
		System.out.println("4");
	}
	
	
	public void wantToStopIntheMiddle1()
	{
		System.out.println("1");
		System.out.println("2");
		
		if(true)return;
		
		System.out.println("4");
	}
	
	public void checkMemberDTOName(){
		
		MemberDTO dto1 = new MemberDTO("SUNG TAE");
		System.out.println(dto1.name);
		MemberDTO dto2 = new MemberDTO("DO HYUN");
		System.out.println(dto1.name);
	}
	
	public void makeStaticBlock(){
		System.out.println("data = " + StaticBlock.getData());
		
		System.out.println("creating block ! ");
		StaticBlock testStatic = new StaticBlock();
		System.out.println("created block ! ");
		
		System.out.println("creating block2 ! ");
		StaticBlock testStatic2 = new StaticBlock();
		System.out.println("created block2 ! ");
		
		System.out.println("data = " + StaticBlock.getData());
		
	}
	*/
}

/*
class MemberDTO{
		public static void staticMethod(){
			System.out.println("this is static method");
	}
}

*/