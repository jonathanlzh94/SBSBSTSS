import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the player name");
		String player = sc.nextLine();
		System.out.println("Enter the team name");
		String team = sc.nextLine();
		
		UserMainCode.display(player, team);
	}

}
