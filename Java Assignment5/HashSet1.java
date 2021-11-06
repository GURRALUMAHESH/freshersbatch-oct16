import java.util.*;  
class Details {  
int id;  
String name,department;  
int salary;  
public Details(int id, String name, String department, int salary) {  
    this.id = id;  
    this.name = name;  
    this.department = department;    
    this.salary = salary;  
}  
}  
public class HashSet1 {  
public static void main(String[] args) {  
    HashSet<Details> set=new HashSet<Details>();  
    //Creating Details  
    Details b1=new Details(101,"Itachi Uchiha", "Psychology",1200);  
    Details b2=new Details(102,"Minato Namikaze","Physics",1000);  
    Details b3=new Details(103,"Edwin Miller","Chemistry",850);  
    //Adding Details to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Details b:set){  
    System.out.println(b.id+" "+b.name+" "+b.department+" "+b.salary);  
    }  
}  
}  

