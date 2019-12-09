package cmu.symbolic;

import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.render.airspaces.Box;
import gov.nasa.worldwind.geom.Angle;

public class BoxTest {
    
    public static Box create(double startLat, double startLon, double endLat, double endLon, double leftWidth, double rightWidth) {
        LatLon startLoc = LatLon.fromDegrees(startLat, startLon);
        LatLon endLoc = LatLon.fromDegrees(endLat, endLon);
        
        return new Box(startLoc, endLoc, leftWidth, rightWidth);
    }
    
    public static void setWidths(double startLat, double startLon, double endLat, double endLon, double leftWidth, double rightWidth, double newLeftWidth, double newRightWidth) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        
        box.setWidths(newLeftWidth, newRightWidth);
    }
    
    public static void setCornerAzimuths(double startLat, double startLon, double endLat, double endLon, double leftWidth, double rightWidth, double newBeginLeftAzimuthDegrees, double newBeginRightAzimuthDegrees,double newEndLeftAzimuthDegrees, double newEndRightAzimuthDegrees) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        Angle beginLeftAzimuth = Angle.fromDegrees(newBeginLeftAzimuthDegrees);
        Angle beginRightAzimuth = Angle.fromDegrees(newBeginLeftAzimuthDegrees);
        Angle endLeftAzimuth = Angle.fromDegrees(newEndLeftAzimuthDegrees);
        Angle endRightAzimuth = Angle.fromDegrees(newEndRightAzimuthDegrees);
        
        box.setCornerAzimuths(beginLeftAzimuth, beginRightAzimuth, endLeftAzimuth, endRightAzimuth);
    }
    
    public static void setEnableCaps(double startLat, double startLon, double endLat, double endLon, 
            double leftWidth, double rightWidth, boolean enableCaps) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        box.setEnableCaps(enableCaps);
    }
    
    public static void setEnableStartCap(double startLat, double startLon, double endLat, double endLon, 
            double leftWidth, double rightWidth, boolean enableCap) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        box.setEnableStartCap(enableCap);
    }
    
    public static void setEnableEndCap(double startLat, double startLon, double endLat, double endLon, 
            double leftWidth, double rightWidth, boolean enableCap) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        box.setEnableEndCap(enableCap);
    }

    public static void setEnableCenterLine(double startLat, double startLon, double endLat, double endLon, 
            double leftWidth, double rightWidth, boolean enableCenterLine) {
        Box box = create(startLat, startLon, endLat, endLon, leftWidth, rightWidth);
        box.setEnableEndCap(enableCenterLine);
    }
    
    public static void main(String[] args) {
        // disable GUI
        System.setProperty("java.awt.headless", "true");
        
        setWidths(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        setCornerAzimuths(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        setEnableCaps(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, true);
        setEnableStartCap(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, true);
        setEnableEndCap(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, true);
        setEnableCenterLine(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, true);
    }
}