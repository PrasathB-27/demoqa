package demoqa.elements;

public class TestBox {
	
	private String fullName;
	private String email;
	private String currentAddress;
	private String permanentAddress;
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCurrentAddress() {
		return currentAddress;
	}
	
	public String getPermanentAddress() {
		return permanentAddress;
	}
	
}
