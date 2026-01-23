//1] Remove duplicate characters while maintaining order.  
package strings;

public class Task1 {
	public static void main(String[] args) {
		String s = "programming";
		remove_duplicate(s);
		
	}
	
	//1] Creating an function 
	public static  void remove_duplicate(String str) {
		
		//// MAIN LOGIC
		
		//2]taking the total length as string length because there must be no duplicates
		int len = str.length();
		
		// 3]Initialize the  new array to store result 
		char []res = new char[len];
		
		//4] Initialize new variable
		int k=0;
		
		//5] taking boolean to check there is duplicate or not
		boolean sts;
		
		 //6] loop through each character of string -- outer loop
        for(int i = 0; i < len; i++) {
        
            char ch = str.charAt(i); // p r o g r a m m i n g 
            sts = false;

            //7]check if there is duplicate in  result -- inner loop
            for(int j = 0; j < len; j++) {
                if(res[j] == ch) {
                    sts = true;
                    break;
                }
            }

            // if there is no duplicate add to array
            if(!sts) {
                res[k++] = ch;
            }
        }

        // display result
        
        for(int i = 0; i < k; i++) {
            System.out.print(res[i]);
        }
    }
}