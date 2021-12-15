import java.util.HashMap;
import java.util.ArrayList;
public class ContactService {
	
	 ArrayList <Contact> contactList = new ArrayList<Contact>();
	 
	 
	
	
	
	//add contact 
	public void addContact( Contact newContact) {
		this.contactList.add(newContact);
		
		
		
		
	}
	
		//delete contact based on contactID
	public void deleteContact(String contactID) {
		for (int i =0; i < contactList.size(); i++) {
			if(this.contactList.get(i).getContactID() == contactID) {
				this.contactList.remove(i);
				break;
			}
			
		}
		
	}
	//update first name with contactID
	public void updateFirstName(String ID, String newFirst) {
		for(int i =0; i < contactList.size(); i++) {
			if(this.contactList.get(i).getContactID() == ID) {
				this.contactList.get(i).setFirstName(newFirst);
				
			}
			
		}
		
	}
	//update last name with contactID
	public void updateLastName(String ID, String newLast) {
		for(int i =0; i < contactList.size(); i++) {
			if(this.contactList.get(i).getContactID() == ID) {
				this.contactList.get(i).setLastName(newLast);
				
			}
			
		}
	}
		//update phone with contactiD
		public void updatePhone(String ID, String newPhone) {
			for(int i =0; i < contactList.size(); i++) {
				if(this.contactList.get(i).getContactID() == ID) {
					this.contactList.get(i).setPhone(newPhone);;
					
				}
				
			}
		
	}
		//update address from contactID
		public void updateAddress(String ID, String newAddress) {
			for(int i =0; i <contactList.size(); i++) {
				if(this.contactList.get(i).getContactID().equals(ID)) {
					this.contactList.get(i).setAdress(newAddress);
					
				}
				
			}
			
			
		}
		
		
			
			
		
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
