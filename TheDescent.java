/*At the start of each game turn, you're given the height of 8 mountains from left to right. By the end of the game turn,
you must fire on the highest mountain by outputting its index(from 0 to 7). 
1. for i starting from 0 to 7
2. read mountain_h
3. if mountain_h is greater than max then 
4. max <--- mountain_h
5. imax <--- i
6. end if statement
7. end for loop*/

import java.util.*; //library that allows you to create arrays, dates, etc, scanner
import java.io.*; //library that imports input/output functionality
import java.math.*; //library that allows you to do Math

public class TheDescent {
	public static void main(String[] args) {
		/*creates a new scanner instance which points to the input stream passed as argument. So once your scanner instance
		is pointing to it, you can scan the stream and get ints, strings, etc*/
		Scanner scanner = new Scanner(System.in);
		
		//game loop
		while(true) {
			int max = 0;
			int imax = -1;
			
			for(int i = 0; i < 8; i++) {
				int mountainH = Integer.parseInt(scanner.nextLine());
				
				//sets the highest mountain
				if(mountainH > max) {
					max = mountainH;
					imax = i;
				}
			}
			
			System.out.println(imax);
		}
		
		
	}
}
