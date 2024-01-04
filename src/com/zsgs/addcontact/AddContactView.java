package com.zsgs.addcontact;

import java.util.Scanner;

import com.zsgs.dto.Candidate;

public class AddContactView {
	AddContactViewModel addContactViewModel;
	private Scanner scan = new Scanner(System.in);

	public AddContactView() {
		addContactViewModel = new AddContactViewModel(this);
	}

	public void addContact() {
		System.out.println("Enter First Name:");
		String firstName = scan.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = scan.nextLine();
		System.out.println("Enter Phone Number:");
		String contactNumber = scan.nextLine();
		System.out.println("Enter email:");
		String email = scan.nextLine();
		Candidate candidate = new Candidate(firstName, lastName, contactNumber, email);

		addContactViewModel.validate(candidate);
	}

	public void showError(String errMessage) {
		System.out.println(errMessage);
	}

	public void onSuccess(String onSuccess) {
		System.out.println(onSuccess);
	}

}
