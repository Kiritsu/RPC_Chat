package exo2;

import org.acplt.oncrpc.OncRpcException;

import java.io.IOException;

public class CalculServer extends CalculServerStub {
    public CalculServer() throws OncRpcException, IOException {
        super();
    }

    @Override
    public void calcul_null_1() {
        System.out.println("Client connecté. calcul_null_1");
    }

    @Override
    public int add_1(int a, int b) {
        System.out.println("Appel de la fonction add_1: [a:" + a + ";b:" + b + "]");
        return a + b;
    }

    @Override
    public int sub_1(int a, int b) {
        System.out.println("Appel de la fonction sub_1: [a:" + a + ";b:" + b + "]");
        return a - b;
    }

    @Override
    public int mul_1(int a, int b) {
        System.out.println("Appel de la fonction mul_1: [a:" + a + ";b:" + b + "]");
        return a * b;
    }

    @Override
    public int div_1(int a, int b) {
        System.out.println("Appel de la fonction div_1: [a:" + a + ";b:" + b + "]");
        return a / b;
    }

    @Override
    public int mod_1(int a, int b) {
        System.out.println("Appel de la fonction mod_1: [a:" + a + ";b:" + b + "]");
        return a % b;
    }

    @Override
    public void calcul_null_2() {
        System.out.println("Client connecté. calcul_null_2");
    }

    @Override
    public float add_2(float a, float b) {
        System.out.println("Appel de la fonction add_2: [a:" + a + ";b:" + b + "]");
        return a + b;
    }

    @Override
    public float sub_2(float a, float b) {
        System.out.println("Appel de la fonction sub_2: [a:" + a + ";b:" + b + "]");
        return a - b;
    }

    @Override
    public float mul_2(float a, float b) {
        System.out.println("Appel de la fonction mul_2: [a:" + a + ";b:" + b + "]");
        return a * b;
    }

    @Override
    public float div_2(float a, float b) {
        System.out.println("Appel de la fonction div_2: [a:" + a + ";b:" + b + "]");
        return a / b;
    }

    public static void main(String... args) {
        try {
            new CalculServer().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
