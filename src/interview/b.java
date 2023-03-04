package interview;

import java.io.IOException;

public class b extends a {
	
	
	public void method() throws Exception
	{ 
		System.out.println("method from class b called");
	}
	
	public static void main(String[] args) {
		
		
		b b = new b();
		b.method();
		
		
		
		
	}

}
