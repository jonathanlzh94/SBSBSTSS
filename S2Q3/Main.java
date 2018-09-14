import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replace("!", "");
		input = input.replace("#", "");
		
		System.out.println(input);
	}

}
