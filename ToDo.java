import java.util.Scanner;
import java.util.*;

public class ToDo {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    List<String> listTodo = new ArrayList<>();
    final int MAX = 5;

    String[] list = new String[MAX];
    int choice = 0;

    while (choice != 4) {

        System.out.println();
        System.out.println("1 to add to list.");
        System.out.println("2 to print list.");
        System.out.println("3 to mark");
        System.out.println("4 to exit");
        choice = input.nextInt();
        int count = 0;

        if (choice == 1) {
                for(int i = 0; i < 2; ++i){
                    input.nextLine();
                    listTodo.add(input.nextLine());
                    break;
            }
        }
        if (choice == 2) {
            for (int index = 0;index < listTodo.size(); index++) {
                String value = listTodo.get(index);
                System.out.println(index + ". " + value);
            }
        }
        if (choice == 3) {
           for (int index = 0;index < listTodo.size(); index++) {
                String value = listTodo.get(index);
                System.out.println(index + ". " + value);
                if (index == (listTodo.size()-1)) {
                    Scanner inputNumber = new Scanner(System.in);
                    int num = inputNumber.nextInt();
                    listTodo.remove(num);
                    }
                }
            }
        }
    }
}
