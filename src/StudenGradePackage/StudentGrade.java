package StudenGradePackage;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of students");
        int numberofStudents = scanner.nextInt();
        System.out.println("enter number of subjects");
        int numberOfSubjects = scanner.nextInt();
        int addScores = 0;
        int score ;
        float [][] studentRecords = new float[numberofStudents][numberOfSubjects + 2];


        for(int index =0; index < numberofStudents; index++){
            System.out.println("Entering score for student " + (index+ 1));
            for(int count = 0; count < numberOfSubjects; ){
                System.out.println("Entering score for subject " + (count+ 1));
                score =scanner.nextInt();
                if (score > 0 && score <=100){
                    addScores += score;
                    studentRecords[index][count] =score;
                    studentRecords[index][numberOfSubjects] += score;
                    count++;
                    System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);
                }else {
                    System.out.println("invalid score input");
                }
            }
            studentRecords[index][numberOfSubjects + 1] = studentRecords[index][numberOfSubjects] / numberOfSubjects;

        }
//        System.out.println(Arrays.deepToString(studentRecords));
        for (int row =0; row < studentRecords.length; row++){
            for(int column =0; column < studentRecords[row].length; column ++){
                System.out.print( studentRecords[row][column] +"\t");
            }
            System.out.println();
        }


    }

}
