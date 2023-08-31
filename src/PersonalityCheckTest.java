import java.util.Arrays;
import java.util.Scanner;

public class PersonalityCheckTest {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[][] mbit = {
                {"expend energy, enjoy groups", "conserver energy, enjoy one to one"},
                {"Interprete literally", "Look for meaning and possibilities"},
                {"Logic, thinking, questioning", "empathetic, feeling, accommodating"},
                {"organized, orderly", "flexible, adaptable"},
                {"more outgoing, think out loud", "more reserved, think to self"},
                {"practical, realistic, experimental", "immaginative, innovative, theoretical"},
                {"candid, straight foward, frank", "tacktful, encouraging, kind"},
                {"plan, schedule", "unplanned, spontaneous"},
                {"seek many tasks, public activites, interaction with others", "seek private, solitary activites with quiet to concentrate"},
                {"standard, usual, conventional", "different, novel, unique"},
                {"firm, tend to critisize, hold the line", "gentle, tend to appreciate, concilate"},
                {"regulated, structured","easy going, live and let live"},
                {"external, communicative, express yourself", "internal, reticent, keep to yourself"},
                {"focus on here-and-now", "look to the future, global persective, big picture"},
                {"tough-minded, just", "tender-hearted, merciful"},
                {"preparation, plan ahead", "go with the flow, adapt as you go"},
                {"active, initiate", "reflective, delibrate"},
                {"facts, things, what is", "ideas, dreams, what could be, philosphical"},
                {"matter of fact, issue- oriented", "sensitive, people-oriented, compassionate"},
                {"control, govern", "latitude, freedom"}
        };
        System.out.println("enter your name");
        String userName = scanner.next();
        String input ;
        char selectContent1 = 'a';
        char selectContent2 = 'b';
        String[] answerSelection = null;
        int count = 0;
        int counter = 0;
        String[] answerCollector = new String[20];
        String answerOutput = null;
        String[] options = new String[20];

        for (String[] personatity : mbit) {
            counter++;
            System.out.println(counter + ". " + Arrays.toString(personatity));

            for (String pesonalityType : personatity) {
                input = scanner.next();
                if (input.equals(selectContent1)) {
                    answerCollector[count] = personatity[0];
                    options[count] = input;
                } else if (input.equals(selectContent2)) {
                    answerCollector[count] = personatity[1];
                    options[count] = input;
                } else {
                    answerCollector[count] = personatity[1];
                    options[count] = input;
                    System.out.println("wrong input ");
//                    input = scanner.next();
                }
                ++count;
                break;
            }
        }


        System.out.println("==================");
        System.out.println(userName);
        for (int index =0; index < answerCollector.length; index ++){
          answerOutput = answerCollector[index];
          String a = options[index];
            System.out.println((index+ 1) + ".  " + " (" +a+ ")  " +answerOutput);

        }

//        System.out.println(Arrays.toString(options));


    }
}
