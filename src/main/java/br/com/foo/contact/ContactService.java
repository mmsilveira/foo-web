package br.com.foo.contact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {

	@Override
	public List<Contact> getAll() {
		return createContactsListFake();
	}

	public List<Contact> createContactsListFake() {
		List<Contact> contactsFake = new ArrayList<Contact>();
		contactsFake.add(new Contact("Hans", "Muster"));
		contactsFake.add(new Contact("Ruth", "Mueller"));
		contactsFake.add(new Contact("Heinz", "Kurz"));
		contactsFake.add(new Contact("Cornelia", "Meier"));
		contactsFake.add(new Contact("Werner", "Meyer"));
		contactsFake.add(new Contact("Lydia", "Kunz"));
		contactsFake.add(new Contact("Anna", "Best"));
		contactsFake.add(new Contact("Stefan", "Meier"));
		contactsFake.add(new Contact("Martin", "Mueller"));
		return contactsFake;
	}

}
