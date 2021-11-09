	import java.util.*;    
	class Contact {    
	long  phoneNumber;    
	String name,email,gender;    
	
	public Contact(long phoneNumber, String name, String email, String gender) {    
	    this.phoneNumber = phoneNumber;    
	    this.name = name;    
	    this.email = email;    
	    this.gender = gender;      
	}    
	}    
	public class MapExample 
	{    
	public static void main(String[] args) 
	{    
	     
	    Map<Long,Contact> map=new TreeMap<Long,Contact>();    
	      
	    Contact c1=new Contact(7569473323L,"SriRam","sriram.com","M");  
	    Contact c2=new Contact(9701141237L,"Manikanta","manikanta.com","M"); 
	    Contact c3=new Contact(8978505669L,"Harshi","harshi.com","F"); 
	       
	   
	    map.put(2L,c2);  
	    map.put(1L,c1);  
	    map.put(3L,c3);  
	      
	    //Traversing map  
	    for(Map.Entry<Long, Contact> entry:map.entrySet()){    
	        long key=entry.getKey();  
	        Contact sri=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(sri.phoneNumber+" "+sri.name+" "+sri.email+" "+sri.gender);   
	    }    
	}    
	}    
