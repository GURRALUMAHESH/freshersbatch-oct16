import java.util.Scanner;

public class ArithematicException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter X value: ");
        int x = sc.nextInt();

        System.out.println("enter Y value: ");
        int y = sc.nextInt();
        int z;
        try {
            z = x / y;
            System.out.println("Z value is:" + z);
        } catch (ArithmeticException e) {
            System.out.println("Avoid dividing by integer 0 " + e);
        }
        if (y == 0) {
            System.out.println("EXCEPTION IS HANDLED");
        }
    }
}
