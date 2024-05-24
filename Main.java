import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
      Singleton single=Singleton.getSingletonObject();
      Singleton singleTwo=Singleton.getSingletonObject();
      System.out.println(single.hashCode());
      System.out.println(singleTwo.hashCode());

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

     /*   Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
       constructor.setAccessible(true);
       Singleton breakSingleton=constructor.newInstance();
       System.out.println(breakSingleton.hashCode());
       */

       //Serialize and Deserialize.
      ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
      oos.writeObject(single);
      System.out.println("Serialization Done ......");

      ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
      Singleton s2=(Singleton)ois.readObject();
      System.out.println(s2.hashCode());




    }
}
