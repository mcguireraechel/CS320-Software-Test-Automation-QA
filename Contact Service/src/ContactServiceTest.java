import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	@DisplayName("adding contact test")
	void testAddContact() {
		
			Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
			ContactService service = new ContactService();
			service.addContact(contact);
			
			
			Assert.assertTrue(service.contactList.size() ==1);
			Assert.assertTrue(contact.getContactID().equals("1234"));
			Assert.assertTrue(contact.getFirstName().equals("Raechel"));
			Assert.assertTrue(contact.getLastName().equals("McGuire"));
			Assert.assertTrue(contact.getPhone().equals("2063758969"));
			Assert.assertTrue(contact.getAddress().equals("15 seattle st"));
			
			
			
		
		
	}
	
	
	
	@Test
	@DisplayName("Deleting contact test")
	void testDeleteContact() {
		Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		ContactService service = new ContactService();
		service.addContact(contact);
		
		Assert.assertTrue(service.contactList.size() == 1);
		
		service.deleteContact("1234");
		
		Assert.assertTrue(service.contactList.size() == 0);
		
		
	}
	
	
	
	@Test
	@DisplayName("update contact first name test")
	void updateContactsFirst() {
		Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		ContactService service = new ContactService();
		service.addContact(contact);
		
		Assert.assertTrue(contact.getFirstName().equals("Raechel"));
		service.updateFirstName("1234", "Jazzy");
		Assert.assertTrue(contact.getFirstName().equals("Jazzy"));
		
		
		
	}
	@Test
	@DisplayName("update contact Last name test")
	void updateContactsLast() {
		Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		ContactService service = new ContactService();
		service.addContact(contact);
		Assert.assertTrue(contact.getLastName().equals("McGuire"));
		
		service.updateLastName("1234", "Grossruck");
		Assert.assertTrue(contact.getLastName().equals("Grossruck"));
		
		
		
	}
	
	@Test
	@DisplayName("update contact phone number")
	void updatePhone() {
		Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		ContactService service = new ContactService();
		service.addContact(contact);
		Assert.assertTrue(contact.getPhone().equals("2063758969"));
		service.updatePhone("1234", "2533767896");
		Assert.assertTrue(contact.getPhone().equals("2533767896"));
		
	}
	
	@Test
	@DisplayName("Update contact Adress")
	void updateAdress() {
		Contact contact = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		ContactService service = new ContactService();
		service.addContact(contact);
		Assert.assertTrue(contact.getAddress().equals("15 seattle st"));
		service.updateAddress("1234", "6969 seseme street");
		Assert.assertTrue(contact.getAddress().equals("6969 seseme street"));
		
	}
}
