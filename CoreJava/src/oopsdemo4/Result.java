package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :3:29:26 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Result extends Canditate implements Exam{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("************Candidate Result*************");
	}

	@Override
	public void perecent_cal() {

		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println("percentage :"+percent+"%");
	}
	

}
