package assignment;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double ctc=s.nextDouble();
        if (ctc>=0&&ctc<=180000) {
            System.out.println("tax payable in % is : NILL ");
        }
        else if(ctc>180000&&ctc<=300000) {
            System.out.println(" tax payable in % is : 10 ");
        }
        else if(ctc>300000&&ctc<=500000) {
            System.out.println(" tax payable in % is : 20 ");
        }
        else if(ctc>500000&&ctc<=1000000) {
            System.out.println(" tax payable in % is : 30 ");
        }
        else{

            System.out.println("tax payable in % is : 40 ");
        }
    }
}
