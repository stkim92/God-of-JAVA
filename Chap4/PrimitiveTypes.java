/*
2017.01.17 
Chap 4. Practice ,it is writed by st.
*/

public class PrimitiveTypes{
	public static void main(String[] args){
		PrimitiveTypes Type = new PrimitiveTypes();
		Type.checkByte();
		Type.checkChar();
	}
	public void checkByte(){
		byte byteMin=-128;
		byte byteMax=127;
		System.out.println("byteMin="+byteMin);
		System.out.println("byteMax="+byteMax);
		byteMin--;
		byteMax++;
		System.out.println("byteMin--="+byteMin);
		System.out.println("byteMax++="+byteMax);
	}
	
	public void checkOtherTypes(){
		short shortMax=32767;
		int intMax=2147483647;
		long longMax=9223372036854775807l;
	}
	public void checkChar(){
		char charMin='\u0000';
		char charMax='\uffff';
		System.out.println("charMin=["+charMin+"]");
		System.out.println("charMax=["+charMax+"]");
		int intValue='a';
		System.out.println("intValue=["+intValue+"]");
	}
}