// class is a template for objects, and an object is an instance of a class.

public class Main {
    int number;
    String sentence;
    boolean myBoolean;

    // constructor
    public Main(){
        number = 100;
        sentence = "My sentence";
        myBoolean = true;
    }

    static void myString(){
        System.out.println("This is a static string from an internal method");
    }

    public void myOtherString(){
        System.out.println("This is a public string from an internal method");
    }


    public static void main(String[] args) {

        // Internal attributes and methods
        {
            Main object1 = new Main();
            System.out.println("My number is : " + object1.number);
            System.out.println("My sentence is : " + object1.sentence);
            System.out.println("My boolean is : " + object1.myBoolean);

            Main object2 = new Main();
            object2.number = 200;
            System.out.println("My second object is : " + object2.number);

            myString();
        }

        // external attributes and methods
        {
            Attributes_n_Methods object3 = new Attributes_n_Methods();
            System.out.println("(external Class) Number : " + object3.number);
            System.out.println("(external Class) Sentence : " + object3.sentence);
            System.out.println("(external Class) Boolean : " + object3.myBoolean);
        }

        // public vs static attributes and methods
        {
            // a static method can be accessed without creating an object
            // a public method can only be accessed by creating an object

            // from an internal class
            myString();

            Main static_method = new Main();
            static_method.myOtherString();

            // from an external class
            Attributes_n_Methods.static_method();

            Attributes_n_Methods object_public = new Attributes_n_Methods();
            object_public.public_method();
        }

        // Constructor test with a car structure
        {
            CarClass car1 = new CarClass(2020, 3000, "Honda CRV", "black");
            System.out.println("The color of the car is : " + car1._color);
            car1.carStatement();
            car1.plateNo(1232);
        }
    }
}

