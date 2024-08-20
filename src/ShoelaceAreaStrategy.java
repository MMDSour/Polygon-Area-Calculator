import java.util.List;

public class ShoelaceAreaStrategy implements AreaStrategy {
    @Override
    public double calculateArea(Polygon polygon) {
        List<Point> points = polygon.getPoints();
        int n = points.size();
        double area = 0;

        for (int i = 0; i < n; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % n);
            area += p1.getX() * p2.getY() - p1.getY() * p2.getX();
        }

        return Math.abs(area) / 2.0;
    }
}
