package model.DTO;

import java.util.Objects;

public abstract class Person {
	protected String DNI;
	protected String Name;
	protected String email;
	protected String PhoneNumber;
	
	public Person() {
		this.DNI = "";
		this.Name = "";
		this.email = "";
		this.PhoneNumber = "";
	}
	
	public Person(String dNI, String name, String email, String phoneNumber) {
		super();
		DNI = dNI;
		Name = name;
		this.email = email;
		PhoneNumber = phoneNumber;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, Name, PhoneNumber, email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(Name, other.Name)
				&& Objects.equals(PhoneNumber, other.PhoneNumber) && Objects.equals(email, other.email);
	}
	@Override
	public String toString() {
		return "Gimnasta:\n\tDNI: " + DNI + "\n\tNombre: " + Name + "\n\tEmail: " + email + "\n\tTeléfono: " + PhoneNumber;
	}
	

}
