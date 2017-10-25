import java.util.*;

public class DailyTask {

   public static void main(String args[]) {
      
      Vector<String> vec = new Vector<String>();

      vec.addElement("Highland");
      vec.addElement("Leavit");
      vec.addElement("Bell");
      vec.addElement("Oakley");

      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("Street1");
      vec.addElement("Street2");
      vec.addElement("Street3");

      
      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      
      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}