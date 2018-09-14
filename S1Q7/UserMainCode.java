import java.util.StringTokenizer;


public class UserMainCode {
	public static void display(String input) {
		StringTokenizer st = new StringTokenizer(input, " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
