import java.util.*;
class TreeSet1 {

    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<Integer> uniqueVal=new TreeSet<Integer>();
        uniqueVal.add(1);
        uniqueVal.add(2);
        uniqueVal.add(3);
        uniqueVal.add(4);
        uniqueVal.add(5);
        uniqueVal.add(6);
        uniqueVal.add(7);
        uniqueVal.add(8);
        uniqueVal.add(9);
        uniqueVal.add(10);
//adding duplicate value to set but it will not store null values ,it simply rejects duplicate at run time
        uniqueVal.add(10);

        System.out.println(uniqueVal);

        System.out.println("Reverse Set: "+ uniqueVal.descendingSet());
    }
}