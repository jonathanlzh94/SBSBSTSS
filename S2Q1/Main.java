import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(input);
		
		String[] strArr = input.split(" ");
		for (String str: strArr) {
			System.out.println(str);
		}
		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}

}
