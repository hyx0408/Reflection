package myobject;

/**
 * Created by hubert on 2015.06.08.
 */
public class TrivialObject extends TrivialSuperClass implements TrivialInterface{
    private String description = null;
    public TrivialObject(String description){this.description = description;}
    public int sum(int [] arrayInt){
        int sum = 0;
        for(int i:arrayInt)
            sum += i;
        return sum;
    }
    public void printDoubledNumber(int num){
        System.out.println("Doubled number is "+ TrivialObject.doubleNumber(num)+".");
    }
    private static int doubleNumber(int num){
        return 2*num;
    }
    private  void printDes(){System.out.println(description);}
    @Override
    public int getID(){return this.ID;}
    @Override
    public void setID(int ID){this.ID = ID;}
}
