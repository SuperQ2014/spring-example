/**
 * Created by chaoqiang on 16/6/11.
 */
public class VotingBooth {

    VoteRecorder recorder = null;

    public void setVoteRecorder(VoteRecorder recorder) {
        this.recorder = recorder;
    }

    public void vote(Candidate candidate) {
        recorder.record(candidate);
    }
}
