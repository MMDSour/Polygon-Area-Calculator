public abstract class AreaCalculationTemplate {
    public double calculateArea(Polygon polygon) {
        AreaStrategy strategy = getStrategy();
        return strategy.calculateArea(polygon);
    }

    protected abstract AreaStrategy getStrategy();
}
