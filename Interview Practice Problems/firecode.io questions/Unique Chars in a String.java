// java.util.* has been imported for this problem.
// You don't need any other imports.


/**
 * Write a method that takes in an input String and returns true if all the characters in the String are unique 
 * and false if there is even a single repeated character.
 * The method should return true if the input is null or empty String.
 */
public static boolean areAllCharactersUnique(String str){
    if(str == null || str == "") return true;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i = 0; i < str.length(); i++){
        if(map.containsKey(str.charAt(i))) return false;
        else map.put(str.charAt(i), 1);
    }
    return true;

}