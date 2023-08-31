package StudenGradePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentGradeClass {
    private  int numberOfStudents;
    private int numberOfSubjects;
    private  int[][] gradesOfStudent = new int[numberOfStudents][numberOfSubjects];
    private  Scanner scanner = new Scanner(System.in);

    public void collectUserInput(){
        System.out.println("enter number of students");
        numberOfStudents = scanner.nextInt();
        System.out.println("Enter number of subjects");
        numberOfSubjects = scanner.nextInt();
    }
    public int[][] fillGradesOfStudents(){
        int grade;
        for(int index =0; index < numberOfStudents; index++){
            System.out.println("Filling grade for student " + (index + 1));
            for(int inner =0; index < numberOfStudents;){
                System.out.println("Enter grade for subject " + (inner +1));
                grade = scanner.nextInt();
                if(grade > 0 && grade < 100){
                    gradesOfStudent[index][inner] =grade;
                    System.out.println("""
                            Saving >>>>>>>>>>>>
                            Saved Succesfull
                            """);
                    index++;
                }else{
                    System.out.println("invalid grade input");
                }
            }
        }
        return gradesOfStudent;
    }

}
