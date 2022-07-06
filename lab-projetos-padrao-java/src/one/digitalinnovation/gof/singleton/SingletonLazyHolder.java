package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Holder".
 *
 * */
public class SingletonLazyHolder {

    private static class InstaceHolder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstaceHolder.instacia;
    }


}
