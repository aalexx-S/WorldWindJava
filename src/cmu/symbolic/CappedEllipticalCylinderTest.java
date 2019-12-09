package cmu.symbolic;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.render.airspaces.CappedEllipticalCylinder;
import gov.nasa.worldwind.render.airspaces.BasicAirspaceAttributes;
import gov.nasa.worldwind.geom.Position;

public class CappedEllipticalCylinderTest {
 
    public static CappedEllipticalCylinder create(double lat, double lon, double radius, double radius2, double degree){
        LatLon latLon = LatLon.fromDegrees(lat, lon);
        Angle angle = Angle.fromDegrees(degree);
        CappedEllipticalCylinder capped = new CappedEllipticalCylinder(latLon, radius, radius2, angle);
        
        capped.setHighlightAttributes(new BasicAirspaceAttributes());
        return capped;
    }

    public static void setCenter(double lat, double lon, double radius, double radius2, double degree, double lat2, double lon2) {
        CappedEllipticalCylinder c = create(lat, lon, radius, radius2, degree);
        LatLon l2 = LatLon.fromDegrees(lat2, lon2);
        
        c.setCenter(l2);
    }

    public static void setRadii (double lat, double lon, double radius, double radius2, double degree, double inner, double outer) {
        CappedEllipticalCylinder c = create(lat, lon, radius, radius2, degree);

        c.setRadii(inner, outer);
    }

    public static void setHeading (double lat, double lon, double radius, double radius2, double degree, double degree2) {
        CappedEllipticalCylinder c = create(lat, lon, radius, radius2, degree);
        Angle a2 = Angle.fromDegrees(degree2);
        
        c.setHeading(a2);
    }
    
    public static void move(double lat, double lon, double radius, double radius2, double degree, double newLat, double newLon, double newElev) {
        CappedEllipticalCylinder c = create(lat, lon, radius, radius2, degree);
        Position pos = Position.fromDegrees(newLat, newLon, newElev);
        
        c.move(pos);
    }


    public static void main(String[] argv) {
        System.setProperty("java.awt.headless", "true");

        setCenter(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7);
        setRadii(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7);
        setHeading(0.1, 0.2, 0.3, 0.4, 0.5, 0.6);
        move(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8);
    }
}
