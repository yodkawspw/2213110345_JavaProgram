
public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return true;
	}
	
	@Override
	public String getLastName() {
		return null;
	}
	
	@Override
	public String getFirstName() {
		return null;
	}
	
	@Override
	public boolean checkEmail() {
		return true;
	}
	
	
	@Override
	public int totalPublicYear() {
		int totalYear = this.publicYear;
		return totalYear;
	}
	
	public String toString() {
		return getTitle()+"write by "+getLastName()+"."+getFirstName()+"("+email+")"
				+"Published for "+totalPublicYear();
	}
	
}
