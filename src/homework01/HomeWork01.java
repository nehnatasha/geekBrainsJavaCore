package homework01;

public class HomeWork01 {
    public static void main(String[] args) {
        Participants[] competitors = {new Cat(20,25), new Robot(15, 4), new Human(40, 2)};
        ResultActivity[] activities = {new RunRoad(15), new Wall(25)};

        for (Participants participants:competitors){
            for(ResultActivity resultActivity: activities){
                resultActivity.overcome(participants);
            }
        }
    }
}
