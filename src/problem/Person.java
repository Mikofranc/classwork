package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private int balance;

    private List<Problem> listOfProblem = new ArrayList<>();

public boolean solveProblem(){
    System.out.println("i need money ");
    int monet = scanner.nextInt();
    this.balance = monet;
    if (balance > 20) return  true;
    return false;
}
    public  void createProblem(){
        Problem problem1 = new Problem();
        problem1.setProbleType(ProbleType.EDUCATION);
        problem1.setProblemName("school fee");
        problem1.setProblemDescription("i need thing for school ");
        problem1.setSolved(solveProblem());
        listOfProblem.add(problem1);
        System.out.println("problem "+problem1.getProbleType()+"  has been   solve with "+balance);
    }
    public void createAnotherProblem(){
    Problem problem2 = new Problem();
    }
    public int sizeOfListOfProblem(){
    return  listOfProblem.size();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.createProblem();
        int z =person1.sizeOfListOfProblem();
        System.out.println("the list pof problem is" + z);
    }

}
