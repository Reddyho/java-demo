package assignment;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :2:19:00 PM
* email  :Koppula.Reddy@coforge.com
*/



public class fb {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
 
    public static void main(String[] args) {
        int terms = 10; 

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


