
public class UserMainCode {
	
	public static boolean validatePlayer(String first, String last) {
			for (int i = 0; i < first.length(); i++) {
				if (first.length() % 2 == 0) {
					return false;
				}
				if (i%2 ==1) {
					if (!(first.charAt(i) == '*'))
						return false;
				}
			}
			
			for (int j = 0; j < last.length(); j++) {
				if (last.length() % 2 == 0) {
					return false;
				}
				if (j % 2 == 1) { 
					if (!(last.charAt(j) == '#'))
						return false;
				}
			}
			
			return true;
	}
}
