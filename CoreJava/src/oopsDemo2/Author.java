package oopsDemo2;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 29, 2024
 * Time   :10:14:35 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class Author {
	String authorName;
	int age;
	String place;

	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}
	


}
