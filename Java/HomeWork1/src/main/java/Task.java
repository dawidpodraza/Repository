import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task <T> implements Comparable<Task> {
    private String taskName;
    private int value;

    public Task(String taskName, int value) {
        this.taskName = taskName;
        this.value = value;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName=" + taskName +
                ", value=" + value +
                '}';
    }


    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.value, other.value);
    }
}
