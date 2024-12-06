package java8features;

import java.time.LocalDate;

/**
* Author :Koppula.Reddy
* Date   :Nov 9, 2024
* Time   :11:20:59 AM
* email  :Koppula.Reddy@coforge.com
*/

interface Parser{
	
	default void parse() {
		System.out.println("default prasing logic");
	}
	static void displayDate() {
		System.out.println(LocalDate.now());
	}
}
class TextPaser implements Parser{
	//inherits default implemation of praser
	void display() {
		System.out.println("hello text praser");
	}
}

class XMLPraser implements Parser{
	
	//override parse method
	
	public void parse() {
		System.out.println("prasing XML files");
	}
}
	
public class DefaultMethodDemo1 {

	public static void main(String[] args) {
		
			Parser p=new TextPaser();//upcasting
			p.parse();
			
			TextPaser t1=new TextPaser();
			t1.display();
			
			p=new XMLPraser();//reference child to XML
			p.parse();//invoke over ridden method
			
			System.out.println("program execute on:");
			Parser.displayDate(); //invoke static method
		}

	}

