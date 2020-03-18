import org.acplt.oncrpc.OncRpcException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class ChatServer extends ChatServerStub {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private MessageList messages;

    public ChatServer() throws OncRpcException, IOException {
        super();
        messages = new MessageList();
    }

    @Override
    public int connect_1(Chaine nickname) {
        LocalDateTime now = LocalDateTime.now();
        Chaine chaine = new Chaine("[" + dtf.format(now) + "]: " + nickname.value + " s'est connecté.");
        messages.values.add(chaine);
        return 0;
    }

    @Override
    public void sendMessage_1(Chaine message) {
        LocalDateTime now = LocalDateTime.now();
        Chaine chaine = new Chaine("[" + dtf.format(now) + "]: " + message.value);
        messages.values.add(chaine);
    }

    @Override
    public MessageList resyncMessages_1() {
        return messages;
    }

    public static void main(String... args) {
        try {
            new ChatServer().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
