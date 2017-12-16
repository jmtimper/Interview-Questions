// java.util.* has been imported for this problem.
// You don't need any other imports.

public static Character firstNonRepeatedCharacter(String str) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int length, i;
    length = str.length();
    for(i = 0; i < length; i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        } else {
            map.put(str.charAt(i), 1);
        }
    }
    
    for(i = 0; i < map.size(); i++){
        if(map.get(str.charAt(i)) == 1) return str.charAt(i);   
    }
    
    return null;
}