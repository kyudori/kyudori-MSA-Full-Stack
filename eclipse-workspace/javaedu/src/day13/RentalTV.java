package day13;

class RentalTV extends TV implements Rentable {
    private int price;

    public RentalTV() { }

    public RentalTV(String model, int size, int channel, int price) {
        super(model, size, channel);
        this.price = price;
    }

    public void play() {
        System.out.println("대여 TV 채널 " + super.getChannel() + "번의 프로를 플레이 합니다.");
    }

    public void rent() {
        System.out.printf(super.getModel() + " 모델의 상품을 대여합니다. " + "%,d" + "원을 지불해 주세요.\n", price);
    }

    public String toString() {
        return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", super.getModel(), price, super.getSize());
    }
}

