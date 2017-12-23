// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other.
 * An anagram of a String is a String that is formed by simply re-arranging its letters, using each letter exactly once. 
 * Your algorithm should run in linear O(n) time and use constant O(1) space. 
 */
public static boolean isAnagram(String input1, String input2) {
    if(input1 == null || input2 == null) return false;
    if(input2.length() != input1.length()) return false;
    TreeSet<Character> map = new TreeSet<Character>();
    for(int i = 0; i < input1.length(); i++){
        map.add(input1.charAt(i));
    }
    for(int i = 0; i < input2.length(); i++){
        if(!map.contains(input2.charAt(i))) return false;
    }
    return true;
}