//Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.
//example
//compressString("aaabbbbbcccc") --> a3b5c4
//compressString("aabbbbccc") --> a2b4c3
//compressString("abc") --> abc
//@Author Jeremy Timperio


public static String compressString(String text) {

    //Creates hashmap to keep track of characters and number of repeats
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	//Goes through initial string and puts them in hashmap
    for(int i = 0; i < text.length(); i++){
        if(map.containsKey(text.charAt(i))){
            map.put(text.charAt(i), map.get(text.charAt(i))+1);
        } else {
            map.put(text.charAt(i), 1);
        }
    }
    
	//Creates new string based on HashMap
    String ans = "";
    for(int i = 0; i < text.length(); i++){
        ans += text.charAt(i) ;
        if(map.get(text.charAt(i))!=1){
            ans += map.get(text.charAt(i));
            i += map.get(text.charAt(i)) -1;
        }
    }
	
	//returns new string
    return ans;
    
}