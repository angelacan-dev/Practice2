//program to show example of unboxing/autoboxing in java. unboxing going from object of a wrapper type(Integer) to primitive value(int)
//autoboxing is converting primitive value(int) to object type(Integer)

public class Example {
	public static void main(String[] args) {
		
		Integer i = new Integer(10); //creating a new Integer object with a value of 10
		
		//unboxing the object
		int i1 = i;
		
		System.out.println("Value of i is: " + i);
		System.out.println("Value of i1 is: " + i1);
		
		//autoboxing of char
		
		Character gfg = 'a';
		
		char ch = gfg;
		System.out.println("Value of ch: " + ch);
		System.out.println("Value of gfg: " + gfg);
		
	}

}
