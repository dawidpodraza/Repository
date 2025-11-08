import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    Queue<Task> tasksQueue = new PriorityQueue<>();

    private void pollNextTaskByPriority() {
        System.out.println(tasksQueue.poll());
    }

    public void askWhatToDo() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("1- dodaj zadanie\n2- pobierz kolejne zadanie o najwyższym priorytecie\n3- wyjdź z aplikacji");
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addNewTaskToQueue();
                case "2" -> pollNextTaskByPriority();
                case "3" -> System.exit(0);
            }
        } while (true);
    }

    private void addNewTaskToQueue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe zadania: ");
        String taskName = scanner.nextLine();
        System.out.println("Podaj opis zadania: ");
        String taskDescription = scanner.nextLine();
        System.out.println("Wybierz priorytet zadania 1-high 2-moderate 3-low :");
        String taskPriorityQuestion = scanner.nextLine();
        Priority priority = switch (taskPriorityQuestion) {
            case "1" -> Priority.HIGH;
            case "2" -> Priority.MODERATE;
            case "3" -> Priority.LOW;
            case null, default -> Priority.LOW;
        };
        tasksQueue.add(new Task(taskName, taskDescription, priority));

    }


}
