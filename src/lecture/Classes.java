package lecture;
import myobject.TrivialObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by hubert on 2015.06.08.
 */
public class Classes {
    public static void main(String [] args){
        TrivialObject myObject = new TrivialObject("For learning Java reflection classes");
        Class myclass = myObject.getClass();
        System.out.println("My class name is "+myclass.getCanonicalName()+".");
        if(Modifier.isPublic(myclass.getModifiers()))
            System.out.println("My class is public.");
        System.out.println("It belongs to "+myclass.getPackage().getName()+".");
        System.out.println("Its superclass's name is "+ myclass.getSuperclass().getName()+".");
        Class [] interfaces = myclass.getInterfaces();
        for(Class temp:interfaces)
            System.out.println("It implements "+temp.getName()+".");
        Constructor[] constructors = myclass.getConstructors();
        System.out.println("Constructors:");
        for(Constructor temp: constructors)
            System.out.println(temp.getName());
        Method[] methods = myclass.getMethods();
        System.out.println("Methods:");
        for(Method temp:methods)
            System.out.println(temp.getName());
        Field[] fields = myclass.getFields();
        System.out.println("Fields:");
        for(Field temp:fields)
            System.out.println(temp.getName());
    }
}
