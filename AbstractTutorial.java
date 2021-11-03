//program used to understand abstract classes and methods. an abstract class is a bunch of variables and methods that can be used to create other class
//you can't use an abstract class like a regular class. An abstract class helps make regular classes that you can then use.
//so we can create a new class Chihuahua and say extends on line 12
abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();  //we've created an abstract method poop
}
//here the chihuahua object is an extension of dog and if its an extension it already has what the dog comes with 
//so now chihuahua knows how to bark because it extends dog. it didn't know how to poop because it wasn't implemented yet but with
//creating the abstract method poop on line 11 then implementing it on line 17 it can do it.
class Chihuahua extends Dog {
	public void poop() {
		System.out.println("Dog pooped!");
	}
	
}

public class AbstractTutorial {
	
	//now we try to use the abstract class by creating dog d = new dog
	public static void main(String[] args) {
	Chihuahua c = new Chihuahua();
	
	c.bark();
	System.out.println(c.breed); //this would print null because we never actually set it or use it yet
	c.poop();
	}
	
	
	

}
