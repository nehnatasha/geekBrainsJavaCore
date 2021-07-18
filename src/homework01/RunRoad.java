package homework01;

public class RunRoad implements ResultActivity {
    private int length;

    public RunRoad(int length) {
        this.length = length;
    }

    public void overcome (Participants participant){
        participant.canRun(length);
    }
}
