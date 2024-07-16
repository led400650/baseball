public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic();

        while(logic.playgame()) {
            logic.compare();
            logic.print();
        }
    }
}