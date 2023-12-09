package practice.core.jvm;

class Superclass {
    static {
        System.out.println("Superclass: static initializer");
    }
    {
        System.out.println("Superclass: instance initializer");
    }
    Superclass () {
        System.out.println("Superclass: constructor");
    }
}
