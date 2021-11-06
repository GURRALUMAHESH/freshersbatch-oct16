package assignment;

public class Armstrong {
    public static void main(String [] args)
    {
         
           for (int a = 100 ; a <= 1000 ; a++)
            {
                       int n = a;
                       int d = 0;
                       int s = 0;

                       while (n > 0)
                        {
                                    d = n % 10;
                                    s = s + (d * d * d);
                                    n = n / 10;
                        }
                        if (a == s)
                         {
                                    System.out.println(a +" is Armstrong number");
                          }
             }
   }
} 