/* 
 * Class: WorldCoords.java
 * Description: describe any location in the world as a tuple of (latitude, longitude, altitude).
 */
package data;
import utils.GeoMathUtils;

public class WorldCoords{ 
	
	final double lat, lon, alt;
	
	/**
	 * Construct the WorldCoords object. (double values)
	 */
	public WorldCoords(double lat, double lon, double alt){
		this.lat = lat;
		this.lon = lon;
		this.alt = alt;
	}
	
	/**
	 * Construct the WorldCoords object (int values)
	 */
	
	public WorldCoords(int lat, int lon, int alt){
		this.lat = lat;
		this.lon = lon;
		this.alt = alt;
	}
	
	/**
	 * Construct the WorldCoords object from another object.
	 */
	public WorldCoords(WorldCoords loc){
		this.lat = loc.lat;
		this.lon = loc.lon;
		this.alt = loc.alt;
	}
	
	/**
	 * Construct the WorldCoords object by default.
	 */
	public WorldCoords(){
		this.lat = 0;
		this.lon = 0;
		this.alt = 0;
	}
	
	/**
	 * Getters
	 */
	/*
	 * Get lat
	 */
	public double Lat(){
		return lat;
	}
	
	/*
	 * Get log
	 */
	public double Lon(){
		return lon;
	}
	
	/*
	 * Get alt
	 */
	public double Alt(){
		return alt;
	}

	/**
	 * Setters
	 */
	/*
	 * Set lat
	 */
	public WorldCoords setLat(double lat){
		return new WorldCoords(lat, lon, alt);
	}
	
	/*
	 * Set log
	 */
	public WorldCoords setLog(double lon){
		return new WorldCoords(lat, lon, alt);
	}
		
	/*
	 * Set alt
	 */
	public WorldCoords setAlt(double alt){
		return new WorldCoords(lat, lon, alt);
	}
		
	/*
	 * Get the distance away from a point.
	 */
	public double distanceInKm(WorldCoords loc){
		return GeoMathUtils.distInKmBetween(this, loc);
	}
	
	public double distanceInMiles(WorldCoords loc){
		return GeoMathUtils.distInMilesBetween(this, loc);
	}
	
}
