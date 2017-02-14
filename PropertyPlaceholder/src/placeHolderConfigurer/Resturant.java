package placeHolderConfigurer;

public class Resturant{
	String welcomeNote;
	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	public String getWelcomeNote() {
		return welcomeNote;
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
}