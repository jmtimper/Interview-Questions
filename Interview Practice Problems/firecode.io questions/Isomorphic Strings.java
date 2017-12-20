// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given two strings - input1 and input2, determine if they are isomorphic. 
 * Two strings are isomorphic if the letters in one string can be remapped to get the second string. 
 * Remapping a letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. 
 * You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape. 
 * Target linear time and space complexity with your solution.
 * Examples
 * Input 1 : css  
 * Input 2 : dll
 * Output  : true
 * 
 * Input 1 : css 
 * Input 2 : dle
 * Output  : false
 */
public static boolean isIsomorphic(String input1, String input2) {
    if(input2 == null && input1 == null) return true;
    HashMap<Character, Integer> input1Map = new HashMap<Character, Integer>();
    HashMap<Character, Integer> input2Map = new HashMap<Character, Integer>();
    for(int i = 0; i < input1.length(); i++){
        if(input1Map.containsKey(input1.charAt(i))) input1Map.put(input1.charAt(i), input1Map.get(input1.charAt(i))+1);
        else input1Map.put(input1.charAt(i), 1);
    }
    for(int i = 0; i < input2.length(); i++){
        if(input2Map.containsKey(input2.charAt(i))) input2Map.put(input2.charAt(i), input2Map.get(input2.charAt(i))+1);
        else input2Map.put(input2.charAt(i), 1);
    }
    Set<Integer> value1 = new HashSet<>(input1Map.values());
    Set<Integer> value2 = new HashSet<>(input2Map.values());
    return value1.equals(value2);
}