package model.DTO;

public class Gimnast extends Person {
	private String Category;
	 private String Club;

	public Gimnast(String dNI, String name, String email, String phoneNumber, String categori, String club) {
		super(dNI, name, email, phoneNumber);
		Category = categori;
		Club = club;
	}
	

	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}


	public String getClub() {
		return Club;
	}


	public void setClub(String club) {
		Club = club;
	}


	@Override
	public String toString() {
		return super.toString()+"\n\tCategoría: " + Category + "\n\tClub: " + Club;
	}

}
