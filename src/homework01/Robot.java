package homework01;

public class Robot implements Participants {
    private int length;
    private int height;
    private boolean isCan = true;

    public Robot(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void canJump(int height) {
        if (isCan) {
            if (height > this.height) {
                System.out.println("Я робот и не смогу запрыгнуть на стену и больше не участвую");
                isCan = false;
            } else {
                System.out.println("Я робот и смогу запрыгнуть на эту стену");
                isCan = true;
            }
        }
    }

    @Override
    public void canRun(int length) {
        if (length > this.length) {
            isCan = false;
            System.out.println("Я робот и не смогу столько пробежать и больше не участвую");
        } else {
            System.out.println("Я робот и легко пробегусь по беговой дорожке");
            isCan = true;
        }
    }
}

