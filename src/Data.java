public class Data {
    private Integer strike = 0;
    private Integer ball = 0;

    public Data() {
        this.strike = 0;
        this.ball = 0;
    }

    public void addStrike() {
        strike++;
    }
    public void addBall() {
        ball++;
    }

    public Integer getStrike() {
        return strike;
    }
    public Integer getBall() {
        return ball;
    }

    public void init() {
        this.ball = 0;
        this.strike = 0;
    }
}