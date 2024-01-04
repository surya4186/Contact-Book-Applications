package com.zsgs.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zsgs.dto.Candidate;

public class ContactBookRepository {
	private static ContactBookRepository repository;
	private Map<String, Candidate> map = new HashMap<>();

	private ContactBookRepository() {

	}

	public static ContactBookRepository getInstance() {
		if (repository == null) {
			repository = new ContactBookRepository();
		}
		return repository;
	}

	public void insertContact(Candidate candidate) {
		map.put(candidate.getFirstName(), candidate);

	}

	public List<Candidate> getAllContacts() {
		return new ArrayList<>(map.values());
	}

}
