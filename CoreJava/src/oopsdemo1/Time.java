package oopsdemo1;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :3:18:19 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * Java program to perform addition of 2 Times
 *  t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
 *  
 *     t1 + t2
 *     if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *     if min> 60  ... hrs should be incremented by 1 & min -60
 */

public class Time {

	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}

	public void add(Time a) {
		this.sec+=a.sec;
		this.min+=a.min;
		this.hrs+=a.hrs;
		
		if (this.sec>=60) {
			this.min+=1;
			this.sec-=60;
		
	}
		if(this.min>=60) {
			this.hrs+=1;
			this.min-=60;
		}
		}
		
		public void display() {
			System.out.println("The Addition of time is :");
			System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
		}

	}


