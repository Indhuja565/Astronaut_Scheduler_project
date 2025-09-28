
// Observer Pattern Example - Task Conflict Notification
import java.util.*;

interface Observer {
    void update(String message);
}

class TaskConflictObserver implements Observer {
    private String name;
    public TaskConflictObserver(String name) { this.name = name; }
    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

class TaskManager {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer obs) { observers.add(obs); }
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
    public void addTask(String task, boolean conflict) {
        if (conflict) {
            notifyObservers("Conflict detected for task: " + task);
        } else {
            System.out.println("Task added: " + task);
        }
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addObserver(new TaskConflictObserver("Astronaut1"));
        manager.addObserver(new TaskConflictObserver("Astronaut2"));

        manager.addTask("Morning Exercise", false);
        manager.addTask("Meeting with Control", true);
    }
}
