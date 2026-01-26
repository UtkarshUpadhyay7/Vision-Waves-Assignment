//3] 3.	Print frequency of each character.
//Input: aabbc
//	Output:
// 	a → 2
//	b → 2
// 	c → 1
package strings;

public class Task3 {
	//1]  Create an method
	public static void frequency(String str) {
		
		//2] Outer loop to access each character 
		for( int i = 0 ; i < str.length() ; i++) {
			int count = 0;
			char ch = str.charAt(i);
			
			//3] Inner loop to compare
			for( int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == ch) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println("character " + ch + " is repeated " + count + " times");
				
			
			}
			else if(count == 2) {
				System.out.println("character " +ch + " is repeated " + count + " times");
			
		
			}
			else {
				System.out.println("character " +ch + " is repeated " + count + " times");
			
			}
			
		}
		return;
	}

	public static void main(String[] args) {
         
		String str = "aabbc";
		
		frequency(str);

	}

}
