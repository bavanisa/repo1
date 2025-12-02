package DEMO;

public class Bird {
	
 void sing() {
	 System.out.println("birds can sing :");
 }
 
 class sparrow extends Bird{
	 @Override
	 void sing() {
		 System.out.println("birds can sing :");
	 }
 }
 class Parrot extends Bird {
	    @Override
	    void sing() {
	        System.out.println("The parrot talks.");
	    }
	}
	public static void main(String[] args) {
		

	}

}
