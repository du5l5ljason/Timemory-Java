import processing.core.PApplet;
import codeanticode.glgraphics.GLConstants;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class TimemoryApp extends PApplet{

    UnfoldingMap map;
    public static void main(String[] args) {
        String[] params = new String[] { "--present", "--bgcolor=#000000", "--hide-stop", "--exclusive",
                "TimemoryApp" };
        PApplet.main(params);
    }

    @Override
    public void setup()
    {
        size(800, 600, GLConstants.GLGRAPHICS);
        map = new UnfoldingMap(this);
        map.setTweening(false);
        map.zoomAndPanTo(new Location(1.283f, 103.833f), 13);
        map.setPanningRestriction(new Location(1.283f, 103.833f), 30);

        MapUtils.createDefaultEventDispatcher(this, map);
    }

    @Override
    public void draw()
    {
        background(0);
        map.draw();
    }
}