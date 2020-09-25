package action;

public class Processor {
	private EmailService service;
	private VideoDataBase database;
	private VideoEncoder encode;
	
	public Processor(EmailService service , VideoDataBase database, VideoEncoder encode ) {
		this.service = service;
		this.database = database;
		this.encode =encode;
	}
	
	public void process(Video video) {
		encode.encode(video);
		database.store(video);
		service.send(video.getUser());
	}
}
