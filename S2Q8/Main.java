

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(UserMainCode.validatePlayer(s1, s2)) 
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}

}
