package ra;

import java.util.Scanner;

public class Student {
    private String IdStudent;
    private String Name;
    private int Age;
    private float Average ;

    public Student () {}

    public Student(String idStudent, String name, int age, float average) {
        this.IdStudent = idStudent;
        this.Name = name;
        this.Age = age;
        this.Average = average;
    }
    public String getIdStudent() {
        return IdStudent;
    }
    public void setIdStudent(String idStudent) {
        IdStudent = idStudent;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public float getAverage() {
        return Average;
    }
    public void setAverage(float average) {
        Average = average;
    }

    public void inputData(Scanner scanner){
        System.out.print("Enter Student ID: ");
        IdStudent = scanner.next();
        System.out.print("Enter Name: ");
        Name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Age: ");
        Age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Average: ");
        Average = scanner.nextFloat();
    }

    @Override
    public String toString(){
       return("Student ID: " + IdStudent + "\tName : " + Name + "\tAge : " + Age + "\tAverage : " + Average);
    }

}
