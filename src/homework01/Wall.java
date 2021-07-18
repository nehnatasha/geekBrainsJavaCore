package homework01;

public class Wall implements ResultActivity{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome (Participants participant){
        participant.canJump(height);
    }
}
