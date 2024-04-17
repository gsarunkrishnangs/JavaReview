package javareview;

public class CommonClass implements FirstInterface, SecondInterface {

	public void print() {
		System.out.println("Sample Interface Program");
	}

	public void display() {
		System.out.println("Sample Multiple Inheritance Program");
	}

	public static void main(String args[]) {

		CommonClass test = new CommonClass();
		test.display();
	}
}
