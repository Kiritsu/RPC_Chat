package exo2;/*
 * Automatically generated by jrpcgen 1.0.5 on 3/18/20, 2:45 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
import org.acplt.oncrpc.*;
import java.io.IOException;

import java.net.InetAddress;

/**
 * The class <code>CalculClient</code> implements the client stub proxy
 * for the CALCUL_PROG remote program. It provides method stubs
 * which, when called, in turn call the appropriate remote method (procedure).
 */
public class CalculClientStub extends OncRpcClientStub {

    /**
     * Constructs a <code>CalculClient</code> client stub proxy object
     * from which the CALCUL_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public CalculClientStub(InetAddress host, int protocol)
           throws OncRpcException, IOException {
        super(host, Calcul.CALCUL_PROG, 2, 0, protocol);
    }

    /**
     * Constructs a <code>CalculClient</code> client stub proxy object
     * from which the CALCUL_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public CalculClientStub(InetAddress host, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, Calcul.CALCUL_PROG, 2, port, protocol);
    }

    /**
     * Constructs a <code>CalculClient</code> client stub proxy object
     * from which the CALCUL_PROG remote program can be accessed.
     * @param client ONC/RPC client connection object implementing a particular
     *   protocol.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public CalculClientStub(OncRpcClient client)
           throws OncRpcException, IOException {
        super(client);
    }

    /**
     * Constructs a <code>CalculClient</code> client stub proxy object
     * from which the CALCUL_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public CalculClientStub(InetAddress host, int program, int version, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, 0, protocol);
    }

    /**
     * Constructs a <code>CalculClient</code> client stub proxy object
     * from which the CALCUL_PROG remote program can be accessed.
     * @param host Internet address of host where to contact the remote program.
     * @param program Remote program number.
     * @param version Remote program version number.
     * @param port Port number at host where the remote program can be reached.
     * @param protocol {@link org.acplt.oncrpc.OncRpcProtocols Protocol} to be
     *   used for ONC/RPC calls.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public CalculClientStub(InetAddress host, int program, int version, int port, int protocol)
           throws OncRpcException, IOException {
        super(host, program, version, port, protocol);
    }

    /**
     * Call remote procedure calcul_null_1.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public void calcul_null_1()
           throws OncRpcException, IOException {
        XdrVoid args$ = XdrVoid.XDR_VOID;
        XdrVoid result$ = XdrVoid.XDR_VOID;
        client.call(Calcul.calcul_null_1, Calcul.CALCUL_VERSION_INT, args$, result$);
    }

    /**
     * Call remote procedure add_1.
     * @param a parameter (of type int) to the remote procedure call.
     * @param b parameter (of type int) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int add_1(int a, int b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public int a;
            public int b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeInt(a);
                xdr.xdrEncodeInt(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrInt result$ = new XdrInt();
        client.call(Calcul.add_1, Calcul.CALCUL_VERSION_INT, args$, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure sub_1.
     * @param a parameter (of type int) to the remote procedure call.
     * @param b parameter (of type int) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int sub_1(int a, int b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public int a;
            public int b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeInt(a);
                xdr.xdrEncodeInt(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrInt result$ = new XdrInt();
        client.call(Calcul.sub_1, Calcul.CALCUL_VERSION_INT, args$, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure mul_1.
     * @param a parameter (of type int) to the remote procedure call.
     * @param b parameter (of type int) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int mul_1(int a, int b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public int a;
            public int b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeInt(a);
                xdr.xdrEncodeInt(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrInt result$ = new XdrInt();
        client.call(Calcul.mul_1, Calcul.CALCUL_VERSION_INT, args$, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure div_1.
     * @param a parameter (of type int) to the remote procedure call.
     * @param b parameter (of type int) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int div_1(int a, int b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public int a;
            public int b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeInt(a);
                xdr.xdrEncodeInt(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrInt result$ = new XdrInt();
        client.call(Calcul.div_1, Calcul.CALCUL_VERSION_INT, args$, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure mod_1.
     * @param a parameter (of type int) to the remote procedure call.
     * @param b parameter (of type int) to the remote procedure call.
     * @return Result from remote procedure call (of type int).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public int mod_1(int a, int b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public int a;
            public int b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeInt(a);
                xdr.xdrEncodeInt(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrInt result$ = new XdrInt();
        client.call(Calcul.mod_1, Calcul.CALCUL_VERSION_INT, args$, result$);
        return result$.intValue();
    }

    /**
     * Call remote procedure calcul_null_2.
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public void calcul_null_2()
           throws OncRpcException, IOException {
        XdrVoid args$ = XdrVoid.XDR_VOID;
        XdrVoid result$ = XdrVoid.XDR_VOID;
        client.call(Calcul.calcul_null_2, Calcul.CALCUL_VERSION_FLOAT, args$, result$);
    }

    /**
     * Call remote procedure add_2.
     * @param a parameter (of type float) to the remote procedure call.
     * @param b parameter (of type float) to the remote procedure call.
     * @return Result from remote procedure call (of type float).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public float add_2(float a, float b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public float a;
            public float b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeFloat(a);
                xdr.xdrEncodeFloat(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrFloat result$ = new XdrFloat();
        client.call(Calcul.add_2, Calcul.CALCUL_VERSION_FLOAT, args$, result$);
        return result$.floatValue();
    }

    /**
     * Call remote procedure sub_2.
     * @param a parameter (of type float) to the remote procedure call.
     * @param b parameter (of type float) to the remote procedure call.
     * @return Result from remote procedure call (of type float).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public float sub_2(float a, float b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public float a;
            public float b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeFloat(a);
                xdr.xdrEncodeFloat(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrFloat result$ = new XdrFloat();
        client.call(Calcul.sub_2, Calcul.CALCUL_VERSION_FLOAT, args$, result$);
        return result$.floatValue();
    }

    /**
     * Call remote procedure mul_2.
     * @param a parameter (of type float) to the remote procedure call.
     * @param b parameter (of type float) to the remote procedure call.
     * @return Result from remote procedure call (of type float).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public float mul_2(float a, float b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public float a;
            public float b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeFloat(a);
                xdr.xdrEncodeFloat(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrFloat result$ = new XdrFloat();
        client.call(Calcul.mul_2, Calcul.CALCUL_VERSION_FLOAT, args$, result$);
        return result$.floatValue();
    }

    /**
     * Call remote procedure div_2.
     * @param a parameter (of type float) to the remote procedure call.
     * @param b parameter (of type float) to the remote procedure call.
     * @return Result from remote procedure call (of type float).
     * @throws OncRpcException if an ONC/RPC error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public float div_2(float a, float b)
           throws OncRpcException, IOException {
        class XdrAble$ implements XdrAble {
            public float a;
            public float b;
            public void xdrEncode(XdrEncodingStream xdr)
                throws OncRpcException, IOException {
                xdr.xdrEncodeFloat(a);
                xdr.xdrEncodeFloat(b);
            }
            public void xdrDecode(XdrDecodingStream xdr)
                throws OncRpcException, IOException {
            }
        };
        XdrAble$ args$ = new XdrAble$();
        args$.a = a;
        args$.b = b;
        XdrFloat result$ = new XdrFloat();
        client.call(Calcul.div_2, Calcul.CALCUL_VERSION_FLOAT, args$, result$);
        return result$.floatValue();
    }

}
// End of CalculClient.java
