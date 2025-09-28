import java.time.LocalTime;

public class TaskFactory {
    public Task createTask(String description, String start, String end, String priority) {
        LocalTime startTime = LocalTime.parse(start);
        LocalTime endTime = LocalTime.parse(end);
        return new Task(description, startTime, endTime, priority);
    }
}
