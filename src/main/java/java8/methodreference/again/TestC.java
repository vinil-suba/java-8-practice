package java8.methodreference.again;

public class TestC implements TestA, TestB{

    public static void main(String[] args) {
        TestC testC = new TestC();
        testC.m1();
        TestA testA =  new TestC();
        testA.m1();
        TestB testB = new TestC();
        testB.m1();
    }

    @Override
    public void m1() {
        System.out.println("main");
        TestA.super.m1();
        TestB.super.m1();
    }
}
