package action;

public class SqlDataBase implements VideoDataBase {
	@Override
	public void store(Video video) {
		System.out.println(video.getTittle() + "da luu");
	}
}
