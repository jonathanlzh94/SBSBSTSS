

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		
		if(UserMainCode.validateTeam(strArr[0], strArr[1])) 
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}

}
