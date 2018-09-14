import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserMainCode {
	
	
	public static boolean validatePlayer(String s1, String s2) {
			for (int i = 0; i < s1.length(); i++) {
				if (!((1 + (int)s1.charAt(i)) == (int)s2.charAt(i)))
				return false;
			}
			return true;
	}
}
