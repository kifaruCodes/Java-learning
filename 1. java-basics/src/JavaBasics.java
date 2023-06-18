import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {

        /*
            Output
        */
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

        {
            // Scanner class
            // Create Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get string input
            System.out.println("Please enter your name: ");
            String scanner_name = scanner.nextLine();
            System.out.println("Hello there " + scanner_name);

            // get integer input
            System.out.println("How about your age?");
            int scanner_age = scanner.nextInt();
            scanner.nextLine();



            System.out.println("Thank you for the information. Your name is "
                    + scanner_name + ". your age is " + scanner_age);
            scanner.nextLine();

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

        /*
            Operators
        * */
        {
            System.out.println("\n");
            System.out.println("Operators Output Start");

            /*
            *    Arithmetic operators
                    +	Addition	Adds together two values	x + y
                    -	Subtraction	Subtracts one value from another	x - y
                    *	Multiplication	Multiplies two values	x * y
                    /	Division	Divides one value by another	x / y
                    %	Modulus	Returns the division remainder	x % y
                    ++	Increment	Increases the value of a variable by 1	++x
                    --	Decrement	Decreases the value of a variable by 1	--x

                Assignment operators
                    =	x = 5	x = 5
                    +=	x += 3	x = x + 3
                    -=	x -= 3	x = x - 3
                    *=	x *= 3	x = x * 3
                    /=	x /= 3	x = x / 3
                    %=	x %= 3	x = x % 3
                    &=	x &= 3	x = x & 3
                    |=	x |= 3	x = x | 3
                    ^=	x ^= 3	x = x ^ 3
                    >>=	x >>= 3	x = x >> 3
                    <<=	x <<= 3	x = x << 3

                Comparison operators
                    ==	Equal to	x == y
                    !=	Not equal	x != y
                    >	Greater than	x > y
                    <	Less than	x < y
                    >=	Greater than or equal to	x >= y
                    <=	Less than or equal to	x <= y

                Logical operators
                    && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
                    || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
                    !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

             */

            // Strings
            // Strings in Java are actually objects, because they contain methods
            // These methods perform certain operations on the string
            // Example of methods

            String method_string = "Some random string";
            String method_string_2 = "Another String";
            System.out.println("The length of the string is : " + method_string.length());
            System.out.println("The Uppercase of the string is : " + method_string.toUpperCase());
            System.out.println("The lowercase of the string is : " + method_string.toLowerCase());
            System.out.println("The index of the string is : " + method_string.indexOf("string"));
            System.out.println("Concatenation : " + method_string.concat(method_string_2));

            // If a string is added/concatenated to an integer, the result is a string
            int a_c_no = 23;
            String a_c_str = "String";
            String a_c_fin = a_c_no + a_c_str;
            System.out.println(a_c_fin);

            /*
             * Escape sequence
             * \r - return
             * \n - new line
             * \t - tab
             * \b - back space
             * \f - form feed
             *
             * */

            // Math Class

            int x = 23;
            int y = 120;
            System.out.println("Max no is : " + Math.max(x, y));
            System.out.println("Random no is : " + Math.random());
            int randomNo = (int) (Math.random() * 101);
            System.out.println("Another random no : " + randomNo);

            System.out.println("Operators Output End");
        }

        /*
            Conditionals
        * */
        {
            // If conditionals
            int x = 3, y = 5;
            if (x > y) {
                System.out.println("(If) x is bigger than y");
            } else {
                System.out.println("(if) y is bigger than x");
            }

            // Ternary operator ie short hand if-else
            String result = (x > y) ? "(ternary) x is bigger than y" : "(ternary) y is bigger than x";
            System.out.println(result);

            // switch conditional
            int number = (int) (Math.random() * 40);
            System.out.println("Number : " + number);
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("none");
                    break;
            }

            /*
             * Difference btn "break" and "continue"
             *
             *   break:
             *       Exits the loop
             *
             *   continue:
             *       Skips a loop
             *
             * */



        /*
            Loops & Arrays
        * */
            {
                // while loop
                int _x = 0;
                while (_x < 5) {
                    System.out.println("(while)" + _x);
                    _x++;
                }

                // do while
                int _y = 0;
                do {
                    System.out.println("(do-whilw)" + _y);
                    _y++;
                } while (_y < 5);

                // for loop
                for (int _z = 0 ; _z < 5 ; _z = _z + 2 ){
                    System.out.println("(for) : " + _z);
                }

                // for-each loop
                int[] numbers = {1,2,3,4,5};
                for (int _number : numbers){
                    System.out.println("(for-each):" + _number);
                }

                // Arrays
                String[] continents = {"Africa", "Asia", "Europe", "N.America", "S.America"};
                for (String continent : continents) {
                    System.out.println("Continent : " + continent);
                }
                // get a certain element in the array
                System.out.println(continents[0]);
                // get the length of an array
                System.out.println(continents.length);

                // multidimentional Arrays
                String[][] excel_col = {{"A1", "A2", "A3"}, {"B1", "B2", "B3"}, {"C1", "C2", "C3"}};
                for (int i = 0 ; i < excel_col.length ; ++i){
                    for (int j = 0 ; j < excel_col.length ; ++j){
                        System.out.println(excel_col[i][j]);
                    }
                }
            }
        
        }
    }
}


