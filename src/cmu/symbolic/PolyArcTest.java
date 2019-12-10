package cmu.symbolic;

import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.render.airspaces.PolyArc;
import gov.nasa.worldwind.geom.Angle;

import java.util.ArrayList;
import java.util.List;

public class PolyArcTest {
    
    public static PolyArc create(int locCount, double baseLat, double baseLon, double latLonDelta, double radius, double leftAzimuthDeg, double rightAzimuthDeg) {      
        Angle leftAzimuth = Angle.fromDegrees(leftAzimuthDeg);
        Angle rightAzimuth = Angle.fromDegrees(rightAzimuthDeg);
        List<LatLon> locations = createLocationsList(locCount, baseLat, baseLon, latLonDelta);
        
        return new PolyArc(locations, radius, leftAzimuth, rightAzimuth);
    }
    
    public static List<LatLon> createLocationsList(int len, double baseLat, double baseLon, double latLonDelta) {
        len = Math.max(len, 0);
        List<LatLon> locations = new ArrayList<LatLon>(len);
 
        for (int i = 0; i < len; i++) {
            double lat = baseLat + (i * latLonDelta);
            double lon = baseLon + (i * latLonDelta);

            locations.add(LatLon.fromDegrees(lat, lon));
        }
        
        return locations;
    }
    
    public static void setRadius(int locCount, double baseLat, double baseLon, double latLonDelta, double radius, double leftAzimuthDeg, double rightAzimuthDeg, double newRadius) {
        PolyArc polyarc = create(locCount, baseLat, baseLon, latLonDelta, radius, leftAzimuthDeg, rightAzimuthDeg);
        
        polyarc.setRadius(newRadius);
    }
    
    public static void setAzimuths(int locCount, double baseLat, double baseLon, double latLonDelta, double radius, double leftAzimuthDeg, double rightAzimuthDeg, double newLeftAzimuth, double newRightAzimuth) {
        PolyArc polyarc = create(locCount, baseLat, baseLon, latLonDelta, radius, leftAzimuthDeg, rightAzimuthDeg);
        Angle leftAzimuth = Angle.fromDegrees(newLeftAzimuth);
        Angle rightAzimuth = Angle.fromDegrees(newRightAzimuth);
        
        polyarc.setAzimuths(leftAzimuth, rightAzimuth);
    }
    
    public static void move(int locCount, double baseLat, double baseLon, double latLonDelta, double radius, double leftAzimuthDeg, double rightAzimuthDeg, double newLat, double newLon, double newElev) {
        PolyArc polyArc = create(locCount, baseLat, baseLon, latLonDelta, radius, leftAzimuthDeg, rightAzimuthDeg);
        Position position = Position.fromDegrees(newLat, newLon, newElev);
        
        polyArc.move(position);
    }
    
    public static void main(String[] args) {
        // disable GUI
        System.setProperty("java.awt.headless", "true");
        
        create(1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7);
        setRadius(1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8);
        setAzimuths(1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9);
        move(1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 0.10);
    }

}
