//program to explain how Java is pass by value


public class Animal {
	
	int eyes; //global primitive instance variable
	
	protected String animalName = "Mouse";
	
	public static void main(String[] args) {
		Animal animalObj = new Animal();
		animalObj.eyes = 2;
		
		int a = 3; //local primitive variable because it's initiated inside the scope of the method
		changePrimitives(a);
		System.out.println("value of a is " + a); /*this will print 3 even though we passed a to the changePrimitives
		//because it copied the value 3 into a different variable location and then when it passes to the other method it is changed to 13
		//but when we print it, it will remain to 3 since it does not affect the original value of a*/
		//System.out.println(animalObj.eyes);
		
		
	}
	
	//this method is static in order to access public static void main, since in order to access a static method you must also make that method static
	public static void changePrimitives(int aCopy) { 
		aCopy=13;
		
	}

}
