import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

import java.util.ArrayList;
import java.util.List;

public class MessageEventListener implements EventListener {

    JDA jda;

    public void setJDA(JDA jda) {
        this.jda = jda;
    }

    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof ReadyEvent) {

        }
    }

    // sendMessage(channel, msg); (TextChannel, String)
    static void sendMessage(TextChannel ch, String msg) {
        ch.sendMessage(msg).queue();
    }
}