//2]Find the first non-repeating character in a string.

package strings;

public class Task2 {

	public static void main(String[] args) {
		
		//6] Creating the String
		String s  = "swiss";
		
		//7]Function call
      non_repeat(s);
	}
	
	
	//1] Create the function
	public static void  non_repeat(String str) {
		//2] Initialize the string length
		int length = str.length();
		
		
		//3] Outer loop to access all letter
		for( int i = 0 ; i<length ; i++) {
			char ch = str.charAt(i);
			int count = 0;
			//4] Inner loop to  check repeat letters
			for( int j = 0 ; j< length ; j++) {
				if(str.charAt(j) == ch) {
					count++;
				
				}
			}
			//5] Validation to count only 1 non repeating 
            if(count == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;   
            }
        }

        System.out.println("No non-repeating character found");

		
		}
	}


