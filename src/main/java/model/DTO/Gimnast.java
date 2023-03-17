package model.DTO;

public class Gimnast extends Person {
	private Category Category;
	 private String Club;

	

	public Gimnast(String Dni, String Name, String Email, String PhoneNumber, Category category, String Club) {
		super(Dni, Name, Email, PhoneNumber);
		Category = category;
		this.Club = Club;
	}
	




	public Category getCategory() {
		return Category;
	}





	public void setCategory(Category category) {
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
