package StudenGradePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private  List<Student> studentList = new ArrayList<>();
    private   Scanner scanner = new Scanner(System.in);
    private int noOfSubject;
    private int noOfStudent;

    public int getNoOfSubject() {
        return noOfSubject;
    }

    public void setNoOfSubject(int noOfSubject) {
        this.noOfSubject = noOfSubject;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public void getStudentAmountAndSubject(){
        System.out.println("Enter number of students");
        noOfStudent = scanner.nextInt();
        System.out.println("Enter number of subject");
         noOfSubject = scanner.nextInt();
    }
    public void addStudent(){
        for (int index = 0; index < noOfStudent; index++ ){
            Student student = new Student();
            student.getStudentId();
            student.setNumberOfSubjects(noOfSubject);
            System.out.println("Grade for Student" +(index +1));
            student.subjectsRecord(noOfSubject);
            student.getAverage();
            student.getTotal();
            studentList.add(student);
        }
    }
    public void details(){
        for(Student student : studentList){
            System.out.print(student.getStudentId()+"       ");
            for(int index = 0; index < noOfStudent; index++){
                for (int inner =0; inner < noOfSubject; inner++){
                    System.out.print(student.subjectsRecord(noOfSubject)[inner]+"      " );
                }
            }
            System.out.println("====================================");
        }
    }
    private  void printHeader(){
        System.out.print("============================================\n STUDENT        ");
        for(int index =0; index < noOfSubject; index++){
            System.out.print("SUB"+(index+1)+"      ");
        }
        System.out.print("TOTAL     " + "AVERAGE    "+"POSITION");
        System.out.println("\n===========================================");

    }

    public static void main(String[] args) {
        Students students = new Students();
        students.getStudentAmountAndSubject();
        students.addStudent();
        students.printHeader();
        students.details();
    }
}
