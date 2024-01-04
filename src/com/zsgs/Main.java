package com.zsgs;

import java.util.Scanner;

import com.zsgs.addcontact.AddContactView;
import com.zsgs.editcontact.EditContactView;
import com.zsgs.listcontact.ListContactView;

public class Main {

	public static void main(String[] args) {

		Main contactBooking = new Main();
		contactBooking.displayInfo();

	}

	private void menu() {
		System.out.println("------------Contact Application------------");
		System.out.println("Press 1 to Add a New Contact");
		System.out.println("Press 2 to List all Contacts");
		System.out.println("Press 3 to Edit a Contact");
		System.out.println("Press 4 to Delete a Contact");
		System.out.println("Press 5 to Search a Contact");
		System.out.println("Press 6 to Exit");
	}

	public void displayInfo() {
		Scanner scanner = new Scanner(System.in);
		int input;
		try {
			do {
				menu();
				System.out.println("Please Select One Option : ");
				input = scanner.nextInt();
				switch (input) {
				case 1:
					AddContactView addContactView = new AddContactView();
					addContactView.addContact();
					break;
				case 2:
					ListContactView listContactView = new ListContactView();
					listContactView.viewContact();
					break;
				case 3:
					EditContactView editContactView = new EditContactView();
//					editContactView.editContact();
					break;

				default:
					System.err.println("***Please Enter Valid Number***");
				}
			} while (input != 6);
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
			displayInfo();
		}
	}

}
