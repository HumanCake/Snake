import java.util.LinkedList;

public class Player {
    LinkedList<SnakePart> snakeParts;
    private int score;
    private String Direction;

    private void setDirectionUp() {
        setDirection("up");
    }

    private void setDirectionDown() {
        setDirection("down");
    }

    private void setDirectionLeft() {
        setDirection("left");
    }

    private void setDirectionRight() {
        setDirection("right");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int addScore) {
        setScore(getScore() + addScore);
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }
}
