package exo2;

import org.acplt.oncrpc.OncRpcProtocols;

import java.net.InetAddress;

public class CalculClient {
    public static void main(String... args) {
        try {
            CalculClientStub stub = new CalculClientStub(InetAddress.getLocalHost(), OncRpcProtocols.ONCRPC_UDP);
            stub.calcul_null_1();
            stub.calcul_null_2();
            int result = stub.add_1(5, 6);
            System.out.println("5 + 6 = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
