

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(UserMainCode.validateTeam(input)) 
			System.out.println("Lucky");
		else 
			System.out.println("Unlucky");
	}

}
