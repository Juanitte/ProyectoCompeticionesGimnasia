package model.DTO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Gimnasta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gimnast extends Person implements Serializable {
	private Category Category;
	 private String Club;

	public Gimnast() {
		super();
		this.Category = null;
		this.Club = "";
	}

	public Gimnast(String Dni, String Name, String Email, String PhoneNumber, Category category, String Club) {
		super(Dni, Name, Email, PhoneNumber);
		Category = category;
		this.Club = Club;
	}
	




	public Category getCategory() {
		return Category;
	}





	public void setCategory(Category category) {
		this.Category = category;
	}





	public String getClub() {
		return Club;
	}





	public void setClub(String club) {
		this.Club = club;
	}



	@Override
	public String toString() {
		return super.toString()+"\n\tCategoría: " + Category + "\n\tClub: " + Club;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Category == null) ? 0 : Category.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	
}
