// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String reverseString(String str){
    String inputString = str;
    String outputString = null;
    if(str == null) return outputString;
    if(str.length() == 0) return "";
    outputString = "";
    for(int i = str.length()-1; i >= 0; i--){
        outputString += str.substring(i, i+1);
    }
    
    
    return outputString;
}