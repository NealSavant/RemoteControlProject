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
		// receive user string
		String input = sc.next();

		if (input.equalsIgnoreCase("on")) {
			online = true;
			pressButton(online);
		}

		sc.close();

	}

	// TODO: Add pressButton() Method
	public static boolean pressButton(boolean status) {
		boolean action = status;
		if (status == true) {
			System.out.println("TURNING ON...");
			System.out.println("PLEASE PRESS A BUTTON 1-9");
			return action;
		}
		else if(status == false) {
			System.out.println("TURNING OFF...");
			return action;
		}
		return action;
	}

	// TODO: Add turnOnButton() Method

	public static void printMenu() {

	}

}
