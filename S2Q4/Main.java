

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String delim = sc.nextLine();
		input = input.replace(delim, "");
		
		System.out.println(input);
	}

}
