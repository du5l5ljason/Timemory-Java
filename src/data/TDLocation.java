/*
 * Class: TDLocations.java
 * Description: Represents a location checkin.
 */
package data;
import java.util.Date;
public class TDLocation extends TDCheckIn{

    private String city;
    private String state;

    public String City() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String State() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public TDLocation(String city, String state){
        super();
        this.city = city;
        this.state = state;
    }

    public TDLocation(WorldCoords coords, Date date, Long timeStamp, String city, String state){
        super(coords, date, timeStamp);
        this.city = city;
        this.state = state;
    }

}