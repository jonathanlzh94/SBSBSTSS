import java.util.StringTokenizer;


public class UserMainCode {
	public static void display(String stat) {
		StringTokenizer st = new StringTokenizer(stat, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
