package gov.nasa.worldwind.util;

import java.util.logging.Level;

public class Logger {
	public void log (Level l, String m, Exception e) {}
	public void log (Level l, String m) {}
	public void log (Level l, String m, Object o) {}
	public void log (Level l, String m, Object[] o) {}
	public void log (Level l, String m, Throwable t) {}
	public void throwing (String n, String m, Exception e) {}
	public void severe (String n) {}
	public void fine (String n) {}
	public void finest (String n) {}
	public void info (String n) {}
	public void warning (String n) {}
	public void finer (String n) {}
}
