import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskFactory factory = new TaskFactory();
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConsoleObserver("AstronautScheduler"));

        while (true) {
            System.out.println("\n--- Astronaut Daily Schedule Organizer ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Start Time (HH:MM): ");
                        String start = sc.nextLine();
                        System.out.print("End Time (HH:MM): ");
                        String end = sc.nextLine();
                        System.out.print("Priority (High/Medium/Low): ");
                        String priority = sc.nextLine();
                        Task t = factory.createTask(desc, start, end, priority);
                        manager.addTask(t);
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Task Description to Remove: ");
                    String desc = sc.nextLine();
                    manager.removeTask(desc);
                    break;
                case 3:
                    manager.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
