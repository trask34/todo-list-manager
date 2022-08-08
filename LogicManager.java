import java.util.stream.IntStream;

public class LogicManager {
    private ToDoList tdList = new ToDoList();

    public String parse(String input) {
        String command = parseCommand(input);
        String argument = parseArgument(input);

        switch (command) {
            case "add" :
                return processAddCommand(argument);
            case "delete" : 
                return processDeleteCommand(argument);
            case "mark" : 
                return processMarkCommand(argument);
            case "unmark" : 
                return processUnmarkCommand(argument);
            default : 
                return processUnknownCommand();
        }
    }

    private String parseCommand(String input) {
        return input.split(" ")[0];
    }

    private String parseArgument(String input) {
        String arg = "";

        for (int i = 1; i < input.split(" ").length; ++i) {
            arg += input.split(" ")[i] + " ";
        }
        
        return arg;
    }

    private String processAddCommand(String argument) {
        tdList.add(argument);
        return tdList.formattedOutput();
    }

    private String processDeleteCommand(String argument) {
        tdList.delete(Integer.parseInt(argument.strip()));
        return tdList.formattedOutput();
    }

    private String processMarkCommand(String argument) {
        tdList.mark(Integer.parseInt(argument.strip()));
        return tdList.formattedOutput();
    }

    private String processUnmarkCommand(String argument) {
        tdList.unmark(Integer.parseInt(argument.strip()));
        return tdList.formattedOutput();
    }

    private String processUnknownCommand() {
        return "This command is unknown!";
    }


}


