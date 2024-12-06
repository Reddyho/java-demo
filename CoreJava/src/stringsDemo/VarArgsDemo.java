package stringsDemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :2:30:48 PM
* email  :Koppula.Reddy@coforge.com
* 
* Varargs is a short name for variable arguments. 
 * In Java, an argument of a method can accept arbitrary number of values. 
 * This argument that can accept variable number of values is called varargs.
 *  
 *  --------Syntax : -------
 *  
 * accessModifier methodName(datatype...arg) {
    // method body
}

In order to define vararg, ... (three dots) is used in the formal parameter of a method.
*/

public class VarArgsDemo {

		//method accepct variables no.of arguments
		public int sumNumber(int...args) {
			System.out.println("arg length:"+args.length);
			int sum=0;
			for(int x:args) {
				sum+=x;
			}
			return sum;
	}
		public static void main(String[] args) {
			
			VarArgsDemo ex=new VarArgsDemo();
			
			int sum2=ex.sumNumber(2,4);
			System.out.println("sum2 :"+sum2);
			
			int sum3=ex.sumNumber(1,3,5);
			System.out.println("sum3 :"+sum3);
			
			int sum4=ex.sumNumber(1,3,5,7);
			System.out.println("sum3 :"+sum4);
		}

}
