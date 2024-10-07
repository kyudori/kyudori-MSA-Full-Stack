package mobile;

abstract class Mobile{
	private String mobileName;
	private int batterySize;
	private String osType;
	
	Mobile(){}
	
	Mobile(String mobileName, int batterySize, String osType){
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	abstract void operate(int time);
	abstract void charge(int time);

    public String getMobileName() {
        return mobileName;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public String getOsType() {
        return osType;
    }

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
}
