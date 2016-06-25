import java.util.HashMap;
import java.util.Map;

/**
 * Created by chaoqiang on 16/6/11.
 */
public class LocalVoteRecorder implements VoteRecorder {
    Map<Candidate, Integer> hVotes = new HashMap<Candidate, Integer>();

    public void record(Candidate candidate) {
        int count = 0;

        if (!hVotes.containsKey(candidate)){
            hVotes.put(candidate, count);
        } else {
            count = hVotes.get(candidate);
        }

        count++;

        hVotes.put(candidate, count);
    }
}
