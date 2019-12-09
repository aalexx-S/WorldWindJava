package cmu.symbolic;

import gov.nasa.worldwind.geom.Angle;

public class AngleTest {
	
	public static void fromDegrees(double degrees) {
		Angle.fromDegrees(degrees);
	}
	
	public static void fromRadians(double radians) {
		Angle.fromRadians(radians);
	}
	
	public static void fromDegreesLat(double degrees_lat) {
		Angle.fromDegreesLatitude(degrees_lat);
	}
	
	public static void fromDegreesLon(double degrees_lon) {
		Angle.fromDegreesLongitude(degrees_lon);
	}
	
	public static void fromRadiansLat(double radians_lat) {
		Angle.fromRadiansLatitude(radians_lat);
	}
	
    public static void fromRadiansLon(double radians_lon) {
    	Angle.fromRadiansLongitude(radians_lon);
	}
    
    public static void fromXY(double x, double y) {
    	Angle.fromXY(x, y);
    }
    
    public static void fromDMS(int degrees, int minutes, int seconds) {
    	Angle.fromDMS(degrees, minutes, seconds);
    }
	
	public static void main(String[] args) {
		// disable GUI
		System.setProperty("java.awt.headless", "true");
		
		fromDegrees(1.0);
		fromRadians(1.0);
		fromDegreesLat(1.0);
		fromDegreesLon(1.0);
		fromRadiansLat(1.0);
		fromRadiansLon(1.0);
		fromXY(1,1);
		fromDMS(1,1,1);
	}
}
