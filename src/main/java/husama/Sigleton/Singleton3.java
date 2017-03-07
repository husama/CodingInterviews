package husama.Sigleton;

/**
 * Created by hu on 2017/3/6.
 */
public class Singleton3 {

    private static final ThreadLocal threadLocalInstance = new ThreadLocal();

    private static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if(threadLocalInstance.get() == null){
            createInstance();
        }

        return instance;
    }

    private static void createInstance() {

        synchronized(Singleton3.class){
            if(instance == null) {
                instance = new Singleton3();
            }
        }

        threadLocalInstance.set(threadLocalInstance);

    }

    public String doSomething() {
        return "doSomething";
    }
}
