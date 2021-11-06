package assignment4;

import java.util.Scanner;
class Withdraw
{
    static void fun() throws IllegalAccessException
    {
        double balance = 0, depositAmount, withdrawAmount;

        Scanner dep=new Scanner(System.in);
        System.out.println("Enter Deposit an amount");
        depositAmount =dep.nextInt();
        balance += depositAmount;

        Scanner wd=new Scanner(System.in);
        System.out.println("Enter Withdraw an amount ");
        withdrawAmount=wd.nextInt();
        balance -= withdrawAmount;


        if (balance<0&&withdrawAmount>balance)
        {
            throw new IllegalAccessException();
        }
        else
            System.out.println("SUCCESSFULLY WITHDRAWN : "+withdrawAmount);
        System.out.println("ACCOUNT BALANCE AFTER  THE TRANSACTION : "+balance);
    }

    public static void main(String args[])
    {

        try {
            fun();
        }
        catch(IllegalAccessException e) {
            System.out.println(" WARNING :INSUFFICIENT BALANCE EXCEPTION ");
        }
    }
}