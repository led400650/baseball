import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerNum {
    private final List<Integer> list = new ArrayList<>();
    private final Random random = new Random();
    public List<Integer> getList() {
        return list;
    }

    public void generateNum() {
        list.clear();
        int tmp;
        while(list.size() < 3){
            tmp = random.nextInt(9)+1;
            if(!list.contains(tmp)){
                list.add(tmp);
            }
        }
        System.out.println("list = " + getList());
    }

    public ComputerNum() {
        generateNum();
    }
}