import java.util.Arrays;

public class Main {
    static void main(String[] args) {

    Actions<Task> action1 = new Actions<>();
    action1.add(new Task<>("Akcja 3",3));
    action1.add(new Task<>("Akcja 2",2));
    action1.add(new Task<>("Akcja 1",1));


    System.out.println(action1.taskActions.toString());

    }
}
