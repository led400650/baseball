import java.io.LineNumberInputStream;
import java.util.Objects;

public class Logic {

    ComputerNum computerNum = new ComputerNum();
    PlayerNum playerNum = new PlayerNum();
    Data data = new Data();

    public boolean play(){
        if(data.getStrike() == 3){
            System.out.println(data.getStrike()+"개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return false;
        }
        data.init();
        return true;
    }

    public void compare(){
        playerNum.generateNum();
        for(int i=0; i<3; i++){
            if(Objects.equals(computerNum.getList().get(i), playerNum.getList().get(i))){
                data.addStrike();
            }else {
                for(int j=0; j<3; j++){
                    if(Objects.equals(computerNum.getList().get(i), playerNum.getList().get(j))){
                        data.addBall();
                    }
                }
            }
        }

    }
    public void print(){
        if(data.getBall() != 0){
            System.out.printf(data.getBall()+"볼 ");
        }
        if(data.getStrike() !=0){
            System.out.printf(data.getStrike()+"스트라이크");
        }
        if(data.getStrike() == 0 && data.getBall() == 0){
            System.out.print("낫싱");
        }
        System.out.println();
    }

    public void init() {
        data.init();
        computerNum.generateNum();
    }
}