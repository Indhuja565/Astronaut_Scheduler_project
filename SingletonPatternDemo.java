
// Singleton Pattern Example - ScheduleManager
class ScheduleManager {
    private static ScheduleManager instance;
    private ScheduleManager() {}
    public static synchronized ScheduleManager getInstance() {
        if (instance == null) instance = new ScheduleManager();
        return instance;
    }
    public void showMessage() {
        System.out.println("Single instance of ScheduleManager is working.");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        ScheduleManager sm1 = ScheduleManager.getInstance();
        ScheduleManager sm2 = ScheduleManager.getInstance();
        sm1.showMessage();
        System.out.println("Same instance? " + (sm1 == sm2));
    }
}
