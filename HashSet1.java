import java.util.HashSet;
class HashSet1 {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        // add- adding element
        set.add(6);
        set.add(3);
        set.add(3);
        set.add(9);
        // remove 
        // set.remove(1);
        // contains
        // System.out.println(set.contains(7));
      for(int i:set){
        System.out.println(i);
      }

        System.out.println(set);
        System.out.println(set.size());
    }
}