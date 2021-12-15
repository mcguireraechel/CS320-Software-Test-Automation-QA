
 class Contact {
	 private String contactID ;
	 private String firstName;
	 private String lastName;
	 private String phone;
	 private String address;
	 
	 public Contact(String contactID, String firstName,String lastName, String phone, String address) {
		 this.setContactID(contactID);
		 this.setFirstName(firstName);
		 this.setLastName(lastName);
		 this.setPhone(phone);
		 this.setAdress(address);
		 
	 }
	 
	 //getters
	 public String getContactID() {
		 return contactID;
	 }
	 public String getFirstName(){
		 return firstName;
	 }
	 public String getLastName() {
		 return lastName;
		
	 }
	 public String getPhone() {
		 return phone;
	 }
	 
	public String getAddress(){
		return address;
	}
	 //set contact ID
	 public void setContactID(String x){
		 if(x.length() >10 || x == null) {
			 throw new IllegalArgumentException("invalid ID");
			 
		 }
		 else {
			 this.contactID =x;
		 }
		 
	 }
	 
	 //set First Name
	 public void setFirstName(String x) {
		 if( x == null|| x.length() > 10) {
			 throw new IllegalArgumentException("invalid First Name");
			 
			 
			 
		 }
		 else {
		 this.firstName =x;
		 }
		 
	 }
	 
	 //set last name
	 public void setLastName(String x) {
		 if(x == null||x.length() >10  ) {
			 throw new IllegalArgumentException("invalid Last Name");
			 
			 
		 }
		 else {
		 this.lastName =x;
		 }
		 
	 }
	 
	 //set phone
	 public void setPhone(String x) {
		 if(x.length() <10 ||x.length()>10 ||x == null) {
			 throw new IllegalArgumentException("invalid Phone");
			 
			 
		 }
		 else {
		 this.phone =x;
		 }
		 
		 
	 }
	 
	 //set address
	 public void setAdress(String address) {
		 if(address.length() >30 || address == null) {
			 throw new IllegalArgumentException("invalid Address");
			 
			 
		 }
		 else {
		 this.address =address;
		 }
		 
	 }
	 
	 
	
	
	
 
 
 
 }

	


