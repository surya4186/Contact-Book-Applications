package com.zsgs.addcontact;

import java.util.Scanner;

import com.zsgs.dto.Candidate;
import com.zsgs.repo.ContactBookRepository;

public class AddContactViewModel {
	private AddContactView contactView;
	Scanner scan = new Scanner(System.in);

	public AddContactViewModel(AddContactView contactView) {
		this.contactView = contactView;
	}

	public void validate(Candidate candidate) {
		boolean isFirstNameValid = validateFirstName(candidate);
		boolean validateContactNumber = validateContactNumber(candidate);
		boolean isEmailValid = validateEmail(candidate);

		if (isFirstNameValid && validateContactNumber && isEmailValid) {
			ContactBookRepository.getInstance().insertContact(candidate);
			this.contactView.onSuccess("Your Contact is Saved");
		}
	}

	private boolean validateFirstName(Candidate candidate) {
		if (!(candidate.getFirstName().length() > 3 && candidate.getFirstName().length() < 40)) {
			this.contactView.showError("Invalid Name - Name length should be min 3 and Max 50");
			return false;
		}
		return true;
	}

	private boolean validateEmail(Candidate candidate) {
		if (!candidate.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			this.contactView.showError("Invalid Email - Please Check");
			return false;
		}
		return true;
	}

	private boolean validateContactNumber(Candidate candidate) {
		if (candidate.getContactNumber().length() != 10 && !candidate.getContactNumber().matches("\\\\d{10}")) {
			this.contactView.showError("Invalid Phone Number");
			return false;
		}
		return true;
	}

}
