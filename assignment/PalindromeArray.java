package assignment;

public class PalindromeArray {

    public static void main(String[] args) {

    	// 1] Initial the array
        int[] arr = {1, 2, 3,2,1};

        // 2] Initial condition -- numbers is palindrome
        boolean isPalindrome = true;

      // 3]  Initial condition for palindrome  -- No Need 
//        int left = 0;
//        int right = arr.length - 1;
     
        // 4] To check number  is palindrome -- Main logic 
        
        for(int i=0; i<arr.length;i++) {
            if(arr[i] != arr[arr.length-1-i]) {
                isPalindrome = false;
                break;
            }
           
        }

        if(isPalindrome) {
            System.out.println("Array is a Palindrome");
        } 
        else {
            System.out.println("Array is a  not palindrome");
        }
    }
}

