package p1;

public class StringConcat {

	public static void main(String[] args ) {
		String a ="Amit";
		String a1 ="Rathor";
		
		int b = 10;
		int c = 200;
		int d = 30;
		
		System.out.println( b+c+d ); 
		System.out.println( a+a1 ); 
		System.out.println( b+c+d+a ); 
		System.out.println( a+b+c+d );
		System.out.println( b+c+a+d );
		System.out.println( a+c/b );
//		System.out.println( a+b-c );
		
		System.out.println( a.concat(a1));
		System.out.println( a );
		System.out.println( a1 );
		
		System.out.println( String.join( ":", a,a1,a1,a ) ); // join is the static method we call it using String method and we can't provide NULL at the place of Delimiter.
		
		 
	}

}
