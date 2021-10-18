//program determines if string given is a palindrome or not


public class Palindrome {
	
	static boolean isPalindrome(String word) {
		//variables used to point to the beginning and the end of the string
		int i = 0;
		int b = word.length() - 1; //we do word.length() -1 because indexes start at 0
		
		while (i < b) { //compare characters while i < b
			if (word.charAt(i) != word.charAt(b)) {//if first letter of pointer 1 does not equal to first letter of pointer 2 then its not a palindrome
				return false;
			}
			i++; //continue to increment first pointer
			b--; //continue to decrement second pointer
		}
		return true; //return true if string is a palindrome
			
	}
	
	public static void main(String[] args) {
		
		String word = "race car"; /*if we had a word that included a space like 'nurses run' it would return false even though it is
		a palindrome. we can fix this by using replace method so word.replaceAll(" ", "") and this would replace the space with an empty char basically */
		word = word.replaceAll(" ", ""); //word equals the result of replacing space with nothing, we have to set it equal because strings are immutable and we can't change the string
		
		
		if(isPalindrome(word)) //plug in word to isPalindrome method and run method
			
		System.out.println("Yes"); //if its a palindrome print yes
		
		else {
			System.out.println("No"); //else print no
		}
		
		
		
	}
	
}
