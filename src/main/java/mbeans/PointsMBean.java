package mbeans;

import general.Point;

import java.util.ArrayList;
import java.util.List;

public interface PointsMBean {

    public void refreshPoints(List<Point> list);

    public boolean validatePoint(String x, String y, String r);

    public int getCountPoints();

    public int getCountPointsOk();


}
