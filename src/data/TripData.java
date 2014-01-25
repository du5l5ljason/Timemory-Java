/*
 * Class: TripData.java
 * Description: data structure to represent a data point.
 * Trip Header info: Trip name, people, tag
 * a vector of check-ins, each of which represents a data sample.
 * init function which parse data files. loadFile(),
 */
package data;
import java.util.HashMap;
import java.util.List;

class TripDataHeader{

    public String tripName;
    public String userName;
    public List<String> tagList;
}

/*
 * Class: TripDataSummary
 * Descrption: Represents all of the summary data inside.
 */
class TripDataSummary{

}

public class TripData{

    private TripDataHeader headInfo;
    private HashMap<Long, TDCheckIn> checkIns;
    private TripDataSummary summary;
    //configuration files. will be implemented in JSON. include data file paths.

    /*
     * Construct
     */

    public boolean init(){
        //load data from input files.
        return true;
    }

}