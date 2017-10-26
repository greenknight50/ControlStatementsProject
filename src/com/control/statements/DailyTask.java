import java.util.ArrayList;
import java.util.HashMap;
 
class Animal {
     
}
 
 
public class DailyTask {
 
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
         
        list.add("apple");
        list.add("banana");
        list.add("orange");
         
        String fruit = (String)list.get(1);
         
        System.out.println(fruit);
         
        ArrayList<String> strings = new ArrayList<String>();
         
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
         
        String animal = strings.get(1);
         
        System.out.println(animal);
         
        HashMap<Integer, String> map = new HashMap<Integer, String>()
         
        ArrayList<Animal> someList = new ArrayList<>();
    }
 
}