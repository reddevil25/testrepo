package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class Arlist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("Anish");
		al.add(16.5);
		al.add(true);
		
		al.remove(3);
		System.out.println(al);
		
		al.add(1, 300);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		al.set(1, 400);
		System.out.println(al);
		
		System.out.println(al.contains("Anish"));
		
		
		
	}

}
