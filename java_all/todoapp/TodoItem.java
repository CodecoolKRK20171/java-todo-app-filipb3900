public class TodoItem {
    String taskName;
    Boolean isDone;

    public TodoItem(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }
    public void MarkTask() {
        this.isDone = true;
    }
    public String getTaskName() {
        String taskName;

        if (this.isDone == true) {
            taskName = "[X] " + this.taskName;
        } else {
            taskName = "[ ] " + this.taskName;
        }
        return taskName;
    }
    public Boolean getIsDone() {
        return isDone;
    }
}