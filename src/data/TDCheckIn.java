/*
 * Class: TDCheckin.java
 * Descriptions: Represents a data sample during the trip.
 */
package data;
import java.util.Date;
public abstract class TDCheckIn{

    protected WorldCoords location;
    protected Date date;
    protected Long timeStamp;

    protected TDCheckIn(WorldCoords location, Date date, Long timeStamp)
    {
        this.location = location;
        this.date = date;
        this.timeStamp = timeStamp;
    }

    protected TDCheckIn()
    {
    }
}
