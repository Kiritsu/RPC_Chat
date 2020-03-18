package exo1;

import org.acplt.oncrpc.*;
import org.acplt.oncrpc.server.*;
import java.io.IOException;
import java.net.InetAddress;

public class HelloServer extends HelloWorldServerStub{

	public HelloServer () throws OncRpcException, IOException {
		super ();
	}

	public void hello_world_null_1(){
		System.out.println ("Connexion d'un client");
	}

	public Chaine hello_world_1(Chaine arg1){
		System.out.println ("Connexion d'un client");
		System.out.println ("Reception de la chaine : "+arg1.value);
		System.out.println ("Envoi de la chaine : "+"Hello "+arg1.value+" !");
		return new Chaine ("Hello "+arg1.value+" !");
	}

	public static void main (String args []){
		try{
			new HelloServer().run ();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
