package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private  int feesPaid;
    private int feesTotal;

    // Constructor
    public Student (int id, String name, int grade){
        // note : it is good practice to initialize all the attributes specified above
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0; // note that a parameter is not passed to this variable, like the above (id, name, grade)
        this.feesTotal = 50000; // note, just like feesPaid, no parameter is passed to this variable
    }

    // update grades
    public int updateGrade(int grade){
        this.grade = grade;
        return grade;
    }

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student Name : " + name + " Fees paid so far : $" + feesPaid;
    }
}
