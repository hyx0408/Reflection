package lecture;

import myobject.TrivialObject;

import java.lang.reflect.Constructor;

/**
 * Created by hubert on 2015.06.08.
 */
public class Constructors {
    public static void main(String[] args) {
        try {
            Constructor myconstructor = new TrivialObject("").getClass().getConstructor(String.class);
            TrivialObject myObject = (TrivialObject) myconstructor.newInstance("Initialled by reflected construction.");
            myObject.printDes();
        } catch (Exception e) {
            System.out.println("Can not constructed by String.");
        } finally {
            System.out.println("Thank you for use constructors by Java reflection.");
        }
        // Constructor[] myconstructor = new TrivialObject("").getClass().getConstructors();

    }
}
