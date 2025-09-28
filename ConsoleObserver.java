public class ConsoleObserver implements Observer {
    private String name;
    public ConsoleObserver(String name) { this.name = name; }
    @Override
    public void notify(String message) {
        System.out.println("[" + name + "] " + message);
    }
}
