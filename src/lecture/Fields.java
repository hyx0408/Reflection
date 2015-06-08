package lecture;

import myobject.TrivialObject;

import java.lang.reflect.Field;

/**
 * Created by hubert on 2015.06.08.
 */
public class Fields {
    public static void main(String[] args) {
        TrivialObject myObject = new TrivialObject("Hi~~");
        Field [] fields = myObject.getClass().getFields();
        for(Field temp:fields) {
            try {
                Field field = myObject.getClass().getField(temp.getName());
                System.out.println("Field type is " + field.getType().toString() + ".");
                System.out.println("Field value is " + field.get(myObject) + ".");
                field.set(myObject, "alive");
                System.out.println("Now the field is set to " + myObject.word + ".");
            } catch (Exception e) {
                System.out.println("No fields!");
            } finally {
                System.out.println("Get & Set field from reflection.");
            }
        }
        try {
            Field privateField = myObject.getClass().getDeclaredField("description");
            privateField.setAccessible(true);
            try {
                String fieldValue = (String) privateField.get(myObject);
                System.out.println("Description is "+fieldValue+".");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
