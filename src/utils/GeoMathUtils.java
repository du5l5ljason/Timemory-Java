/*
 * Class: GeoMathUtils.java
 * Description: Provide math utils such as calculating distance between two points in Geo coordinate system.
 */

 package utils;
 import data.WorldCoords;

 public final class GeoMathUtils{

    public static final double EARTH_RADIUS_IN_KM = 6367;
    public static final double EARTH_RADIUS_IN_MILES = 3956;

    public static double distInKmBetween(WorldCoords pos1, WorldCoords pos2){

        return distBetween(pos1, pos2, EARTH_RADIUS_IN_KM);
    }

    public static double distInMilesBetween(WorldCoords pos1, WorldCoords pos2){

    return distBetween(pos1, pos2, EARTH_RADIUS_IN_MILES);
    }
    public static double distBetween(WorldCoords pos1, WorldCoords pos2, double scale){

        /*
        double dLat = radians(pos2.Lat() - pos1.Lat());
        double dLon = radians(pos2.Lon() - pos1.Lon());
        */
        return 0;
    }
 }

