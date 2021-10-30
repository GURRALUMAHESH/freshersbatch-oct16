class Employee{
    float salary = 40000;
    void totalSalary()
    {
        System.out.println("The Employee incremented salary is :" +(salary ) );

    }
}
class Manager extends Employee{
    float incentive =15000;
    void totalsalary()
    {
        System.out.println("The Manager salary is :" +((salary+incentive)));
    }
}
class Labour extends Manager{
    double overtime=6500;
    void totalsalary()
    {
        System.out.println("The salary of the Labours is"+(overtime+salary));


    }
}
public class MainClass90
{
    public static void main(String args[]){


        Labour t = new Labour();
        Manager m=new Manager();
        System.out.println("Total Salary Of Employees In Organisation is "+(m.salary+ (((m.incentive)+ t.overtime))+ t.salary)); //displays total salary of emp in org//

        // based on an object it decides which class salary method to be execute
       // m.totalsalary(); // displays manager salary//
        // t.totalsalary(); //displays labour salary//


    }
}