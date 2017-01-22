/*
2017.01.17 
Chap 5. Practice ,it is writed by st.
*/

package b.operater;

public class Operators{
	/*
	public void additive(){
		System.out.println("** additive test **");
		int intVal1=5;
		int intVal2=10;
			
		int result=intVal1+intVal2;
		System.out.println(result);
		result=intVal2-intVal1;
		System.out.println(result);
		}
		
	public void multiplicative(){
			System.out.println("** multiplicative test **");
			int intVal1=5;
			int intVal2=10;
			
			int result=intVal1*intVal2;
			System.out.println(result);
			result=intVal2/intVal1;
			System.out.println(result);
			float result1=(float)intVal1/intVal2;
			System.out.println(result1);
		}
	public void remainder(){
		System.out.println("** remainder test **");
		int intVal1=53;
		int intVal2=10;
		int result=intVal1%intVal2;
		System.out.println(result);
	}
	
	public void compound(){
		System.out.println("** compound test **");
		int intVal1=10;
		intVal1 += 5;
		System.out.println(intVal1);
		
		intVal1 -= 5;
		System.out.println(intVal1);
		
		intVal1 *= 5;
		System.out.println(intVal1);
		
		intVal1 /= 5;
		System.out.println(intVal1);
		
		intVal1 %= 5;
		System.out.println(intVal1);
	}
	
	public void increDcre(){
		System.out.println("** increDcre test **");
		int intVal1=1;
		System.out.println(++intVal1);
		System.out.println(intVal1);
		System.out.println(intVal1++);
	}
	
	
	public void compliment(){
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
	}
	
	
	public void comparison(){
		int intVal1=1;
		int intVal2=2;
		int intVal3=1;
		
		System.out.println(intVal1==intVal2);
		System.out.println(intVal1==intVal3);
		
		System.out.println(intVal1!=intVal2);
		System.out.println(intVal1!=intVal3);
		
		System.out.println("*******************");
		
		char charVal='a';
		System.out.println(97==charVal);
		double doubleVal=1.0;
		System.out.println(intVal1==doubleVal);
		
	}
	
	
	
	public void comparison2(){
		int intVal1=1;
		int intVal2=2;
		System.out.println(intVal1>intVal2);
		System.out.println(intVal1<intVal2);
		
		System.out.println(intVal1>=intVal2);
		System.out.println(intVal1<=intVal2);
		
	}
	
	public void condition(){
		boolean x = true;
		boolean y = true;
		
		System.out.println(x && y);
		System.out.println(x || y);
		
		x = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		
		y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
	}
	
	
	public boolean doBlindDate(int point){
		boolean doBlindDateFlag=false;
		doBlindDateFlag = (point>80) ? true : false;
		System.out.println(point+" : "+doBlindDateFlag);
		return doBlindDateFlag;
	}
	
	public int pointCheck(int _point){
		int checkFlag = 0;
		checkFlag = (_point>80) ? 100 : 0;
		System.out.println(checkFlag);
		return checkFlag;
		
	}
	*/
	
	public void casting(){
		byte byteVal=127;
		short shortVal=byteVal;
		
		shortVal++;
		shortVal+=256;
		System.out.println(shortVal);
		byteVal=(byte)shortVal;
		System.out.println(byteVal);
		
	}
	public static void main(String[] args){
		Operators test = new Operators();
		//test.additive();
		//test.multiplicative();
		//test.remainder();
		//test.compound();
		//test.increDcre();
		//test.compliment();
		//test.comparison();
		//test.comparison2();
		//test.condition();
		//test.doBlindDate(81);
		//test.doBlindDate(79);
		//test.pointCheck(81);
		test.casting();
		}
}