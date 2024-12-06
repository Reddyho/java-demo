package CollectionsDemo;

import java.util.Vector;

/**
* Author :Koppula.Reddy
* Date   :Nov 5, 2024
* Time   :3:12:30 PM
* email  :Koppula.Reddy@coforge.com
*/

class PreciousStones{
	Vector<String>preciousVector;
	
	PreciousStones(){
		preciousVector =new Vector<String>();
	}
	
	void add() {
        preciousVector.addElement("Jade");
        preciousVector.addElement("Topaz");
        preciousVector.addElement("Turquoise");
        preciousVector.addElement("Emerald");
    }
	void insert() {
        preciousVector.insertElementAt("Diamond" , 0);
        preciousVector.insertElementAt("Opal" , 4);
    }

	void search() {
        System.out.println("***************************");
        System.out.println("Searching Contents :");
        System.out.println("***************************");
        String searchStone = "Diamond";
        if (preciousVector.contains(searchStone)) {
             System.out.println("Found " + searchStone
             + " at index " + preciousVector.indexOf(searchStone));
        }
}
        void otherDetails() {
            System.out.println("\nFirst Element = "
            + preciousVector.firstElement());
            System.out.println("Default Capacity = "
            + preciousVector.capacity());
            System.out.println("Last Element = "
            + preciousVector.lastElement());
       }
        
        void display()
        {
        	System.out.println(preciousVector);
        }
}

public class VectorDemo {

	public static void main(String[] args) {

		PreciousStones p1=new PreciousStones();
		
		p1.add();
		p1.display();
		p1.insert();
		p1.display();
		p1.search();
		p1.otherDetails();
		p1.display();
	}

}
