// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Implement a method that checks if two strings are permutations of each other. 
 */
public static boolean permutation(String str1, String str2) {
    if(str1.length() != str2.length()) return false;
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for(int i = 0; i < str1.length(); i++){
        arr1[findChar(Character.toLowerCase(str1.charAt(i)))]++;
        arr2[findChar(Character.toLowerCase(str2.charAt(i)))]++;
    }
    return Arrays.equals(arr1,arr2);

    
}

public static int findChar(Character i){
    Character[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    for(int k = 0; k < alpha.length; k++){
        if(i.equals(alpha[k])) return k;
    }
    return -1;
}