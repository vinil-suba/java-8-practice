package java8.patterns.FactoryPattern;

@FunctionalInterface
public interface FactoryToothPast {

    /*
    Based on some inputs the main class has to create input related objects
    lets creates an interface OS (Operating system)
    I have an implementation for windows and Mac
    If i give window as a input, windows related commands need to be execute...
    If i give mac as a input, Mac related commands need to be executed.

    SO we are giving a flexibility to user to give a chance create related objects.
    * */
    void printToothPast();
}
