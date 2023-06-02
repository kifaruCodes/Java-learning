import java.sql.SQLOutput;

public class JavaBasics {
    public static void main(String[] args) {

        /*
            Output
        */
            //Print single lines
        {
            System.out.print("Hello there");        // prints out the string on a line w/o linebreak
            System.out.print("\n");
            System.out.println("This is my first Java code"); // prints out the string w linebreak

            /*
                printf
                    used to format text without having to concatenate strings
                    %s = String
                    %S = String in UPPERCASE
                    %n = newline/linebreak
                    %d = integer/long/short/byte
                    %f = float/double
                    %b = boolean

                    reference : https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output#:~:text=The%20Java%20printf%20function%20helps,that%20might%20trigger%20output%20errors
            * */
            String name = "Kifaru";
            String language = "Java";
            System.out.printf("My name is %s and I am learning %S. %n", name, language);
        }


        /*
            Variables & Data Types

            Data Types

                There are two types:
                - Primitive : int, char, bool
                - nonprimitive : String, Array, Classes
        * */
        {
            System.out.println("\n");
            System.out.println("Variables Output Start");

            int x = 5; // This is a string
            byte w = 2; // This is a byte
            short y = 100; // This is a short
            long z = 10000000; // This is a long

            float a = 12.34f; // This is a float
            double b = 12345.6789d; // This is a double

            boolean bool = true; // This is a boolean

            char character = 'a'; // This is a character
            String string = "A string"; // This is a string

            // To declare a constant, use the 'final' statement
            final int const_x = 123;
            final String const_string = "Constant string"; // This is a constant string

            // Type casting : assigning the value of one type to another
                // Wide casting : Small to wide size type
                int cast_int_1 = 32;
                double cast_double_1 = cast_int_1;
                
                System.out.println(cast_int_1);
                System.out.println(cast_double_1);

                // Narrow casting : Wide to small
                double cast_double = 32.32d;
                int cast_int = (int) cast_double;

                System.out.println(cast_double);
                System.out.println(cast_int);

            //System.out.println("\n");
            System.out.println("Variables Output End");
        }

    }
}


