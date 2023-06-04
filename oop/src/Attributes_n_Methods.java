public class Attributes_n_Methods {
    int number;
    String sentence;
    boolean myBoolean;

    // constructor
    public Attributes_n_Methods(){
        number = 600;
        sentence = "This is from an external class";
        myBoolean = false;
    }

    // static method
    static void static_method(){
        System.out.println("This is a static method. It doesn't need an object to be accessed");
    }

    // public method
    public void public_method(){
        System.out.println("This is a public method, it needs an object to be accessed");
    }
}
