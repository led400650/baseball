import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();

        Scanner scanner = new Scanner(System.in);
        int playAgain;

        do {
            while(logic.play()) {
                logic.compare();
                logic.print();
            }
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            logic.init();
            playAgain = scanner.nextInt();
        } while (playAgain == 1);
    }
}
