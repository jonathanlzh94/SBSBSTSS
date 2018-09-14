
public class UserMainCode {
	public static void display(String first, String last) {
		first = first.toLowerCase();
		first = first.substring(0, 1).toUpperCase().concat(first.substring(1));
		last = last.toUpperCase();
		System.out.println(first + " " + last);
	}
}
