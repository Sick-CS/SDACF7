package Session12;

import java.util.ArrayList;
import java.util.Iterator;

class Emp{
	 String name;
	 int id;
	 double salary;
	 
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public Emp(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}	 
}

public class array {
public static void main(String[] args) {
	Emp emp1 = new Emp("Tom", 01, 30000);
	Emp emp2 = new Emp("Harry", 02, 35000);
	Emp emp3 = new Emp("Alice", 03, 40000);
	
	ArrayList<Emp> listofemployees = new ArrayList<Emp>();
	listofemployees.add(emp1);
	listofemployees.add(emp2);
	listofemployees.add(emp3);
	
	Iterator<Emp> iterator = listofemployees.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
}
}

