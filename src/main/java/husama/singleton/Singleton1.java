package husama.singleton;

/**
 * Created by hu on 2017/3/6.
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return instance;
    }

    public String doSomething() {
        return "doSomething";
    }

}


