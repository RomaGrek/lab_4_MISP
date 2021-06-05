import commands.*;
import general.HistoryPoint;
import mbeans.Points;
import mbeans.Square;

import javax.management.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) throws IOException, MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("Roman.Machine:type=Points");
//        ObjectName name2 = new ObjectName("Roman.Machine:type=Square");
        Points points = new Points();
        mbs.registerMBean(points,name);
//        Square square = new Square();
//        mbs.registerMBean(square,name2);

        HistoryPoint historyPoint = new HistoryPoint();
        Exit exit = new Exit();
        Help help = new Help();
        History history = new History();
        Shot shot = new Shot();
        while (true) {
            System.out.println("Введите вашу команду, используйте \"help\" что бы получить список команд");
            System.out.print(">>>");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String pop = bufferedReader.readLine();
            if (!pop.isEmpty()) {
                CommandPusk.doing(pop, historyPoint, points);
                System.out.println();
            }
        }
    }
}