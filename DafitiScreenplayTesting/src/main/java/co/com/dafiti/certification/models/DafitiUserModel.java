package co.com.dafiti.certification.models;

public class DafitiUserModel {
	
	private String email;
	private String password;
	
	public DafitiUserModel(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() { return email; }
	public String getPassword() { return password; }
}
