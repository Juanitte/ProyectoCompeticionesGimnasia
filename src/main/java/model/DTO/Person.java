package model.DTO;

import java.io.Serializable;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Persona")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Person implements Serializable {
	protected String Dni;
	protected String Name;
	protected String Email;
	protected String PhoneNumber;
	
	public Person() {
		this.Dni = "";
		this.Name = "";
		this.Email = "";
		this.PhoneNumber = "";
	}
	
	public Person(String Dni, String Name, String Email, String PhoneNumber) {
		super();
		this.Dni = Dni;
		this.Name = Name;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		this.Dni = dni;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Dni == null) ? 0 : Dni.hashCode());
		return result;
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
		if (Dni == null) {
			if (other.Dni != null)
				return false;
		} else if (!Dni.equals(other.Dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gimnasta:\n\tDNI: " + Dni + "\n\tNombre: " + Name + "\n\tEmail: " + Email + "\n\tTeléfono: " + PhoneNumber;
	}
	

}
