import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserInputSingleton userInput = UserInputSingleton.getInstance();
        List<Point> points = userInput.getPointsFromUser();

        Polygon polygon =  new Polygon.Builder(points).build();

        AreaCalculationTemplate areaCalculation = new ConcreteAreaCalculation();
        double area = areaCalculation.calculateArea(polygon);

        System.out.println("The area of the polygon is: " + area);
    }
}
