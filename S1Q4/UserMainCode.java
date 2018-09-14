
public class UserMainCode {
	public static void display(String first, String second) {
		String[] f1 = first.split(" ");
		String[] f2 = second.split(" ");
		
		if (f1[1].equalsIgnoreCase(f2[1])) {
			System.out.println("Yes");
		} else 
			System.out.println("No");
	}
}
