
// Factory Pattern Example - Task Factory
class Task {
    String desc;
    public Task(String desc) { this.desc = desc; }
    public void showTask() { System.out.println("Task: " + desc); }
}

class TaskFactory {
    public Task createTask(String desc) {
        return new Task(desc);
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        Task t1 = factory.createTask("Daily Exercise");
        Task t2 = factory.createTask("Research Work");
        t1.showTask();
        t2.showTask();
    }
}
