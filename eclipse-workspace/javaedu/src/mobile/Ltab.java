package mobile;

public class Ltab extends Mobile {
    public Ltab() {}

    public Ltab(String mobileName, int batterySize, String osType) {
        super(mobileName, batterySize, osType);
    }

    public void operate(int time) {
        super.setBatterySize(getBatterySize() - 10 * time);
    }

    public void charge(int time) {
        super.setBatterySize(getBatterySize() + 10 * time);
    }
}
