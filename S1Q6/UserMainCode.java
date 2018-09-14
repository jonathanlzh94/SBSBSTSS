import java.util.StringTokenizer;


public class UserMainCode {
	public static void display(String input) {
		StringTokenizer st = new StringTokenizer(input, "#");
		System.out.println("Number of teams : " + st.countTokens());
	}
}
