package java8.patterns.behavioral.stratagy;

public interface Strategy {
    // this is part of behavioural design pattern,
    // it allow ours to use the different set of logics for different set of sub classes.
    /* It differ from the state designe pattern,
    state DS is context is used to hold the state it self of the object, but in stategy DS,
     the context will be passed into teh sub classes.
    * */

    public int doOperation(int a, int b);

}
