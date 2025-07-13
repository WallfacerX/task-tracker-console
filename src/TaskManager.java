import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String dueDate) {
        tasks.add(new Task(title, dueDate));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
