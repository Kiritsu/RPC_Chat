/*
 * Automatically generated by jrpcgen 1.0.5 on 3/18/20, 3:31 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
import org.acplt.oncrpc.*;
import java.io.IOException;

import java.net.InetAddress;

/**
 * The class <code>ChatClient</code> implements the client stub proxy
 * for the CHAT_PROG remote program. It provides method stubs
 * which, when called, in turn call the appropriate remote method (procedure).
 */
public class ChatClientStub extends OncRpcClientStub {

    /**
     * Constructs a <code>ChatClient</code> client stub proxy object
     * from which the CHAT_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public ChatClientStub(InetAddress host, int protocol)
           throws OncRpcException, IOException {
        super(host, Chat.CHAT_PROG, 1, 0, protocol);
    }

    /**
     * Constructs a <code>ChatClient</code> client stub proxy object
     * from which the CHAT_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public ChatClientStub(InetAddress host, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, Chat.CHAT_PROG, 1, port, protocol);
    }

    /**
     * Constructs a <code>ChatClient</code> client stub proxy object
     * from which the CHAT_PROG remote program can be accessed.
     * @param client ONC/RPC client connection object implementing a particular
     *   protocol.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public ChatClientStub(OncRpcClient client)
           throws OncRpcException, IOException {
        super(client);
    }

    /**
     * Constructs a <code>ChatClient</code> client stub proxy object
     * from which the CHAT_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public ChatClientStub(InetAddress host, int program, int version, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, 0, protocol);
    }

    /**
     * Constructs a <code>ChatClient</code> client stub proxy object
     * from which the CHAT_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public ChatClientStub(InetAddress host, int program, int version, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, port, protocol);
    }

    /**
     * Call remote procedure connect_1.
     * @param nickname parameter (of type Chaine) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int connect_1(Chaine nickname)
           throws OncRpcException, IOException {
        XdrInt result$ = new XdrInt();
        client.call(Chat.connect_1, Chat.CHAT_VERSION, nickname, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure sendMessage_1.
     * @param message parameter (of type Chaine) to the remote procedure call.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public void sendMessage_1(Chaine message)
           throws OncRpcException, IOException {
        XdrVoid result$ = XdrVoid.XDR_VOID;
        client.call(Chat.sendMessage_1, Chat.CHAT_VERSION, message, result$);
    }

    /**
     * Call remote procedure resyncMessages_1.
     * @return Result from remote procedure call (of type MessageList).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public MessageList resyncMessages_1()
           throws OncRpcException, IOException {
        XdrVoid args$ = XdrVoid.XDR_VOID;
        MessageList result$ = new MessageList();
        client.call(Chat.resyncMessages_1, Chat.CHAT_VERSION, args$, result$);
        return result$;
    }

}
// End of ChatClient.java
