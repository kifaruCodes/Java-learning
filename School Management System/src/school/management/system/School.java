package school.management.system;

import java.util.List;

public class School {

    // Class attributes
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    // Class constructor
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // teacher getter
    public List<Teacher> getTeacher() {
        return teachers;
    }

    // teacher setter
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // student getter
    public List<Student> getStudent() {
        return students;
    }

    // student setter
    public void addStudent(Student student) {
        students.add(student);
    }

    // money earned getter
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // money earned setter
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    // money spent getter
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // money spent setter
    public static void updateTotalMoneySpent(int  MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
