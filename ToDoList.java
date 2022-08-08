import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> l = new ArrayList<Task>();

    public void add(String argument) {
        Task t = new Task(argument, false);
        l.add(t);
    }

    public void mark(int n) {
        if (n < 0 || n > l.size()) {
            return;
        }

        l.get(n - 1).setCompletionStatus(true);
    }

    public void unmark(int n) {
        if (n < 0 || n > l.size()) {
            return;
        }

        l.get(n - 1).setCompletionStatus(false);
    }

    public void delete(int n) {
        if (n < 0 || n > l.size()) {
            return;
        }

        l.remove(n - 1);
    }

    public String formattedOutput() {
        String output = "Here is the list : \n";

        for (int i = 0; i < l.size(); ++i) {
            int oneBased = i + 1;
            output += oneBased + "." + l.get(i).toString() + "\n";
        }

        return output;
    }
}