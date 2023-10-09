package java8.solid.opencloseModel;

/*
* This is the better approach to achieve OpenClosePrinciple
* */
public class OpenCloseModelImpl extends OpenCloseModel {
    public Integer substraction(Integer value1, Integer value2) {
        return value1 - value2;
    }

    public static void main(String[] args) {
        OpenCloseModelImpl openCloseModelImpl = new OpenCloseModelImpl();
        System.out.println(openCloseModelImpl.addition(1,2,3));
        System.out.println(openCloseModelImpl.substraction(2,1));
    }
}
