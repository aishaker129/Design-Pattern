# Design Pattern Implementations in Java

This repository contains a collection of common design patterns implemented in Java. Each pattern is organized into its own directory and serves as a practical example for learning and understanding design patterns.

## Implemented Design Patterns

This project includes implementations of the following design patterns:

### Creational Patterns
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Factory Method**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- **Prototype**: Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype.
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.

### Structural Patterns
- **Adapter**: Allows the interface of an existing class to be used as another interface.
- **Decorator**: Attaches additional responsibilities to an object dynamically.
- **Facade**: Provides a unified interface to a set of interfaces in a subsystem.
- **Flyweight**: Uses sharing to support large numbers of fine-grained objects efficiently.
- **Proxy**: Provides a surrogate or placeholder for another object to control access to it.

### Behavioral Patterns
- **Chain of Responsibility**: Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
- **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **State**: Allows an object to alter its behavior when its internal state changes.
- **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Template Method**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
- **Visitor**: Represents an operation to be performed on the elements of an object structure.

## How to Use

To explore a specific design pattern:

1.  Navigate to the directory of the design pattern you are interested in. For example:
    ```bash
    cd Design_Patterns/Adapter
    ```
2.  Compile the Java source files:
    ```bash
    javac *.java
    ```
    If the pattern's files are in a subdirectory, you might need to adjust the command, for example:
    ```bash
    javac example/*.java
    ```
3.  Run the main demo file. The name of the main class may vary.
    ```bash
    java <MainClassName> 
    ```
    (e.g., `java AdapterPattern`, `java Main`, `java DecoratorPattern`, etc.)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
