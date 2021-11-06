package oops;

abstract class Persistence{
	abstract void persist();
	
}
class FilePersistence extends Persistence{
	public void persist() {
		System.out.print("Persist is in FilePersistence");
		
	}
	
}
class DatabasePersistence extends Persistence{
	public void persist() {
		System.out.print("Persist is in DatabasePersistence");
		
	}
	
}
public class Abstract {
	public static void main(String args[]) {
		FilePersistence F=new FilePersistence();
		F.persist();
		DatabasePersistence D=new DatabasePersistence();
		D.persist();
	}

}
