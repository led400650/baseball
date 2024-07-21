import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PlayerNum {

    private final List<Integer> list = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void generateNum() {
        list.clear();
        System.out.print("숫자를 입력해주세요 : ");
        Integer playerNum = scanner.nextInt();
        list.add(playerNum / 100);
        list.add((playerNum / 10) % 10);
        list.add(playerNum % 10);
    }

    public List<Integer> getList() {
        return list;
    }
}