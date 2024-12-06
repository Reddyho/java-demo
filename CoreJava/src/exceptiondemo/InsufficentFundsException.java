package exceptiondemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :4:35:42 PM
* email  :Koppula.Reddy@coforge.com
*/

//define custom exception class to handle insufficents funds in a bank
public class InsufficentFundsException extends Exception {


	public InsufficentFundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
