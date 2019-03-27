package Classes;
public class Person {
	// data fields
	private String name = "";
	private String academicNum = "";
	private String phone = "";
	private String email = "";
	private int level = 0;

	// constructers

	Person(String name, String academicNum, int level, String phone, String email) {
		this.name = name;
		this.academicNum = academicNum;
		setPhone(phone);
		setEmail(email);
		this.level = level;
	}

	// getters
	public String getName() {
		return name;
	}

	public String getAcademicNum() {
		return academicNum;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAcademicNum(String academicNum) {
		this.academicNum = academicNum;
	}

	public void setPhone(String phone) {
		boolean digit = true;
		for (int i = 0; i < phone.length(); i++) {
			if (!Character.isDigit(phone.charAt(i))){
				digit = false;
			}
		}
		if (phone.length() > 0 && phone.length() < 11 && digit) 
				this.phone = phone;
		else{
			this.phone = "0000000000";
		}
	}

	public void setEmail(String email) {
		if(email.contains("@") && email.contains("."))
			this.email = email;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// to string
	@Override
	public String toString() {
		return " Name: " + name + " | Academic No: " + academicNum + " | Phone: " + phone + " | Email: " + email
				+ " | Level: " + level;
	}
}
