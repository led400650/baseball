public class Logic {

    ComputerNum computerNum = new ComputerNum();
    PlayerNum playerNum = new PlayerNum();
    Data data = new Data();

    public boolean playgame(){
        if (data.getStrike() == 3){
            return false;
        } else {
            data.setStrike(0);
            data.setBall(0);
        }
        return true;
    }
    public void compare(){
        playerNum.generateNum();
        for(int i=0; i<3; i++){
            if(computerNum.getList().get(i) == playerNum.getList().get(i)){
                data.addStrike();
            }
            else {
                for(int j=0; j<3; j++){
                    if(computerNum.getList().get(i) == playerNum.getList().get(j)){
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
            System.out.println("낫싱");
        }
    }



}