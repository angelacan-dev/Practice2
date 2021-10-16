/*Java program prints all self-descriptive numbers below 100,000,000
a self-descriptive number is an integer n in given base b is b digits long in which each digit at position p counts how
many times a digit p is in n. 6210001000 is a self descriptive number, it has 6 at the position 0 and there are six 0s in the number
it has 2 at the position 1 and there are two 1s, it has 1 at the position 2 and there is one 2s, etc*/
/*1. All the digits get extracted from the outer loop and are stored in a variable b in each iteration
 *2. Then in the inner loop there is a count on how many times number i (this is the ith index of outer loop) is present in the string
 *3. Finally that count is compared with the digit present at the ith index stored in variable b
 * will print 1210 2020 21200 3211000 42101000*/
public class SelfDescriptive {
	public static boolean isSelfDescriptiveNumber(int num) {
		//converting an integer number to String
		//Integer is a class, Integer object gives more functionality like converting to String. Integer is a pointer that can reference an object
		String s = Integer.toString(num);
		for(int i = 0; i < s.length(); i++) {
			
			String temp_char = s.charAt(i) + ""; //extracts each digit one by one at position i from the string
			
			int b = Integer.parseInt(temp_char); //converts the string (digit) into Integer. b variable stores the digit present at index 'i'
			
			//counts how many times the particular digit occurs in the whole number 'num'
			int count = 0;
			for(int j = 0; j < s.length(); j++) {
				//converting String char to integer
				int temp = Integer.parseInt(s.charAt(j) + "");
				
				//checking whether its equal to the index 'i', if it is then increment the count
				if(temp == i) {
					count++;
				}
			}
			
			//if count doesnt equal to the digit present at index i, return false
			if(count != b) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		for(int i = 0; i < 100000000; i++) 
			if(isSelfDescriptiveNumber(i))
				System.out.println(i);
	}
}
