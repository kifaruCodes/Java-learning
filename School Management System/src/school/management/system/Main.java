package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create Teachers
        Teacher steve = new Teacher(1, "Steve", 1000);
        Teacher joan = new Teacher(2, "Joan", 1200);
        Teacher farhan = new Teacher(3, "Farhan", 1100);

        // Add teachers to array list
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(steve);
        teacherList.add(joan);
        teacherList.add(farhan);

        // Create students
        Student yusuf = new Student(1, "Yusuf", 2);
        Student marita = new Student(2, "Marita", 3);
        Student phoebe = new Student(3, "Phoebe", 4);

        // Add students to array list
        List<Student> studentList = new ArrayList<>();
        studentList.add(yusuf);
        studentList.add(marita);
        studentList.add(phoebe);

        // Create school
        School mySchool = new School(teacherList, studentList);
        System.out.println("MySchool has earned : $" + mySchool.getTotalMoneyEarned());

        // Add teacher
        Teacher reileigh = new Teacher(4, "Reileigh", 2000);
        mySchool.addTeacher(reileigh);

        // Add student
        Student luffy = new Student(4, "Luffy", 5);
        mySchool.addStudent(luffy);

        phoebe.payFees(23000);

        System.out.println("MySchool has earned : $" + mySchool.getTotalMoneyEarned());

        System.out.println("Salary payment ***********");

        steve.receiveSalary(steve.getSalary());
        System.out.println("School has paid " + steve.getName() + " and now the remaining amount in the school is $" + mySchool.getTotalMoneyEarned());

        joan.receiveSalary(joan.getSalary());
        System.out.println("School has paid " + joan.getName() + " and now the remaining amount in the school is $" + mySchool.getTotalMoneyEarned());

        System.out.println(yusuf);
        System.out.println(steve);
        System.out.println(joan);
        System.out.println(farhan);
        System.out.println(reileigh);
        System.out.println(luffy);
    }
}
