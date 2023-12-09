package java8.patterns.abstractFactory;

public class TataBaseVariant implements Vehicle{

    @Override
    public void printVehicle() {
        System.out.println("Im in side Tata base variant");
    }
}
