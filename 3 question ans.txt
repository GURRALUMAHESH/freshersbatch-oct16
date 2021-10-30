class Bank{

    void totalMoneyInBank()
    {
        System.out.println("The Employee incremented salary is :" );

    }
}
class SavingAcoount extends Bank{
    float fixedDeposits =150000;
    void totalMoneyInBank()
    {
        System.out.println("total money in savings account :" +((fixedDeposits)));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=59000;
    void totalMoneyInBank()
    {
        System.out.println("The total money in current account "+(cashCredit));


    }
}
public class MainClass90
{
    public static void main(String args[]){

        CurrentAcccount m=new CurrentAcccount();
        SavingAcoount s=new SavingAcoount();


        // based on an object it decides which class account method to be execute
        m.totalMoneyInBank(); //prints total money in currect ac//
        s.totalMoneyInBank(); //prints total money in savings ac//

        System.out.println("Total money in the bank  is "+( m.fixedDeposits+m.cashCredit)); //displays total salary of emp in org//

    }
}