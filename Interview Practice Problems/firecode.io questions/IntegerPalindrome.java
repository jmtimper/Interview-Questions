// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method that checks if a given integer is a palindrome 
 *      - without allocating additional heap space
 */
public static Boolean isIntPalindrome(int x) {            
    String num = Integer.toString(x);
    for(int i = 0; i < num.length()/2; i++){
        if(num.charAt(i) != num.charAt(num.length()-1-i)) return false;
    }

    return true;
}