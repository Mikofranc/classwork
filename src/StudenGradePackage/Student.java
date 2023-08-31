package StudenGradePackage;

import java.util.Scanner;

public class Student {
    private  int  numberOfSubjects;
    private int[] gradesRecorded =new int[numberOfSubjects];
    private Scanner scanner = new Scanner(System.in);
    private int total;
    private  double average;
    private int studentId ;



    public String getStudentId() {
        return "Student" +studentId;
    }

    private void setStudentId() {
        this.studentId += 1;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int[] subjectsRecord(int numberOfSubjects){
        for(int index =0; index < numberOfSubjects; index++){
            System.out.println("Enter grade for subject" + (index + 1));
            int score = scanner.nextInt();
            if(score > 0 && score <= 100){
                gradesRecorded[index]= score;
                total +=score;
                System.out.println("""
                        Saving >>>>>>>>
                        Saved Sucessfully
                        """);
            }else {
                System.out.println("invalid input");
            }
        }
        average = total / numberOfSubjects;
        return gradesRecorded;
    }

    public  void printHeader(){
        System.out.print("============================================\n STUDENT        ");
        for(int index =0; index < numberOfSubjects; index++){
            System.out.print("SUB"+(index+1)+"      ");
        }
        System.out.print("TOTAL     " + "AVERAGE    "+"POSITION");
        System.out.println("\n===========================================");

    }


}
