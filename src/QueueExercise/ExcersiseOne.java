package QueueExercise;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ExcersiseOne {
    public static void main(String[] args) {
        //-> Queue using the array blockingQueue: it has a limit.....using the add it trows exception when the queue is full
        //-> but offer doesnt trow an exception
        Queue<Candidate> candidates= new LinkedList<>();
        candidates.offer(new Candidate("Asiwaju", "APC"));
        candidates.offer(new Candidate("Chim", "OPC"));
        candidates.offer(new Candidate("Sultan Yungidu", "APC"));
        candidates.offer(new Candidate("Rabiu Kwankwaso", "NNPC"));
        candidates.offer(new Candidate("Peter Obi", "LP"));
        candidates.offer(new Candidate("last", "APC"));

        System.out.println(candidates);
        System.out.println("peek ::"+candidates.peek());//it returns he element in front of the queue
        System.out.println("poll ::"+candidates.poll());//It removes the element and returns the element that it is returning
        System.out.println(candidates);

        Comparator<Candidate>comparator = (firstCandidate, secondCandidate)->
                firstCandidate.getParty().compareTo(secondCandidate.getParty());



        Queue<Candidate> candidates1 = new PriorityQueue<>();
        System.out.println();
        System.out.println("=========Priority Queue ================");
        candidates1.offer(new Candidate("Asiwaju", "APC"));
        candidates1.offer(new Candidate("Chim", "OPC"));
        candidates1.offer(new Candidate("Sultan Yungidu", "APC"));
        candidates1.offer(new Candidate("Rabiu Kwankwaso", "NNPC"));
        candidates1.offer(new Candidate("Peter Obi", "LP"));
        candidates1.offer(new Candidate("last", "APC"));
        System.out.println(candidates1);
        System.out.println(candidates1.poll());
        System.out.println(candidates1.poll());
        System.out.println(candidates1.poll());
    }
}
