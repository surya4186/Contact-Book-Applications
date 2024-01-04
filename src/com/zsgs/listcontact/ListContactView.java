package com.zsgs.listcontact;

import java.util.List;

import com.zsgs.dto.Candidate;

public class ListContactView {
	ListContactViewModel listContact;

	public ListContactView() {
		listContact = new ListContactViewModel(this);

	}

	public void viewContact() {
		List<Candidate> contactList = listContact.getContact();
		if (!contactList.isEmpty()) {
			System.out.println("         Contacts List..");
//			System.out.println("\u001B[34m FirstName  LastName  PhoneNumber  Email \u001B[0m");
//			System.out.println("\u001B[31m^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\u001B[0m");
			for (Candidate val : contactList) {
				System.out.println("  " + val.getFirstName() + "    " + val.getLastName() + "    "
						+ val.getContactNumber() + "    " + val.getEmail());
			}

		} else {
			System.out.println("No Contacts in Contact Book");
		}

	}

}
