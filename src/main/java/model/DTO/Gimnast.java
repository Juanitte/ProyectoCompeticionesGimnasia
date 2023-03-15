package model.DTO;

public class Gimnast extends Person {
	private Category Category;
	 private String Club;
	 
	 public Gimnast() {
		 super();
		 this.Category = null;
		 this.Club = "";		 
	 }

	public Gimnast(String dni, String name, String email, String phoneNumber, Category category, String club) {
		super(dni, name, email, phoneNumber);
		Category = category;
		Club = club;
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
