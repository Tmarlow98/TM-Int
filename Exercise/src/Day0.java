import java.util.Scanner;

public class Day0 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your name?");
		String inputString = scan.nextLine();

		scan.close();

		System.out.println("Hello, Tyler");
		System.out.println(inputString);
	}

}
