// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
    String temp = "";
    for(int i = 0; i < a.length(); i++){
        if(a.charAt(i) == ' ') temp += b;
        else temp += a.charAt(i);
    }
    
    return temp;

}