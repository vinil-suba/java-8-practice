package practice.core.jvm;

interface Superinterface {
    int STATIC_FINAL3 = new ClassInitializationDemo().getInt();
    int STATIC_FINAL5 = new ClassInitializationDemo().getInt5();
    static void staticMethod() {
        System.out.println("Superinterface: staticMethod");
    }
}
