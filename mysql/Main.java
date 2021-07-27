package src.srccode.mysql;

import java.util.Scanner;

import src.srccode.interfaces.UserDAO;

public class Main {
	private static final String YES = "Yes";
	private static final String NO = "No";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you want to add variables to database enter Yes, No if you don't want!");
		String agree = scanner.nextLine();
		if (agree.equals(YES)) {
			UserDAO dao = new CreateUser();
			dao.createUser();
		} else if (agree.equals(NO)) {
			main(args);
		}
		scanner.close();
	}

}
