import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class MessageListenerAdapter extends ListenerAdapter {

    private JDA jda;
    private MessageResponse mr = new MessageResponse();
    private EmbedBuilder eb = new EmbedBuilder();

    public MessageListenerAdapter() {
        eb.setTitle("TempBot", null);
        eb.setColor(Color.red);
        eb.setColor(new Color(0xD0551C));
        eb.setColor(new Color(208, 85, 28));
        eb.setDescription("Provides temporary macros for TPH");
        eb.addField("Available Macros", "++ask, ++askbetterfirst, ++bin, ++imageofcode, ++noresearch, ++patience, ++wrapcode, ++wrapmini, ++xyproblem", true);
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        Message msg = event.getMessage();
        String msgRaw = msg.getContentRaw().toLowerCase();

        if(event.getAuthor().isBot()) {
            return;
        }

        if(mr.Macro.containsKey(msgRaw)) {
            event.getTextChannel().sendMessage(mr.Macro.get(msgRaw)).queue();
        }
        if(msg.getContentRaw().equalsIgnoreCase("tempbot!help")) {
            event.getTextChannel().sendMessage(eb.build()).queue();
        }
    }

    static void sendMessage(MessageChannel ch, String msg) {
        ch.sendMessage(msg);
    }

    public void setJDA(JDA jda) {
        this.jda = jda;
    }
}
