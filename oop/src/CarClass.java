public class CarClass {
    int _year;
    int _engineCC;
    String _make;
    String _color;

    public CarClass(int year, int engineCC, String make, String color){
        _year = year;
        _engineCC = engineCC;
        _make = make;
        _color = color;
    }

    public void carStatement(){
        System.out.println("This is a good car made in " + _year);
    }

    public void plateNo(int plateNo){
        System.out.println("The plate no for car : " + _make + " is : " + plateNo);
    }
}
