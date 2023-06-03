// class is a template for objects, and an object is an instance of a class.

public class OopBasics {
    int number = 100;
    String sentence = "My sentence";
    boolean myBoolean = false;

    static void myString(){
        System.out.println("This is a string from an internal method");
    }


    public static void main(String[] args) {

        {
            OopBasics object1 = new OopBasics();
            System.out.println("My number is : " + object1.number);
            System.out.println("My sentence is : " + object1.sentence);
            System.out.println("My boolean is : " + object1.myBoolean);

            OopBasics object2 = new OopBasics();
            object2.number = 200;
            System.out.println("My second object is : " + object2.number);

            OopBasics stringMethod = new OopBasics();
            stringMethod.myString();
            myString();
        }

        {
            Attributes_n_Methods object3 = new Attributes_n_Methods();
            System.out.println("(external Class) Number : " + object3.number);
            System.out.println("(external Class) Sentence : " + object3.sentence);
            System.out.println("(external Class) Boolean : " + object3.myBoolean);
        }
    }
}
