
public class cal {

	public static void main(String[] args) {

		int a,b,result;
		String c;
		float res;
		System.out.println("enter 2 numbers and operator:");
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=args[2];
		
		
		switch (c) {
		case "+":result=a+b;
		System.out.println("the addition is:"+result);
                break;
		case "-":result=a-b;
		System.out.println("the substraction is:"+result);
                break;
		case "*":result=a*b;
		System.out.println("the multiply is:"+result);
                break;
		case "/":res=(float)a/b;
		System.out.println("the division is:"+res);
                break;
                default:
	        System.out.println("enter varid number");
                break;
			
		}
	}

}