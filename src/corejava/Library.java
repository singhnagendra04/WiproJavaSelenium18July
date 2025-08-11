package corejava;

public class Library {
	private String title;
	private String author;
	private Boolean isAvailable;
	
	public Boolean getIssue() {
		return isAvailable;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setIssue(Boolean isAvailable, String title, String author){
		this.isAvailable = isAvailable;
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library();
        l.setIssue(false,"Mind Games", "Aman");
        System.out.println("Book : " +l.getTitle() +"  Author : " + l.getAuthor() +"  Availability : "+ l.getIssue());
        
	}

}
