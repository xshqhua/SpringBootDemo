package huawei.thread;

public class ProductConsumerDemo {

    public static void main(String[] args) throws InterruptedException
    {
        Basket basket=new Basket();
        Productor productor=new Productor(basket);
        Consumer consumer=new Consumer(basket);
        productor.start();
        consumer.start();

    }
}
