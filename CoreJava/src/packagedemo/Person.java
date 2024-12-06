package packagedemo;

import java.util.Objects;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 4, 2024
 * Time   :4:47:15 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * program to demonstrate methods of object class
 */

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

    //overriding to string method of object
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
	

}
