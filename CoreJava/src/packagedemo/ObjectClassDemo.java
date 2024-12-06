package packagedemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :4:52:35 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ObjectClassDemo {

	public static void main(String[] args) {

		Person p1=new Person("teja", 21);
		Person p2=new Person("teja", 21);
		
		Person p3=new Person("ajay", 25);
		
	    System.out.println("person1 :"+p1.toString());
	    
	    System.out.println("person3:"+p3);
	    
	    System.out.println("person1 equals person 2:"+p1.equals(p2));
	    
	    System.out.println("person2 equals person 3:"+p2.equals(p3));
	    
	    System.out.println("person1 hash code:"+p1.hashCode());
	    
	    System.out.println("person2 hash code:"+p2.hashCode());
	    
	    System.out.println("person3 hash code:"+p3.hashCode());
	    
	    System.out.println("class of person1"+p1.getClass().getName());
				
				
	}

}
