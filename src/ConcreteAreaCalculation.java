public class ConcreteAreaCalculation extends AreaCalculationTemplate {
    @Override
    protected AreaStrategy getStrategy() {
        return new ShoelaceAreaStrategy();
    }
}
