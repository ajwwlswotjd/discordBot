package disbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = ""; // 이곳에는 .gitignore 로 토큰 스트링을 넝어야 동작함!
		
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new LunchListener());
			builder.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
