
public class Author {
	
	private String firstName;
	private String lastName;
	private Date birthday;
	private String residence;
	private String email;
	
	// Konstruktor
		public Author(String firstName, String lastName, Date birthday, String residence, String email) {

			this.firstName = firstName;
			this.lastName = lastName;
			this.birthday = birthday;
			this.residence = residence;
			this.email = email;
		}

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

	public Date getBirth() {
		return birthday;
	}

	public void setBirth(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String toString() {
		 return this.firstName + " " + this.lastName;

	}

	public String getContactInformation() {
		return firstName + " " + lastName + Terminal.NEWLINE + email + Terminal.NEWLINE + residence;
	}

	public int getAgeAt(Date today) {
		return birthday.getAgeInYearsAt(today);
	}
}
