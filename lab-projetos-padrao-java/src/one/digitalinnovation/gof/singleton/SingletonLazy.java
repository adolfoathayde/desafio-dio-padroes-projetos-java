package one.digitalinnovation.gof.singleton;
/**
 * Singleton "preguiçoso".
 *
 * */
public class SingletonLazy {

    private static SingletonLazy instacia;

    private SingletonLazy (){
        super();
    }

    public static SingletonLazy getInstacia(){
        if (instacia == null ){
            instacia = new SingletonLazy();
        }
        return  instacia;
    }
    }
