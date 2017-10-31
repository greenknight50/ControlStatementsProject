import java.util.*;
public class HashMapDemo {

   public static void main(String args[]) {
	 LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
         hashmap.put(111, "Abey");
         hashmap.put(222, "Dawn");
         hashmap.put(333, "Sherry");
         hashmap.put(444, "Karon");
         hashmap.put(555, "Jim");
	Set set = hashmap.entrySet();
	Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() + "& Value is: "+me.getValue()+"\n");
         }
     }
}