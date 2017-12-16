// java.util.* has been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
    if(str == null) return true;
    ArrayList characters = new ArrayList();

    for(int i = 0; i < str.length(); i++){
        if(!characters.contains(str.charAt(i))) characters.add(str.charAt(i));
        else return false;
    }
    return true;
}