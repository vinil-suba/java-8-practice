package java8.solid;

/* The class SINGLE AVAILABILITY means
* The class has to do only one task at a time rather than doing multiple tasks.
*
* Let's consider a controller, the controller has to do only routing rather than
* doing business modification.
* */
public class SingleAvailability {
    // The actual class name is Controller.

    // --> Good Code
    //@GetMapping("/url")
    public String getEmployeeDate() {
        return "here is employee data";
    }

    // --> Bad Code
    //@PostMapping("/url")
    public String saveEmployeeDate() {
        //doing some code changes...
        // any modification made
        // then sending save data to service layer
        return "here is employee data";
    }
}
