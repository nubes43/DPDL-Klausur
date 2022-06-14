package Logger;

import java.util.logging.Level;

public class Server {

	public Server() {
		execution();
	}

	public void execution() {
		PrivateLogger logger = new PrivateLogger();
		PrivateLogger.setLevel(Level.WARNING);
		PrivateLogger.Warning("Der Server wird gehackt!!!");
		PrivateLogger.setLevel(Level.FINE);
		PrivateLogger.Finest("Es wird nicht angezeigt :)");
		PrivateLogger.setLevel(Level.SEVERE);
		PrivateLogger.Severe("Der Server wurde aus Sicherheitsgrunden heruntergefahren.(SEVER_LOG)");
	}
}
