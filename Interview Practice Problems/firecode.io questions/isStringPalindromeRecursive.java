// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * A palindrome is a string or sequence of characters that reads 
 * the same backward as forward. For example, "madam" is a palindrome. 
 * Write a method that takes in a String and returns a boolean -> true 
 * if the input String is a palindrome and false if it is not. 
 * An empty string and a null input are considered palindromes. 
 * You also need to account for the space character. For example, 
 * "race car" should return false as read backward it is "rac ecar".
 */
public static boolean isStringPalindrome(String str){
    if(str == null || str.length() <= 1) return true;
    if(str.charAt(0) != str.charAt(str.length()-1)) return false;
    return isStringPalindrome(str.substring(1, str.length()-1));
}