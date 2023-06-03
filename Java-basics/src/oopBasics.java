public class oopBasics {
    //first method
    static void nameMethod(String fname, int age){
        System.out.printf("My name is %s and my age is %d", fname, age);
    }

    //Second method
    static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }
    
    public static void main(String[] args) {
        nameMethod("Kifaru", 20);
        System.out.println("\n");
        nameMethod("Mary", 18);
        System.out.println("\n");
        System.out.println(sum(2,3));

        int sum = sum(4,5);
        System.out.println(sum);
    }
}
