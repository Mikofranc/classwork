package QueueExercise;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Candidate implements Comparable<Candidate>{
    private String name;
    private String party;

    @Override
    public int compareTo(Candidate candidate) {
        return 0;
    }
}
