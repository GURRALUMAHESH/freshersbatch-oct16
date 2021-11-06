package assignment;

import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Subject-1  Marks");
        int subject1=s.nextInt();
        System.out.println("Enter First Subject-2  Marks");
        int subject2=s.nextInt();
        System.out.println("Enter First Subject-3  Marks");
        int subject3=s.nextInt();
        if (subject1>=60&&subject2>=60&&subject3>=60) {
            System.out.println("Passed");
        }
        else if (((subject1>=60&&subject2>=60)) ||  ((subject2>=60&&subject3>=60 )) || ((subject3>=60&&subject1>=60 ))) {
            System.out.println("Promoted");
        }
        else if(subject1>60|| subject2 >60|| subject3>60 || (subject1<60&&subject2<60&&subject3<60)) {
            System.out.println("Failed");
        }
        else
        {
            System.out.println("entered data is invalid");
        }
    }
}
