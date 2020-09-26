import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;


public class TempBot {

    private JDA jda;
    private MessageEventListener eventListener = new MessageEventListener();
    private MessageListenerAdapter listenerAdapter = new MessageListenerAdapter();
    private final String token = BotToken.token;

    public static void main(String... args) throws LoginException {
        TempBot main = new TempBot();
    }

    public TempBot() throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .addEventListeners(eventListener)
                .addEventListeners(listenerAdapter);
        builder.setToken(token);
        jda = builder.build();
        eventListener.setJDA(jda);
        listenerAdapter.setJDA(jda);
    }
}