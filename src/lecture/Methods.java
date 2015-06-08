package lecture;

import myobject.TrivialObject;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/**
 * Created by hubert on 2015.06.08.
 */
public class Methods {
    public static void main(String[] args) {
        TrivialObject myObject = new TrivialObject("Methods");
        int [] numbers = {1,2,3,4,5};
        try {
            Method method = myObject.getClass().getMethod("sum", int[].class);
            Class returnClass = method.getReturnType();
            System.out.println("Return type is "+returnClass+".");
            System.out.println("Sum of 1-5 is "+method.invoke(myObject,numbers)+".");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
