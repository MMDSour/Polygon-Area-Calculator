import java.util.Comparator;
import java.util.List;

public class Polygon {
    private List<Point> points;

    private Polygon(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public static class Builder {
        private List<Point> points;

        public Builder(List<Point> points) {
            this.points = points;
            this.points.sort(Comparator.comparingDouble(Point::getX));
        }

        public Polygon build() {
            return new Polygon(points);
        }
    }
}
