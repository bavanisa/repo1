package DEMO;

public class methodoverriding {
	
	public int m1(int a,int b) {
		return a+b;
	}
	public int m2(int c,int d) {
		return c+d;
	}
	public double m3(double j ,double h) {
		return j+h;
	}

	public static void main(String[] args) {
		methodoverriding obj = new methodoverriding();
		System.out.println("m1 addition is :"+obj.m1(2, 20));
		System.out.println("m2 addition is :"+obj.m2(10, 30));
		System.out.println("m3 doube add is :"+obj.m3(0.8, 1.4));
		//program for method overloading
	}

}
