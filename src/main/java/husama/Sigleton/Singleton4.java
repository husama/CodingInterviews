package husama.Sigleton;

/**
 * Created by hu on 2017/3/6.
 */
public class Singleton4 {

    public String doSomething() {
        return "doSomething";
    }

    private Singleton4() {}

    public static Singleton4 getInstance() {
        return Nested.instance;
    }

    static class Nested {

        private static final Singleton4 instance = new Singleton4();

    }

}
