import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserMainCode {
	
	static boolean isVowel(Character ch) {
		ch = ch.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			return true;
		else 
			return false;
	}
	
	public static boolean validateTeam(String team) {
			List<String> vowelList = new ArrayList();
			int vowelOdd=0;
			int vowelEven = 0;
			String[] teamArr = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
			vowelList = Arrays.asList(teamArr);
			
			for (int i = 0; i < team.length(); i++) {
				if (i % 2 == 1) {
					if (isVowel(team.charAt(i))) {
						vowelEven++;
					}
				} else {
					if (isVowel(team.charAt(i))) {
						vowelOdd++;
					}
				}
			}
			if (vowelEven > vowelOdd)
				return true;
			else
				return false;
	}
}
