package commands;

import general.HistoryPoint;
import general.Point;

public class History implements CommandDo{

    public History() {
        CommandPusk.addCommand("history", this);
    }
    @Override
    public void doing(String x, String y, String r, HistoryPoint historyPoint) {
        if (historyPoint.getHistoryList().isEmpty()) {
            System.out.println("Выстрелов еще не было :(");
        }else {
            for (Point point : historyPoint.getHistoryList()) {
                System.out.println("x: " + point.getX() + " y: " + point.getY() + " r: " + point.getR() +
                        " result: " + point.getResult());
            }
        }
    }
}
