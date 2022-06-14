package Logger;

import java.io.IOException;
//import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
//import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class PrivateLogger {

	private static FileHandler fileTxt;
	private static SimpleFormatter formatterTxt;
	private static Logger loggeroneone;

	PrivateLogger() {
		loggeroneone = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		loggeroneone.setLevel(Level.ALL);
		// f�r Konsole
		// Handler handler = new ConsoleHandler();
		// handler.setLevel(Level.ALL);
		// loggeroneone.addHandler(handler);
		try {
			fileTxt = new FileHandler("Logging.txt");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// create a TXT formatter
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		loggeroneone.addHandler(fileTxt);
	}

	protected static void Finest(String Text) {
		loggeroneone.finest("First Level Message: " + Text);
	}

	protected static void Finer(String Text) {
		loggeroneone.finer("Second Level Message: " + Text);
	}

	protected static void Fine(String Text) {
		loggeroneone.fine("Third Level Message: " + Text);
	}

	protected static void Config(String Text) {
		loggeroneone.config("Config:" + Text);
	}

	protected static void Info(String Text) {
		loggeroneone.info("Information: " + Text);
	}

	protected static void Warning(String Text) {
		loggeroneone.warning("Warning: " + Text);

	}

	protected static void Severe(String Text) {
		loggeroneone.severe("Important: " + Text);
	}

	protected static void setLevel(Level level) {
		loggeroneone.setLevel(level);
	}

}
