package Session12;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("Harry");
		l.add("Tom");
		l.add("Jerry");
		System.out.println("Adding"+l);
		l.remove("Jerry");
		System.out.println("Removing jerry"+l);
		l.set(1, "Thomas");
		System.out.println("Set/Changing data"+l);
        System.out.println("Check if the value is present - " +l.contains("Harry"));
	}
}
