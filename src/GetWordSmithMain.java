import java.util.InputMismatchException;
import java.util.Scanner;

public class GetWordSmithMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int userInput = 0;
		boolean again;
		
		do {
			try {
				System.out.printf("Please insert a number: ");
				userInput = scan.nextInt();
				scan.nextLine();
				again = false;
			} catch (InputMismatchException e) {
				scan.nextLine();
				again = true;
				continue;
			} 
		
			System.out.println("Result: " + WordSmith.getWordSmith(userInput));
			System.out.println("Would you like to input another number? (Y/N): ");
		
			if (scan.nextLine().equalsIgnoreCase("y")) {
				again = true;
			} else {
				again = false;
			}
		
		} while (again);
		
		scan.close();
	}

}
