import java.util.ArrayList;
import java.util.Iterator;

public class TodoList {
    private ArrayList<TodoItem> ToDoCollection;

    public TodoList() {
        this.ToDoCollection = new ArrayList<TodoItem>();
    }

    public void addTask(TodoItem task) {
        this.ToDoCollection.add(task);
    }

    public void printTask() {
        int orderNumber;

        orderNumber = 1;
        for (TodoItem task:this.ToDoCollection) {
            System.out.println(orderNumber + " " + task.getTaskName());
            orderNumber ++;
        }
    }
    public void archiveTask() {
        for(Iterator<TodoItem> iterator = this.ToDoCollection.iterator(); iterator.hasNext();) {
            TodoItem task = iterator.next();
            if (task.getIsDone()) {
                iterator.remove();
            }
        }
    }
    public void markTaskByIndex(int index) {
        TodoItem task;

        task = this.ToDoCollection.get(index);
        task.MarkTask();
    }
}