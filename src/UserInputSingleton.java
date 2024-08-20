import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputSingleton {
    private static UserInputSingleton instance;

    private UserInputSingleton() {}

    public static synchronized UserInputSingleton getInstance() {
        if (instance == null) {
            instance = new UserInputSingleton();
        }
        return instance;
    }

    public List<Point> getPointsFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Point> points = new ArrayList<>();

        System.out.println("Enter the number of points:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter x and y coordinates of point " + (i + 1) + ":");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points.add(new Point(x, y));
        }

        return points;
    }
}
