# Polygon Area Calculation Project

This Java project calculates the area of a polygon defined by a list of 2D points. The application leverages several design patterns to promote clean code, flexibility, and maintainability.

## Project Structure

- **Point Class**: Represents a 2D point with `x` and `y` coordinates.
- **Polygon Class**: Holds a list of `Point` objects and is built using the Builder pattern.
- **SingletonScanner Class**: Provides a singleton instance of `Scanner` to manage user input across the application.
- **AreaStrategy Interface**: Defines a strategy for calculating the area of a polygon.
- **ShoelaceAreaStrategy Class**: Implements `AreaStrategy` using the Shoelace formula.
- **AreaCalculationTemplate Class**: An abstract class that provides a template for area calculation.
- **ConcreteAreaCalculation Class**: Extends `AreaCalculationTemplate` to use the `ShoelaceAreaStrategy`.
- **Main Class**: Handles user input, constructs the polygon, and calculates the area.

## Design Patterns Used

### Builder Pattern (`Polygon.Builder`)
- **Purpose**: Simplifies the creation of complex `Polygon` objects in a readable and maintainable way.
- **Benefit**: Provides a flexible and fluid way to construct objects, especially when they have multiple attributes.

### Singleton Pattern (`SingletonScanner`)
- **Purpose**: Ensures a single `Scanner` instance for consistent user input handling.
- **Benefit**: Prevents conflicts and resource management issues with multiple `Scanner` instances.

### Strategy Pattern (`AreaStrategy` and `ShoelaceAreaStrategy`)
- **Purpose**: Encapsulates the area calculation algorithm, allowing easy swapping of different strategies if needed.
- **Benefit**: Promotes flexibility and enhances code modularity by separating the algorithm from the main logic.

### Template Method Pattern (`AreaCalculationTemplate`)
- **Purpose**: Provides a skeletal algorithm structure for calculating the area, with specific steps defined in subclasses.
- **Benefit**: Allows easy customization of the calculation process while maintaining the overall structure.

## How to Use

1. Run the `Main` class.
2. Enter the number of points and their coordinates when prompted.
3. The program calculates and outputs the area of the polygon.

This project showcases the effective use of design patterns to create a modular, flexible, and easily extensible application.
