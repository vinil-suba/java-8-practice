package java8.solid.linkov;

/*
*  Producer(Interface) don't force to implement Consumer(corresponding implementation classes)
* */
public interface InterfaceSegregation {

    // class consider as DBConnector.java

    /*
    * In DB connection interface should be responsible for only establishing the
    * Database connection. It's not responsible for other file system or anything.
    *
    * so this principle says InterfaceSegregation is only responsible for
    * one kind of operation. not to do multiple operations. like below file systems.
    * */
    void openFile();

    void deleteFile();

    void openConnection();

    void closeConnection();

}
