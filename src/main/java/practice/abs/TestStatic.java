package practice.abs;

public class TestStatic {
    public static int index;
    public int value;
    static {
        index = 10;
        printStaticData();
//        value = 14;
//        king = 1;
    }
    public TestStatic(int value) {
        this.value = value;
    }

    public static void printStaticData() {
        System.out.println("static value: "+index);
        System.out.println("printing the data");
    }
    public static void printData() {
        int king = 14;
        System.out.println("local variable value: "+king);
        System.out.println("printing the local data");
    }
    public static void main(String[] args) {
        int value = 0;
        System.out.println("----- before object creation");
        System.out.println("static value: "+index);
        TestStatic testStatic = new TestStatic(1);
        System.out.println("----- before object creation");
        System.out.println("instance variable: "+ testStatic.value);
        printData();
    }
}
