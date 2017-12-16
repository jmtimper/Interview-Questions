// java.util.* has been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
   TreeSet<Integer> dup = new TreeSet();
   TreeSet<Integer> extra = new TreeSet();
   for(int i: numbers){
       if(extra.contains(i)) {
            dup.add(i);
       } else {
           extra.add(i);
       }
   }
   
   return dup.toString();
    
}