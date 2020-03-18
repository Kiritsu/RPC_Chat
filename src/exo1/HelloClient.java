package exo1; /**
 * Fichier helloWorld.HelloClient.java
 * Auteur  : Claude Duvallet
 * Crée le : 13/11/2004
 * Modifié : 14/11/2004
 * Description : Un client permettant d'envoyer un "Bonjour"
 * à un serveur au moyen d'une socket réseau et attendant la
 * réponse du serveur pour l'afficher.
 */
		import org.acplt.oncrpc.OncRpcProtocols;

		import java.net.*;

public class HelloClient {

	public static void main (String args []){
		try{
			HelloWorldClient h = new HelloWorldClient (InetAddress.getLocalHost(), OncRpcProtocols.ONCRPC_UDP);
			h.hello_world_null_1();
			Chaine result = h.hello_world_1 (new Chaine ("Claude"));
			System.out.println ("Resultat:"+result.value);
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println ("Erreur:"+e);
		}
	}
}
