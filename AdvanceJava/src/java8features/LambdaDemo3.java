package java8features;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 8, 2024
 * Time   :2:24:47 PM
 * email  :Koppula.Reddy@coforge.com
 */

//perform arithemitic operations using lambda
public class LambdaDemo3 {

	public static void main(String[] args) {

		Addition op1=(a,b) ->(a+b);
		//int c=(a,b) -> (a+b);
		System.out.println("Addition of two numbers:"+op1.calcuate(200,155));

		Addition op2=(a,b) -> (a-b);
		System.out.println("Subtraction of 2 Nos is : "+op2.calcuate(200, 155));

		Addition op3=(a,b) -> (a*b);
		System.out.println("Multiplication of 2 Nos is : "+op3.calcuate(200, 155));

		Addition op4=(int a,int b) -> (a/b);
		System.out.println("Division of 2 Nos is : "+op4.calcuate(200, 155));
		
		Addition op5=(a, b) -> (a%b);
		System.out.println("modouls of 2 Nos is : "+op5.calcuate(200, 155));

		// lambda expression with single parameter with no parenthesis
		MyString myName1 = name -> { return "Hello "+name;};

		System.out.println(myName1.mystringFunction("James Gosling"));
	}

}
