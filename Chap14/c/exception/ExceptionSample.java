package c.exception;

public class ExceptionSample{
	public static void main(String[] args){
		ExceptionSample sample = new ExceptionSample();
		//sample.arrayOutOutBound();
		//sample.multiCatch();
		//sample.thowable();
		try{
			sample.throwException2(13);
		} catch (MyException e){
			e.printStackTrace();
		}
		
		
	}
	
	public void arrayOutOutBound(){
		int intArr[] = new int[5];
		
		
		try{
		//int intArr[] = new int[5];
		System.out.println(intArr[4]);
		System.out.println("sould run");
		
		} catch (Exception e){
			System.out.println("Exception run");
			System.out.println(intArr.length);
		} finally {
			System.out.println("here is finally");
		}
		
		System.out.println("sould run");
	}
	
	public void multiCatch(){
			int intArr[] = new int[5];
			try{
			//int intArr[] = new int[5];
				System.out.println(intArr[5]);
				System.out.println("sould run");
		
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException");
			} catch (Exception e){
				System.out.println("Exception run");
				System.out.println(intArr.length);
			}				
			
		}
		
	public void thowable(){
		int intArr[] = new int[5];
		try{
			//intArr = null;
			System.out.println(intArr[5]);
		}catch(Throwable t){
			//System.out.println(t.toString());
			t.printStackTrace();
		}
	}

	public void throwException(int _number) throws Exception{
		try{
			if(_number >12){
				throw new Exception("입력숫자가 12보다 큼");
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void throwException2(int _number) throws MyException{
		try{
			if(_number >12){
				throw new MyException("입력숫자가 12보다 큼");
			}
		} catch (MyException e){
			e.printStackTrace();
		}
	}
	

}
