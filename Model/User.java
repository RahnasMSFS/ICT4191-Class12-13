package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
 
	@Id
	private String UserdId;
	private String EmailId;
	private String FirstName;
	private String LastName; 
	private int Age;

	public User()
	{}

	public User(String userdId, String emailId, String firstName, String lastName, int age) {
		super();
		UserdId = userdId;
		EmailId = emailId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
	}

	public String getUserdId() {
		return UserdId;
	}

	public void setUserdId(String userdId) {
		UserdId = userdId;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
}
