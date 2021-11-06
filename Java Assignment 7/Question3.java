import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence();
}


@Execute(Sequence = 1) 
class myMethod1{
	
}
@Execute(Sequence = 2)
class myMethod2{
	
}
@Execute(Sequence = 3)
class myMethod3{
	
}


public class Question3 {

	public static void main(String[] args) 
	{
		myMethod2 b =new myMethod2();
		myMethod1 a =new myMethod1();
		myMethod3 c =new myMethod3();
		
		Class cb= b.getClass();
		Class ca= a.getClass();
		Class cc= c.getClass();
		
		Annotation an1 = cb.getAnnotation(Execute.class);
		Annotation an2 = ca.getAnnotation(Execute.class);
		Annotation an3 = cc.getAnnotation(Execute.class);
		
		Execute e1= (Execute)an1;
		Execute e2= (Execute)an2;
		Execute e3= (Execute)an3;
		
		System.out.println(e1.Sequence());
		System.out.println(e2.Sequence());
		System.out.println(e3.Sequence());
	}

}
