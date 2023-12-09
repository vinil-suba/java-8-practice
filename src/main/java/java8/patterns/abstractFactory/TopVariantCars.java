package java8.patterns.abstractFactory;

public class TopVariantCars extends PrimaryAbstraction {

    @Override
    Vehicle getVariant(String variant) {
        if (variant.equalsIgnoreCase("Maruthi"))
            return new MaruthiTopVariant();
        else if (variant.equalsIgnoreCase("Tata"))
            return new TataTopVariant();
        return null;
    }
}
