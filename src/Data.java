public class Data {
    public Integer strike = 0;
    public Integer ball = 0;

    public void addStrike() {
        strike++;
    }
    public void addBall() {
        ball++;
    }

    public Integer getStrike() {
        return strike;
    }

    public void setStrike(Integer strike) {
        this.strike = strike;
    }

    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }
}