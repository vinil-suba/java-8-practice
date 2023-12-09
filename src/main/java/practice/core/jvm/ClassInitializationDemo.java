package practice.core.jvm;

/**
 * Demonstrates,
 (i) class is NOT loaded on accessing a compile-time constant. Constant is fetched from .class file
 (ii) On accessing a non compile-time constant, class & its super-class are LOADED and INITIALIZED
 (iii) On instantiating the class, it is loaded from memory (loading was done previous step) and
 (a) superclass constructor is run, i.e., CONSTRUCTOR CHAINING
 (b) its instance variables are initialized and instance initializer block is run
 (c) its own constructor is run
 */
public class ClassInitializationDemo {
    {
        System.out.println("\nClassInitializationDemo: instance initializer");
    }
    static {
        System.out.println("\nClassInitializationDemo: static initializer (Initialization Stage)");
    }
    static int getInt() {
        System.out.println("ClassInitializationDemo:getInt()");
        return 3;
    }
    static int getInt5() {
        System.out.println("ClassInitializationDemo:getInt5()");
        return 5;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("\nJVM invoked the main method ... ");
        System.out.println("Subclass.STATIC_FINAL: " + Subclass.STATIC_FINAL);
        //System.out.println("Subclass.stringLiteral: " + Subclass.stringLiteral);
        System.out.println("Invoking Subclass.STATIC_FINAL2  ... ");
        System.out.println("Subclass.STATIC_FINAL2: " + Subclass.STATIC_FINAL2);
        System.out.println("\nInstantiating Subclass ...");
        new Subclass();
        System.out.println("Superinterface.STATIC_FINAL3: " + Superinterface.STATIC_FINAL3);
        //Superinterface.staticMethod();
    }
}

