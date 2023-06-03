public class Methods {



    //first method
    static void nameMethod(String fname, int age){
        System.out.printf("My name is %s and my age is %d", fname, age);
    }

    //Second method
    static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }


    /*
    * Method Overloading
    *   When two or more methods do the same thing, no need to give different names
    * */

    // instead of this ...
    static int myInt_1(int x_1, int y_1){
        return x_1 + y_1;
    }
    static double myDouble_1(double z_1, double w_1){
        return z_1 + w_1;
    }

    // ... do this (Overloaded methods)
    static int overloaded_sum(int x_2, int y_2){
        return x_2 + y_2;
    }
    static double overloaded_sum(double z_2, double w_2){
        return z_2 + w_2;
    }



    public static void main(String[] args) {
        nameMethod("Kifaru", 20);
        System.out.println("\n");
        nameMethod("Mary", 18);
        System.out.println("\n");
        System.out.println(sum(2,3));

        int sum = sum(4,5);
        System.out.println(sum);


        // Non-overloaded methods
        System.out.println("Non-overloaded int : " + myInt_1(3,4));
        System.out.println("Non-overloaded double : " + myDouble_1(2.4, 4.2));

        // Overloaded method
        System.out.println("Overloaded int : " + overloaded_sum(3,4));
        System.out.println("Overloaded double : " + overloaded_sum(2.4, 4.2));

    }
}
