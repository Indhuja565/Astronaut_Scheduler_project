import java.util.*;
import java.util.stream.Collectors;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) instance = new ScheduleManager();
        return instance;
    }

    public void addObserver(Observer obs) { observers.add(obs); }
    private void notifyObservers(String msg) {
        for (Observer o : observers) o.notify(msg);
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (!(task.getEndTime().isBefore(t.getStartTime()) ||
                  task.getStartTime().isAfter(t.getEndTime()))) {
                notifyObservers("Error: Task conflicts with existing task "" + t.getDescription() + """);
                return false;
            }
        }
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        notifyObservers("Task added successfully: " + task.getDescription());
        return true;
    }

    public boolean removeTask(String desc) {
        Optional<Task> taskOpt = tasks.stream().filter(t -> t.getDescription().equals(desc)).findFirst();
        if (taskOpt.isPresent()) {
            tasks.remove(taskOpt.get());
            notifyObservers("Task removed successfully: " + desc);
            return true;
        } else {
            notifyObservers("Error: Task not found.");
            return false;
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.forEach(System.out::println);
    }
}
