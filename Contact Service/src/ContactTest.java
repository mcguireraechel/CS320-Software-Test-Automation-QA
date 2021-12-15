import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;



class ContactTest {
	
//testing putting items in the contact list and making sure they're equal to what the 'getters' return
	@Test
	@DisplayName("contact class working")
	void testContactClass() {
		Contact cont = new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle st");
		Assert.assertTrue(cont.getContactID().equals("1234"));
		Assert.assertTrue(cont.getFirstName().equals("Raechel"));
		Assert.assertTrue(cont.getLastName().equals("McGuire"));
		Assert.assertTrue(cont.getPhone().equals("2063758969"));
		Assert.assertTrue(cont.getAddress().equals("15 seattle st"));
		
		
		
	}
	
	//testing that an exception is thrown when ID is too long
	@Test
	@DisplayName("ContactID too long exception")
	void testIDTooLong() {
		Assert.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234567891011", "Raechel", "McGuire", "2063758969", "15 seattle st");
			
		});
	}
	
	//Testing that an exception is thrown when ID is null
	@Test
	@DisplayName("ContactID null exception")
	void testIDnull() {
		Assert.assertThrows(NullPointerException.class, ()->{
			new Contact( null, "Raechel", "McGuire", "2063758969", "15 seattle st");
			
		});
	}
	
	
	
	//testing that an exception is thrown when First Name is too long
	@Test
	@DisplayName("First Name too long exception")
	void testLongFirstfield() {
		Assert.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", "Raecheliscool", "McGuire", "2063758969", "15 seattle st");
		});
		
	}
	
	//testing that an exception is thrown when First Name is null
	@Test
	@DisplayName("First Name null exception")
	void testNullFirstfield() {
		Assert.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("1234", null, "McGuire", "2063758969", "15 seattle st");
		});
		
	}
	
	
	
	
	//testing that an exception is thrown when Last Name is too long
		@Test
		@DisplayName("Last Name too long exception")
		void testLongLastfield() {
			Assert.assertThrows(IllegalArgumentException.class, ()->{
				new Contact("1234", "Raechel", "McGuireiscool", "2063758969", "15 seattle st");
			});
			
		}
		
		//testing that an exception is thrown when Last Name is null
		@Test
		@DisplayName("Last Name null exception")
		void testNullLastfield() {
			Assert.assertThrows(IllegalArgumentException.class, ()->{
				new Contact("1234", "Raechel", null, "2063758969", "15 seattle st");
			});
			
		}



	//testing that exception is thrown when phone has more/less than 10 digits. Testing along the boundaries
		@Test
		@DisplayName("Phone length short exception")
		void testingPhoneShort() {
			Assert.assertThrows(IllegalArgumentException.class, ()->{
				new Contact("1234", "Raechel", "McGuire", "206378888", "15 seattle st");
			});
		}
			
	    @Test
		@DisplayName("Phone length long exception")
		void testingPhoneLong() {
			Assert.assertThrows(IllegalArgumentException.class, ()->{
				new Contact("1234", "Raechel", "McGuire", "20637888811", "15 seattle st");
			});
			
			
		}
	    @Test
		@DisplayName("Phone null exception")
		void testingPhonenull() {
			Assert.assertThrows(NullPointerException.class, ()->{
				new Contact("1234", "Raechel", "McGuire", null, "15 seattle st");
			});
		}

	    
	    
	    
	//testing that an exception is thrown when the address is greater than 30
	    @Test
	    @DisplayName("Address too long exception")
	    void testingLongAddress() {
	    	Assert.assertThrows(IllegalArgumentException.class, ()->{
	    		new Contact("1234", "Raechel", "McGuire", "2063758969", "15 seattle styyyyyyyyyyyyyyyyyy");
	    	});
	    	
	    }
	    
   //testing that an exception is thrown when address is null
	    @Test
	    @DisplayName("Address null exception")
	    
	    void testingNullAddress() {
	    	Assert.assertThrows(NullPointerException.class, ()->{
	    		new Contact("1234", "Raechel", "McGuire", "2063758969", null);
	    	});
	    }
	    




}
