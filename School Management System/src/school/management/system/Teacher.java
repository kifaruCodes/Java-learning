package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    // Teacher constructor
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int salary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}


