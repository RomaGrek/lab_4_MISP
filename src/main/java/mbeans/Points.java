package mbeans;

import commands.Validate;
import general.Point;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Points extends NotificationBroadcasterSupport implements PointsMBean{
    private int countPoints = 0;
    private int countPointsOk = 0;
    private long sequenceNumber = 0;

    @Override
    public void refreshPoints(List<Point> list) {
        countPoints = 0; countPointsOk = 0;
        countPoints = list.size();
        for (Point point: list) {
            if (point.getResult().equals("Есть пробитие")) {
                countPointsOk++;
            }
        }
    }

    @Override
    public boolean validatePoint(String x, String y, String r) {
        if (!(Validate.validateX(x))) {
            Notification notification = new Notification(
                    "PointsNotInArea", this, sequenceNumber++, System.currentTimeMillis(),"Point's X = " + x +" is not in area"
            );
            this.sendNotification(notification);
            return false;
        }
        if (!(Validate.validateY(y))) {
            Notification notification = new Notification(
                    "PointsNotInArea", this, sequenceNumber++, System.currentTimeMillis(),"Point's Y = " + y +" is not in area"
            );
            this.sendNotification(notification);
            return false;
        }
        if (!(Validate.validateR(r))) {
            Notification notification = new Notification(
                    "PointsNotInArea", this, sequenceNumber++, System.currentTimeMillis(),"Point's R = " + r +" is not in area"
            );
            this.sendNotification(notification);
            return false;
        }
        return true;
    }



    @Override
    public int getCountPoints() {
        return this.countPoints;
    }

    @Override
    public int getCountPointsOk() {
        return this.countPointsOk;
    }

}
