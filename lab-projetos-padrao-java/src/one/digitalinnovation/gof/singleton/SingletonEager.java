package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apressado".
 *
 * */
public class SingletonEager {

    private static SingletonEager instacia = new SingletonEager();

    private SingletonEager (){
        super();
    }

    public static SingletonEager getInstacia(){
        return  instacia;
    }
}
