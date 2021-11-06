import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Pair {

    public static void main(String[] args)
        {
        //This is for the scenario "a".    
    	// initialize a HashMap for STRING AS KEY and STRING AS VALUE
            HashMap<String, String> Obj = new HashMap<>();

            Obj.put("Venom","Sci-fi");
            Obj.put("Hobbs & Shaw","Action");
            Obj.put("Rush Hour","Comedy");
            Obj.put("Midnight Sun","Romance");

           //adding movies and its genre//
            // for-each loop
            for (Map.Entry<String, String> e :Obj.entrySet())
                System.out.println("Key: as NAME:--> " + e.getKey()+" /"
                        + " Value: as Genre:--> " + e.getValue());
        }
    }


