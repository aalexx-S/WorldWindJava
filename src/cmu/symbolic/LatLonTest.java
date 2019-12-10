package cmu.symbolic;

import gov.nasa.worldwind.geom.LatLon;

public class LatLonTest
{
    public static void main (String[] args) {
        interpolate(0.1, 0.2, 0.3, 0.4, 0.5, "");
    }

    public static LatLon create (double lat, double lon) {
        return LatLon.fromDegrees(lat, lon);
    }

    public static LatLon interpolate(double lat1, double lon1, double lat2, double lon2, double amount, String way) {
        LatLon a = create(lat1, lon1);
        LatLon b = create(lat2, lon2);
        return LatLon.interpolate(way, amount, a, b);
    }
}
