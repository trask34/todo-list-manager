public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description, boolean isComplete) {
        this.description = description;
        this.isComplete = isComplete;
    }

    public boolean getCompletionStatus() {
        return this.isComplete;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCompletionStatus(boolean s) {
        this.isComplete = s;
    }

    @Override
    public String toString() {
        if (this.isComplete) {
            return " [X] " + this.description;
        } else {
            return " [ ] " + this.description;
        }
    }
}