import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserMainCode {
	
	public static boolean validateTeam(String team, String num) {
			List<String> teamList = new ArrayList();
			String[] teamArr = {"RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG", "GL"};
			teamList = Arrays.asList(teamArr);
			if (!teamList.contains(team)) {
				return false;
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i)))  
					return false;
			}
			return true;
	}
}
