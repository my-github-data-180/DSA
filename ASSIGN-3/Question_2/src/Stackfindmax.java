import java.util.Scanner;

public class Stackfindmax {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack(5);
		int Max=0;
		System.out.println("Enter elemets");
		
		for(int i=0;i<st.getSIZE();i++) {
		   st.push(sc.nextInt());
		    
			   if(st.peek()>=Max) {
				   Max=st.peek();
		   }
		}
		System.out.println("max value in stack:"+Max);
	}
	
}
