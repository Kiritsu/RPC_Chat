package exo1;/*
 * Automatically generated by jrpcgen 1.0.5 on 3/18/20, 2:36 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
import org.acplt.oncrpc.*;
import java.io.IOException;

import java.net.InetAddress;

/**
 * The class <code>HelloWorldClient</code> implements the client stub proxy
 * for the HELLO_WORLD_PROG remote program. It provides method stubs
 * which, when called, in turn call the appropriate remote method (procedure).
 */
public class HelloWorldClient extends OncRpcClientStub {

    /**
     * Constructs a <code>HelloWorldClient</code> client stub proxy object
     * from which the HELLO_WORLD_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public HelloWorldClient(InetAddress host, int protocol)
           throws OncRpcException, IOException {
        super(host, HelloWorld.HELLO_WORLD_PROG, 1, 0, protocol);
    }

    /**
     * Constructs a <code>HelloWorldClient</code> client stub proxy object
     * from which the HELLO_WORLD_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public HelloWorldClient(InetAddress host, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, HelloWorld.HELLO_WORLD_PROG, 1, port, protocol);
    }

    /**
     * Constructs a <code>HelloWorldClient</code> client stub proxy object
     * from which the HELLO_WORLD_PROG remote program can be accessed.
     * @param client ONC/RPC client connection object implementing a particular
     *   protocol.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public HelloWorldClient(OncRpcClient client)
           throws OncRpcException, IOException {
        super(client);
    }

    /**
     * Constructs a <code>HelloWorldClient</code> client stub proxy object
     * from which the HELLO_WORLD_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public HelloWorldClient(InetAddress host, int program, int version, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, 0, protocol);
    }

    /**
     * Constructs a <code>HelloWorldClient</code> client stub proxy object
     * from which the HELLO_WORLD_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public HelloWorldClient(InetAddress host, int program, int version, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, port, protocol);
    }

    /**
     * Call remote procedure hello_world_null_1.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public void hello_world_null_1()
           throws OncRpcException, IOException {
        XdrVoid args$ = XdrVoid.XDR_VOID;
        XdrVoid result$ = XdrVoid.XDR_VOID;
        client.call(HelloWorld.hello_world_null_1, HelloWorld.HELLO_WORLD_VERSION_1, args$, result$);
    }

    /**
     * Call remote procedure hello_world_1.
     * @param arg1 parameter (of type Chaine) to the remote procedure call.
     * @return Result from remote procedure call (of type Chaine).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public Chaine hello_world_1(Chaine arg1)
           throws OncRpcException, IOException {
        Chaine result$ = new Chaine();
        client.call(HelloWorld.hello_world_1, HelloWorld.HELLO_WORLD_VERSION_1, arg1, result$);
        return result$;
    }

}
// End of HelloWorldClient.java
