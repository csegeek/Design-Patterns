package singelton;
import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton singletonObject;

    private Singleton() {
        //used to stop breaking singeltopn using Refection.
        if(singletonObject !=null){
            throw new RuntimeException("You are trying to break Singelton Pattern");
        }
    }
   
    public static Singleton getSingletonObject() {
        /*
         * To make the singelton pattern Thread safe use synchronized block if 
         * singelton object is null.
         */
        
        if (singletonObject == null) {
            synchronized(Singleton.class){
                if(singletonObject==null) singletonObject = new Singleton();
            }
        }

        return singletonObject;
    }

    public Object readResolve(){
        return singletonObject;
    }

     
      /*Ways to break singelton pattern
       *1.Using Reflection API to break Singelton Pattern.
       * Solution:
       * i.throw Exception from constructor.
       * ii.Use Enum.
       * 
       * 2.Serizlize and Deserialize.
       * Solution:implement readResolve Method.
       * 
       * 3.Clone object
       * Solution:Override clone method and return same method.
       * 
       */


}
