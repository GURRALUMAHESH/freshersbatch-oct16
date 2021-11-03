import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args)
        {
            // initialize a HashMap for Integer and Double
            HashMap<Integer, Double> map = new HashMap<>();

            // Add elements using put method
            map.put(1,10.0 );
            map.put(2, 20.0);
            map.put(3, 30.0); //adding student id's with marks for 10 students in the class//
            map.put(4, 40.0);
            map.put(5, 50.0);
            map.put(6, 60.0);
            map.put(7, 70.0);
            map.put(8, 80.0);
            map.put(9, 90.0);
            map.put(10, 100.0);


            // Iterate the map using
            // for-each loop
            for (Map.Entry<Integer, Double> e : map.entrySet())
                System.out.println("Key: as ID " + e.getKey()
                        + " Value: as Marks " + e.getValue());
        }
    }


