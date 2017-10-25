abstract class DailyTask{
   
   public abstract void thisweek();
}
public class Today extends DailyTask{

   public void thisweek(){
	System.out.println("Wednesday");
   }
   public static void main(String args[]){
	DailyTask obj = new Today ();
	obj.thisweek();
   }
}