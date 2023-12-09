package java8.patterns.abstractFactory;

public class SecondaryAbstraction {
    public PrimaryAbstraction getCar(String variant) {
    if (variant.equalsIgnoreCase("Top")) {
        return new TopVariantCars();
    } else if (variant.equalsIgnoreCase("Base")) {
        return new BaseVariantCars();
    }
    return null;
    }
}
