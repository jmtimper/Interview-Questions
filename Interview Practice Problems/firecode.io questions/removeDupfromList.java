// java.util.* has been imported for this problem.
// You don't need any other imports.


/**
 * Given a List of Strings, write a method removeDuplicates 
 * that removes duplicate words from the List and returns 
 * an ArrayList of all the unique words. 
 * The returned ArrayList should be lexically alphabetically.
 */
public static ArrayList<String> removeDuplicates(List<String> input) {
    TreeSet<String> set = new TreeSet<String>();
    ArrayList<String> ans = new ArrayList<String>();
    for(int i = 0; i < input.size(); i++){
        if(!set.contains(input.get(i))){
            set.add(input.get(i));
            ans.add(input.get(i));
        }
    }
    
    //sorts ArrayList alphabetically
    for(int i = 0; i < ans.size(); i++){
        for(int k = i; k < ans.size(); k++){
            if(ans.get(i).compareTo(ans.get(k)) > 0){
                String temp = ans.get(i);
                ans.set(i, ans.get(k));
                ans.set(k, temp);
            }
        }
    }
    
    return ans;

}