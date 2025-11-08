public class Task implements Comparable<Task> {
    private String taskName;
    private String taskDescription;
    private Priority taskPriority;

    public Task(String taskName, String taskDescription, Priority taskPriority) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public String toString() {
        return "Task{" + "taskName='" + taskName + '\'' + ", taskDescription='" + taskDescription + '\'' + ", taskPriority=" + taskPriority + '}';
    }


    @Override
    public int compareTo(Task t) {
        return this.taskPriority.compareTo(t.taskPriority);
    }
}
