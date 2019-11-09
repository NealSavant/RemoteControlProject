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
			online = pressButton(input);
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

	public static Boolean pressButton(String choice) {
		Boolean action = true;

		// switch statement with buttons
		switch (choice) {
		case "1":
			System.out.println("Beep Boop!");
			break;
		case "2":
			System.out.println("Boop Bop!");
			break;
		case "3":
			System.out.println("Wzzzzzding bang!");
			break;
		case "4":
			System.out.println("BEEP BEEP BEEP!");
			break;
		case "5":
			System.out.println("Brrriiiing!");
			break;
		case "6":
			System.out.println("Shk-Shk-Shk-Shk!");
		case "7":
			System.out.println("Ribbit!");
			break;
		case "8":
			System.out.println("Whillhelm Scream.");
			break;
		case "9":
			System.out.println("Dada dadum dooda duuu");
			break;
		case "off":
			action = powerButton(false);
			return action;
		default:
			System.out.println("Command not recognized");
			return action;
		}
		return action;
	}

}
