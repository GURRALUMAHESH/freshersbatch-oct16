
public class StringOperation {
	
	public static void main(String[] args) {
		
		String str ="Java String pool refers to collection of Strings which are stored in heap memory";
			
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		String rstr= str.replace('a', '$');
		System.out.println(rstr);
		
		System.out.println(str.contains("collection"));
		
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		
		if(str==str1) {
			System.out.println("str == str1");
		}else
		{
			System.out.println("str != str1");
		}
		
	}
}
