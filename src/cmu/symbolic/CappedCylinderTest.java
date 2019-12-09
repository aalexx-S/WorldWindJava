package cmu.symbolic;

import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.render.airspaces.*;

public class CappedCylinderTest {
	public static CappedCylinder create(double lat, double lon, double radius){
		LatLon latLon = LatLon.fromDegrees(lat, lon);
		CappedCylinder capped = new CappedCylinder(latLon, radius);;
		
		capped.setHighlightAttributes(new BasicAirspaceAttributes());
		return capped;
	}

	public static void setCenter(double lat, double lon, double ra, double lat2, double lon2) {
		CappedCylinder c = create(lat, lon, ra);
		LatLon l = LatLon.fromDegrees(lat2, lon2);

		c.setCenter(l);
	}

	public static void setRadii(double lat, double lon, double ra, double ia, double oa) {
		CappedCylinder c = create(lat, lon, ra);

		c.setRadii(ia, oa);
	}

	public static void setRadius(double lat, double lon, double ra, double ra2) {
		CappedCylinder c = create(lat, lon, ra);

		c.setRadius(ra2);
	}

	public static void setEnableCaps(double la, double lo, double ra, boolean enabled) {
		CappedCylinder c = create(la, lo, ra);

		c.setEnableCaps(enabled);
	}


	public static void main(String[] argv) {;
		System.setProperty("java.awt.headless", "true");

		setCenter(0.1, 0.2, 0.3, 0.4, 0.5);
		setRadii(0.1, 0.2, 0.3, 0.4, 0.4);
		setRadius(0.1, 0.2, 0.3, 0.4);
		setEnableCaps(0.1, 0.2, 0.3, true);
	}
}
