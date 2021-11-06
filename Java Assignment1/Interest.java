package assignment;
import java.util.Scanner;
public class Interest{
	public static void main(String args[ ])
		{
			double p, rate, t, sim,com;
			System.out.println("Enter amount:");
			Scanner obj=new Scanner(System. in);
			p=obj.nextDouble();
			System. out. println("Enter the No.of years:");
			t=obj.nextDouble();
			System.out. println("Enter the Rate of interest");
			rate=obj.nextDouble();
			sim=(p * t * rate)/100;
			com=p * Math.pow(1.0+rate/100.0,t) - p;
			System.out.println("Simple Interest="+sim );
			System.out. println("Compound Interest="+com);
		}
}