public class ToDoListManager {
    public void launch() {
        printWelcomeMessage();
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        LogicManager lm = new LogicManager();

        while (true) {
            String input = br.readLine()
            if (input == "bye") {
                printGoodbyeMessage();
                break;
            }

            String output = lm.parse(input);
            System.out.println(output);
        }

    }

    private void printGoodbyeMessage() {
        System.out.println("It was nice having you! Bye!");
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to the TO-DO List Manager! Refer the README to use me.");
    }
}