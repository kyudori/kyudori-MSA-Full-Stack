package day13;

class TV {
    private String model;
    private int size;
    private int channel;

    public TV() {}

    public TV(String model, int size, int channel) {
        this.model = model;
        this.size = size;
        this.channel = channel;
    }

    public void channelUp() {
        channel++;
        if (channel > 10) {
            channel = 1;
        }
    }
    public void channelDown() {
        channel--;
        if (channel < 1) {
            channel = 10;
        }
    }

	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
	public int getChannel() {
		return channel;
	}
}
