package huawei.thread;

public class Productor extends Thread {

    private Basket basket=null;
    public Productor(Basket basket)
    {
        super();
        this.basket=basket;
    }
    public void run()
    {
        basket.pushApple();//向篮子里面放苹果
    }

}
