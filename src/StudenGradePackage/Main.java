package StudenGradePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of students");
//        int numOfStudent = scanner.nextInt();


    }

    private static   void printHeader(){
        System.out.print("============================================\n STUDENT        ");
        for(int index =0; index < 3; index++){
            System.out.print("SUB"+(index+1)+"      ");
        }
        System.out.print("TOTAL     " + "AVERAGE    "+"POSITION");
        System.out.println("\n===========================================");

    }
    private  static  void fillStudentInfo(){

    }
}

