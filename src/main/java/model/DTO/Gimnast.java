package model.DTO;

public class Gimnast extends Person {
	private String Categori;
	 private String Club;

	public Gimnast(String dNI, String name, String email, String phoneNumber, String categori, String club) {
		super(dNI, name, email, phoneNumber);
		Categori = categori;
		Club = club;
	}
	

	public String getCategori() {
		return Categori;
	}


	public void setCategori(String categori) {
		Categori = categori;
	}


	public String getClub() {
		return Club;
	}


	public void setClub(String club) {
		Club = club;
	}


	@Override
	public String toString() {
		return super.toString()+"Categori=" + Categori + ", Club=" + Club + "]";
	}

}
