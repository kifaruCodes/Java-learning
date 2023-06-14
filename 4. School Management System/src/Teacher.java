package school.management.system;

public class Teacher {
    // Teacher Attributes
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Teacher constructor
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    //Teacher getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    // Teacher setters
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of teacher : " + getName() + ". Salary is : $" + getSalary() + ". Salary paid so far is : $" + salaryEarned;
    }
}


