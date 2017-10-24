import java.util.*;

public class Arraylist {
   public static void main(String args[]) {
      
	  ArrayList<String> obj = new ArrayList<String>();

	  obj.add("Highland");
	  obj.add("Leavit");
	  obj.add("bell");
	  obj.add("Oakely");
	  obj.add("Claremont");
          System.out.println("Size Of ArrayList = "+obj.size());
	  System.out.println("Array list has following elements:"+obj);
          System.out.println(obj.indexOf("bell"));
          System.out.println(obj.get(4));
          List<String> subList = obj.subList(1, 4);

	  obj.add(0, "Rosemont");
	  obj.add(1, "Thome");

	  obj.remove("bell");
	  obj.remove("Leavit");

	  System.out.println("Current array list is:"+obj);

	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
   }
}


