package hello;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to check ArmStrong Or Not:");
        int a=s.nextInt();
        int sum=0;
        int temp;
        int number=a;
        while (a!=0) {
            temp=a%10;
            sum=sum+(temp*temp*temp);
            a=a/10;
        }
        if (sum==number) {
            System.out.println(number+" is ArmStrong Number ");
        }
        else {
            System.out.println(number + "is not ArmStrong Number ");
        }
    }
}
