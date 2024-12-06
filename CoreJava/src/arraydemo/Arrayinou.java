package arraydemo;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :11:52:39 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Arrayinou {

	public static void main(String[] args) {

		//define array refernce marks
		int[] marks=new int[10];
		
		String[] name= {"jack","teja","chandu","ajay","honey"};
		
		float[] scores;
		scores=new float[5];
		
		
		scores[0]=35.45f;
		scores[1]=80.45f;
		scores[2]=55.45f;
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=i*50;
		}
		System.out.println("*******integer array contets******");
		for(int i=0;i < marks.length;i++) {
			System.out.println(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("*********Float Array Contents ************");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println();
		
		//Iterate in nonLinear
		System.out.println("*********Integer Array Contents in Even Index ************");
		for (int i = 0; i < marks.length; i=i+2) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
		
		
		
	}
}
