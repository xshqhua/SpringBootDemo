package huawei.thread;

public class Consumer extends Thread {
    private Basket basket = null;

    public Consumer(Basket basket) {
        super();
        this.basket = basket;
    }

    public void run() {
        basket.popApple();//从篮子里面取苹果
    }

}
