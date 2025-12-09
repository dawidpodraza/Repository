import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Actions<T extends  Task> {
    public List<T> taskActions = new ArrayList<>();

    public void add (T task){
            taskActions.add(task);
            taskActions.sort(Comparator.comparingInt(Task::getValue));

    }
}
