package cmu.symbolic;

import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.render.airspaces.PolyArc;
import gov.nasa.worldwind.geom.Angle;
import java.util.Arrays;
import java.util.List;

public class PolyArcTest {
    
    public static PolyArc create(double lat, double lon, double radius, double leftAzimuthDeg, double rightAzimuthDeg) {
        LatLon location = LatLon.fromDegrees(lat, lon);
        Angle leftAzimuth = Angle.fromDegrees(leftAzimuthDeg);
        Angle rightAzimuth = Angle.fromDegrees(rightAzimuthDeg);
        List<LatLon> locations = Arrays.asList(location);
        
        return new PolyArc(locations, radius, leftAzimuth, rightAzimuth);
    }
    
    public static void setRadius(double lat, double lon, double radius, double leftAzimuthDeg, double rightAzimuthDeg, double newRadius) {
        PolyArc polyarc = create(lat, lon, radius, leftAzimuthDeg, rightAzimuthDeg);
        
        polyarc.setRadius(newRadius);
    }
    
    public static void setAzimuths(double lat, double lon, double radius, double leftAzimuthDeg, double rightAzimuthDeg, double newLeftAzimuth, double newRightAzimuth) {
        PolyArc polyarc = create(lat, lon, radius, leftAzimuthDeg, rightAzimuthDeg);
        Angle leftAzimuth = Angle.fromDegrees(newLeftAzimuth);
        Angle rightAzimuth = Angle.fromDegrees(newRightAzimuth);
        
        polyarc.setAzimuths(leftAzimuth, rightAzimuth);
    }
    
    public static void main(String[] args) {
        // disable GUI
        System.setProperty("java.awt.headless", "true");

        create(1.0, 1.0, 1.0, 1.0, 1.0);
        setRadius(1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        setAzimuths(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
    }

}
