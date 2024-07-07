class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;
 
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton()
    {
        System.out.println("Created new instance");
    }
 
    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
public class SingleTonExample{
    public static void main(String[] ar){
        //Singleton s=new Singleton();
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
    }
}