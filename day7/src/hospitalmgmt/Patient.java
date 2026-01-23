package hospitalmgmt;
import java.util.*;
import java.util.Objects;
public class Patient extends User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", date=" + date
				+ "]";
	}

	public Patient(int age, char gender, String email, String date, String name) {
		super();
		this.name = name;
		this.gender=gender;
		this.email=email;
		this.date=date;
		this.age=age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(name, other.name);
	}
	
}
