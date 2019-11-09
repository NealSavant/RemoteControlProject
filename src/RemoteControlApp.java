//AUTHOR : Neal Savant

import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		// is the remote control turned on?
		boolean online = false;
		// prompt user
		System.out.print("To begin, turn on the remote control (on): ");
		// import scanner
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		// wait for the user to turn on the machine
		while (online == false) {
			if (input.equalsIgnoreCase("on")) {
				online = true;
				powerButton(online);
			} else {
				System.out.println("Please turn the remote control on.");
				input = sc.next();
			}
		}

		// user has turned on the program

		while (online == true) {
			System.out.println("PLEASE PRESS A BUTTON 1-9");
			input = sc.next();
			pressButton(input);
		}

		sc.close();

	}

	public static boolean powerButton(boolean status) {
		boolean action = status;
		if (status == true) {
			System.out.println("TURNING ON...");

			return action;
		} else if (status == false) {
			System.out.println("TURNING OFF...");
			return action;
		}
		return action;
	}

	public static String pressButton(String choice) {
		String action = choice;

		// switch statement with buttons
		switch (choice) {
		case "1":
			System.out.println("Beep Boop!");
			return action;
		case "2":
			System.out.println("Boop Bop!");
			return action;
		case "3":
			System.out.println("Wzzzzzding bang!");
			return action;
		case "4":
			System.out.println("BEEP BEEP BEEP!");
			return action;
		case "5":
			System.out.println("Brrriiiing!");
			return action;
		case "6":
			System.out.println("Shk-Shk-Shk-Shk!");
			return action;
		case "7":
			System.out.println("Beep Boop!");
			return action;
		case "8":
			System.out.println("Beep Boop!");
			return action;
		case "9":
			System.out.println("Beep Boop!");
			return action;
		case "off":
			powerButton(false);
			return action;
		default:
			System.out.println("Command not recognized");
			return action;
		}
	}

}
