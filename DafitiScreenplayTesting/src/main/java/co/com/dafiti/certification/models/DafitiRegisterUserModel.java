package co.com.dafiti.certification.models;

public class DafitiRegisterUserModel {
	private String email;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastNames;
	private String documentNumber;
	private String documentType;
	private String birthDate;
	private String gender;
	
	public DafitiRegisterUserModel(
			String email, String password, String confirmPassword,
			String firstName, String lastNames, String documentNumber,
			String documentType, String birthDate, String gender) {
		
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.firstName = firstName;
		this.lastNames = lastNames;
		this.documentNumber = documentNumber;
		this.documentType = documentNumber;
		this.birthDate = birthDate;
		this.gender = gender;
	}
	
	public String getEmail() { return email; }
	public String getPassword() { return password; }
	public String getConfirmPassword() { return confirmPassword; }
	public String getFirstName() { return firstName; }
	public String getLastNames() { return lastNames; }
	public String getDocumentNumber() { return documentNumber; }
	public String getDocumentType() { return documentType; }
	public String getBirthDate() { return birthDate; }
	public String getGender() { return gender; }
}
