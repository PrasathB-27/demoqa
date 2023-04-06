package demoqa.forms;

public class Student {
	
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String phoneNubmer;
	private String dob;
	private String[] subjects;
	private String[] Hobbies;
	private String imgUrl = "/Users/prasath-pt6576/Downloads/pexels-arantxa-treva-959314.jpg";
	private String currentAddress;
	private String state;
	private String city;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhoneNubmer() {
		return phoneNubmer;
	}
	public void setPhoneNubmer(String phoneNubmer) {
		this.phoneNubmer = phoneNubmer;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	public String[] getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		
		return getFirstName()+" "+getLastName()+" "+getEmail()+
				" "+getGender()+" "+getPhoneNubmer()+
				" "+getDob()+" "+getSubjects()+
				" "+getHobbies()+" "+getCurrentAddress()+
				" "+getState()+" "+getCity();
	}
	
}
