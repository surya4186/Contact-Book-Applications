package com.zsgs.listcontact;

import java.util.List;

import com.zsgs.dto.Candidate;
import com.zsgs.repo.ContactBookRepository;

public class ListContactViewModel {
	public ListContactViewModel(ListContactView listContactView) {

	}

	public List<Candidate> getContact() {
		ContactBookRepository repository = ContactBookRepository.getInstance();
		List<Candidate> allContacts = repository.getAllContacts();

		return allContacts;
	}

}
