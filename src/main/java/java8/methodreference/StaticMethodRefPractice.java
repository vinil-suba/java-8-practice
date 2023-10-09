package java8.methodreference;

public class StaticMethodRefPractice {

    public static String saySomething(){
        return "say something static block from StaticMethodRefPractice";
    }

    public static void main(String[] args) {

        Addition staticPractice = StaticMethodRefPractice::saySomething;
        System.out.println(staticPractice.doSomething());
    }
}
