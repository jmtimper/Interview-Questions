// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a string, recursively compute a new string 
 * where the identical adjacent characters in 
 * the original string are separated by a "*".
 */
public static String insertPairStar(String s) {
    if(s == null || s.length() <= 1) return s;
    String str = "";
    for(int i = 0; i < s.length()-1; i++){
        if(s.charAt(i) == s.charAt(i+1)){
            str += s.charAt(i) + "*";
        } else {
            str += s.charAt(i);
        }
    }
    str += s.charAt(s.length()-1);
    return str;


}