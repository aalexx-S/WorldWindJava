package cmu.symbolic;

import gov.nasa.worldwind.geom.Angle;

public class AngleTest {
	
	public static void from_degrees(double degrees) {
		Angle.fromDegrees(degrees);
	}
	
	public static void from_radians(double radians) {
		Angle.fromRadians(radians);
	}
	
	public static void from_degrees_lat(double degrees_lat) {
		Angle.fromDegreesLatitude(degrees_lat);
	}
	
	public static void from_degrees_lon(double degrees_lon) {
		Angle.fromDegreesLongitude(degrees_lon);
	}
	
	public static void from_radians_lat(double radians_lat) {
		Angle.fromRadiansLatitude(radians_lat);
	}
	
    public static void from_radians_lon(double radians_lon) {
    	Angle.fromRadiansLongitude(radians_lon);
	}
    
    public static void from_xy(double x, double y) {
    	Angle.fromXY(x, y);
    }
    
    public static void from_dms(int degrees, int minutes, int seconds) {
    	Angle.fromDMS(degrees, minutes, seconds);
    }
	
	public static void main(String[] args) {
		// disable GUI
		System.setProperty("java.awt.headless", "true");
		
		from_degrees(1.0);
		from_radians(1.0);
		from_degrees_lat(1.0);
		from_degrees_lon(1.0);
		from_radians_lat(1.0);
		from_radians_lon(1.0);
		from_xy(1,1);
		from_dms(1,1,1);
	}
}
