import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TodoList toDoCollection;
        String choice, taskName;
        int index;
        Boolean play = true;


        toDoCollection = new TodoList();

        while(play) {

            choice = getInput();

            if (choice.equals("list")) {
                toDoCollection.printTask();
            }
            else if (choice.equals("add")) {
                taskName = getTaskName();
                toDoCollection.addTask(new TodoItem(taskName));
            }
            else if (choice.equals("mark")) {
                toDoCollection.printTask();
                index = getIndex();
                toDoCollection.markTaskByIndex(index - 1);
            }
            else if (choice.equals("archive")) {
                toDoCollection.archiveTask();
            }
            else if (choice.equals("q")) {
                play = false;
            }
        }
    }
    public static String getInput() {
        Scanner reader;
        String input;

        reader = new Scanner(System.in);
        System.out.println("list/add/mark/archive");
        input = reader.next();

        return input;
    }
    public static String getTaskName() {
        Scanner reader;
        String input;

        reader = new Scanner(System.in);
        System.out.println("Enter task name: ");
        input = reader.next();

        return input;
    }
    public static Integer getIndex() {
        Scanner reader;
        Integer input;

        reader = new Scanner(System.in);
        System.out.println("Enter task number to mark: ");
        input = reader.nextInt();

        return input;
    }
}