package src;

public class Student {
    private String studentName;
    private double studentHeight;

    public Student(String name, double height) {
        studentName = name;
        studentHeight = height;
    }
    public void printStudentInfo() {
        System.out.println("Name: "+studentName);
        System.out.println("Height: "+studentHeight+" meters");
    }
}