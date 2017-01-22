package c.inheritance;

public class Inheritance{
	public static void main(String[] args){
		//Child testChild = new Child("sdf");
		//testChild.printName();
		Inheritance testInheri = new Inheritance();
		//testInheri.objectCast();
		//testInheri.obj2();
		testInheri.callPrintNames();
	}
	/*
	public void objectCast(){
		//Parent parent = new Parent();
		Child child = new Child();

		
		Parent parent2= child;
		//Child child2 = (Child)parent;
		Child child2 = (Chold)parent2;
	}*/
	
	/*public void obj2(){
		Parent[] parentArr = new Parent[3];
		parentArr[0] = new Child();
		parentArr[1] = new Parent();
		parentArr[2] = new Child();
		
		for(Parent temp:parentArr){
			if(temp instanceof Child){
				System.out.println("Child");
			} else if(temp inheritance Parent){
				System.out.println("Parent");
			}
		}
	}*/
	
	public void callPrintNames(){
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther();
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
		
	}
}