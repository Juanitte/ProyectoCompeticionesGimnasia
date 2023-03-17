package model.DTO;

import java.util.Objects;

public abstract class Person {
	protected String Dni;
	protected String Name;
	protected String Email;
	protected String PhoneNumber;
	public Person(String Dni, String Name, String Email, String PhoneNumber) {
		super();
		Dni = Dni;
		Name = Name;
		this.Email = Email;
		PhoneNumber = PhoneNumber;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Dni, Email, Name, PhoneNumber);
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
		return Objects.equals(Dni, other.Dni) && Objects.equals(Email, other.Email) && Objects.equals(Name, other.Name)
				&& Objects.equals(PhoneNumber, other.PhoneNumber);
	}
	@Override
	public String toString() {
		return "Gimnasta:\n\tDNI: " + Dni + "\n\tNombre: " + Name + "\n\tEmail: " + Email + "\n\tTeléfono: " + PhoneNumber;
	}
	

}
