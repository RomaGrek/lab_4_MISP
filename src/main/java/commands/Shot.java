package commands;

import general.HistoryPoint;
import general.Point;

public class Shot implements CommandDo{
    public Shot() {
        CommandPusk.addCommand("shot", this);
    }


    @Override
    public void doing(String x, String y, String r, HistoryPoint historyPoint) {
        Point point = new Point(Double.parseDouble(x), Integer.parseInt(y), Double.parseDouble(r));
        point.setResult(point.chekPenetration(Double.parseDouble(x), Integer.parseInt(y),Double.parseDouble(r)));
        historyPoint.addPoint(point);
        System.out.println("info: " + point.getResult());
    }
}
