package java8.solid.opencloseModel;
/*
* The actual code meaning of OpenCloseModel is
* The Actual created class is only for extention.
* Not allowed to do any modification here..
*
* Once we created this class means We never add any new code or Never modify anything.
*
* The best way is created an interface and placing the all common code into that.
* then use wherever we want it.
* */
public class OpenCloseModel {
    // The actual name of the class is CalculatorAddition
    Integer value1;
    Integer value2;
    Integer value3;

    public Integer addition(Integer value1, Integer value2, Integer value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {
        OpenCloseModel openCloseModel = new OpenCloseModel();
        System.out.println(openCloseModel.addition(1,2,3) +" -- Sum of all");
    }
}
