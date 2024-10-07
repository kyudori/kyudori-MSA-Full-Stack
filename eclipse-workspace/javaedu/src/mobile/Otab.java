package mobile;

public class Otab extends Mobile {
    public Otab() {}

    public Otab(String mobileName, int batterySize, String osType) {
        super(mobileName, batterySize, osType);
    }

    public void operate(int time) {
        super.setBatterySize(getBatterySize() - 12 * time);
    }

    public void charge(int time) {
        super.setBatterySize(getBatterySize() + 8 * time);
    }
}
