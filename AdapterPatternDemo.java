
// Adapter Pattern Example - Legacy System Integration
interface NewSystem {
    void runCommand();
}

class LegacySystem {
    public void oldRun() {
        System.out.println("Running legacy system task...");
    }
}

class Adapter implements NewSystem {
    private LegacySystem legacy;
    public Adapter(LegacySystem legacy) { this.legacy = legacy; }
    @Override
    public void runCommand() { legacy.oldRun(); }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacySystem legacy = new LegacySystem();
        NewSystem adapter = new Adapter(legacy);
        adapter.runCommand();
    }
}
