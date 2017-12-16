// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean isStringPalindrome(String str){
    if(str == null || str.length() < 2) return true;
    String reverse = "";
    for(int i = str.length()-1; i >= 0 ; i--){
        reverse += str.substring(i, i+1);
    }
    if(reverse.equals(str)) return true;
    return false;

}