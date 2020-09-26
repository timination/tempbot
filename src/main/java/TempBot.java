import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;


public class TempBot {

    private JDA jda;
    private MessageEventListener eventListener = new MessageEventListener();
    private MessageListenerAdapter listenerAdapter = new MessageListenerAdapter();
    private String token = null;

    public static void main(String... args) throws LoginException {
        if(args.length < 1) {
            System.out.println("Missing bot token");
            System.exit(0);
        } else {
            TempBot main = new TempBot(args[0]);
        }

    }

    public TempBot(String token) throws LoginException {
       this.token = token;
        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .addEventListeners(eventListener)
                .addEventListeners(listenerAdapter);
        builder.setToken(token);
        jda = builder.build();
        eventListener.setJDA(jda);
        listenerAdapter.setJDA(jda);
    }
}