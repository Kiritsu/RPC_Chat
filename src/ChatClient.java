import org.acplt.oncrpc.OncRpcException;
import org.acplt.oncrpc.OncRpcProtocols;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.InetAddress;

public class ChatClient extends JFrame {
    private JTextArea messages;
    private ChatClientStub stub;
    private String nickname;

    public ChatClient() throws IOException, OncRpcException {
        super("Chat RPC");

        setSize(350, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        stub = new ChatClientStub(InetAddress.getLocalHost(), OncRpcProtocols.ONCRPC_UDP);
        nickname = JOptionPane.showInputDialog("Entrez votre pseudonyme:");
        stub.connect_1(new Chaine(nickname));

        init();
        setVisible(true);

        new Thread(() -> {
            while (true) {
                StringBuilder builder = new StringBuilder();

                try {
                    for (Chaine chaine : stub.resyncMessages_1().values) {
                        builder.append(chaine.value).append("\n");
                    }
                } catch (OncRpcException | IOException e) {
                    e.printStackTrace();
                }

                messages.setText(builder.toString());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void init() {
        messages = new JTextArea();
        JScrollPane pane = new JScrollPane(messages);

        add(pane);
        JTextField field = new JTextField();
        field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() != KeyEvent.VK_ENTER) {
                    return;
                }

                if (field.getText().length() == 0) {
                    return;
                }

                try {
                    stub.sendMessage_1(new Chaine("(" + nickname + "): " + field.getText()));
                    field.setText("");
                } catch (OncRpcException | IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        add(field, BorderLayout.SOUTH);
    }

    public static void main(String... args) {
        try {
            new ChatClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
