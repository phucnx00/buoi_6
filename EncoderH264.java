package action;

public class EncoderH264 implements VideoEncoder{
	@Override
	public void encode(Video video) {
		System.out.println("da encode" + video.getTittle());
	}
}
