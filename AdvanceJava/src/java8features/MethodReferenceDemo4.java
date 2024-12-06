package java8features;

/**
* Author :Koppula.Reddy
* Date   :Nov 9, 2024
* Time   :10:40:06 AM
* email  :Koppula.Reddy@coforge.com
*/

//Java program to use Method Reference to a Constructor
interface IMessage
{
	ConstructorReference getMessage(String msg);
}

class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodReferenceDemo4 {

	public static void main(String[] args) {

		IMessage hello=ConstructorReference::new;
		hello.getMessage("method reference to constructor");
		
		ConstructorReference a=new ConstructorReference("hello");
	}

}
