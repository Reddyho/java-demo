package stringsDemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 4, 2024
 * Time   :2:22:52 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class StringBuldierDemo2 {

	public static void main(String[] args) {



		// User data
		String[] names = {"John Doe", "Jane Smith", "Emily Davis","Raj GS"};
		int[] ages = {30, 25, 35,39};
		String[] emails = {"john@example.com", "jane@example.com", "emily@example.com","raj@test.com"};

		// Create a StringBuilder object
		StringBuilder sb = new StringBuilder();

		// Build a formatted string for each user
		for (int i = 0; i < names.length; i++) {
			sb.append("User ").append(i+1).append(":\n").append("\t")
			.append("Name: ").append(names[i]).append("\n").append("\t")
			.append("Age: ").append(ages[i]).append("\n").append("\t")
			.append("Email: ").append(emails[i]).append("\n")
			.append("\n"); //Adding new line for Separation
		}

		//Display the final formatted String
		System.out.println(sb);
	}

}
