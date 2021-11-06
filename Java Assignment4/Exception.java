import java.util.Scanner;
import java.util.Collection;
public class Exception {
	  public static void main(String[] args) 
	  {
	    
		try
		{
		Scanner input = new Scanner (System.in);
	    System.out.print("Input the first number: ");
	    int a = input.nextInt();
	    System.out.print("Input the second number: ");
	    int b = input.nextInt();
	    float d = (a/b);
	   
	    System.out.println("result="+d);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
	  }
	  
}
