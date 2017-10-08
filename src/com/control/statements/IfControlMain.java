public class IfControlMain {

	public static void main(String[] args) {

		System.out.println("Inside main");
		int a = 5, b = 10, c = 15;
		if(a < b && a < c){
			System.out.println(a);
		if(b < c){
			System.out.println(b);
			System.out.println(c);
			}
		else{
			System.out.println(c);
			System.out.println(b);
			}
			}
		else if(b < a && b < c){
			System.out.println(b);
		if( a < c){
			System.out.println(a);
			System.out.println(c);
			}
		else{
			System.out.println(c);
			System.out.println(a);
			}
			}
		else{
			System.out.println(c);
		if( a < b){
			System.out.println(a);
			System.out.println(b);
			}
		else{
			System.out.println(b);
			System.out.println(a);
			}
				}
		System.out.println("Outside if");
	}

}
