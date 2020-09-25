package action;

public class GmailService implements EmailService {
	@Override
	public void send(User user) {
		System.out.println(user.getEmail() + "da gui thanh cong");
	}
}
