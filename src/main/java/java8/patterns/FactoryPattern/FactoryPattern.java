package java8.patterns.FactoryPattern;

import java.util.Optional;

public class FactoryPattern {

    public Optional<Object> getToothPasteCompany(String companyName) {
        if (companyName.equalsIgnoreCase("Colgate")) {
            return Optional.of( new Colgate());
        } else if (companyName.equalsIgnoreCase("DabarRed")) {
            return Optional.of( new DabarRed());
        } else if (companyName.equalsIgnoreCase("CloseUp")) {
            return Optional.of( new CloseUp());
        }
        return Optional.empty();
    }
}
