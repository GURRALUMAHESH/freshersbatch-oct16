
import java.util.HashMap;

public class question3 {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> map= new HashMap<>();
		
		map.put(23, 21d);
		map.put(34,22d);
		map.put(53,23d);
		map.put(11,24d);
		map.put(9,25d);
		map.put(4,26d);
		map.put(134,27d);
		map.put(67,28d);
		map.put(38,29d);
		map.put(45,30d);
		
		System.out.println("Size of map is:- "+ map.size());
		System.out.println(map);
	}
}
