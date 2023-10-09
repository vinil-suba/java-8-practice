package bharath;

import java.util.Optional;

class Emp {
    private String firstName;
    private String lastName;

    public Emp() {
    }

    public Emp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Optional<String>  getLastName() {
        return Optional.of(lastName);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}