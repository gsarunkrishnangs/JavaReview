package javareview;

import java.util.ArrayList;
import java.util.List;

public class SampleCollectionList {

	public static List<String> fruitList() {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Pineapple");
		return fruits;

	}

	public static void main(String[] args) {

		List<String> m = SampleCollectionList.fruitList();
		System.out.println("List of Fruits" + " " + m);
	}

}
