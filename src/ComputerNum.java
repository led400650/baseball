import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerNum {
    private List<Integer> list = new ArrayList<>();
    private Random random = new Random();
    public List<Integer> getList() {
        return list;
    }

    public ComputerNum() {
        generateNum();
        System.out.println("computerNum.getList() = " + getList());
    }

    public void generateNum() {
        int tmp;
        while(list.size() < 3){
            tmp = random.nextInt(9)+1;
            if(!list.contains(tmp)){
                list.add(tmp);
            }
        }
    }
}