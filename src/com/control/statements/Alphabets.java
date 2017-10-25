import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Alphabets {
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("Is stack empty : "  + stack.addAll(list));
        System.out.println("Empty stack : "  + stack);
    }
}