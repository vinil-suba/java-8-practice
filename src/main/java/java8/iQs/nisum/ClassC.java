package java8.iQs.nisum;

public class ClassC implements InterfaceA, InterfaceB {

    /*@Override
    public void method1() {
        InterfaceA.super.method1();
    }*/

    public static void main(String[] args) {

        ClassC classC = new ClassC();
        classC.method1();
    }

    @Override
    public void method1() {

        System.out.println(" main class");
    }
}
