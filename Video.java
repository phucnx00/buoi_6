package action;

public class Video {
	private String fileName;
	private String title;
	private User user;
	
	public Video(String fileName, String title, User user) {
		this.fileName = fileName;
		this.title = title;
		this.user = user;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public String getTittle() {
		return this.title;
	}
	
	public User getUser() {
		return this.user;
	}
}
