import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton singletonObject;

    private Singleton() {
        if(singletonObject !=null){
            throw new RuntimeException("You are trying to break Singelton Pattern");
        }

    }

    public static Singleton getSingletonObject() {
        if (singletonObject == null) {
        singletonObject = new Singleton();
        }

        return singletonObject;
    }

    public Object readResolve(){
        return singletonObject;
    }

}
