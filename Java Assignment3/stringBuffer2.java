
public class stringBuffer2 {

	public static void main(String[] args) {
		// This is for 2.2
		
		StringBuffer sb = new StringBuffer("It is used to_ at the specified index position.");
		
		sb.replace(13, 14, " insert text");
		
		System.out.println(sb);
	}

}
