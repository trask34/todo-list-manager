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
        return IntStream.range(1, input.split(" ").length - 1)
            .mapToObj(x => input.split(" ")[x])
            .toArray(String[]::new).join(" "); 
    }

    private String processAddCommand(String argument) {
        tdList.add(argument);
        return tdList.formattedOutput();
    }

    private String processDeleteCommand(String argument) {
        tdList.delete(argument.strip().toInt());
        return tdList.formattedOutput();
    }

    private String processMarkCommand(String argument) {
        tdList.mark(argument.strip().toInt());
        return tdList.formattedOutput();
    }

    private String processUnmarkCommand(String argument) {
        tdList.unmark(argument.strip().toInt());
        return tdList.formattedOutput();
    }

    private String processUnknownCommand() {
        return "This command is unknown!";
    }


}


