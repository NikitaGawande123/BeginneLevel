package controlFlow;

public class MyMethod {

	public static void main(String[] args) {
		
		sayHello();
		int nume= 10;
	nick(nume);
		System.out.println("get price:" + getPrice(10));
		
		System.out.println("get discount:" + getDis(15, 9));
		System.out.println("get double discount:" + getDoubleDis(10, 8));
	
	}
	static void sayHello() {
		System.out.println("hello");
		
	}
	
	static void nick(int nume) {
		for (int i=1; i<= nume; i++) {
			System.out.println("stuck");
	}
	}
		static double getPrice(double price) {
			return price* 1.0;
		}
		
		static double getDis(double price, int per) {
			return price * per/100.0;
		
		}
		
		static double getDoubleDis(double price, int per) {
			return price * per/ 100;
		
	

	}

}