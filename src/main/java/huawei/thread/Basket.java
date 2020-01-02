package huawei.thread;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Apple> basket=new LinkedList<Apple>();
    public synchronized void pushApple()
    {
        for(int i=1;i<=20;i++)
        {
            Apple apple=new Apple(i);
            push(apple);
        }
    }
    public synchronized void popApple()
    {
        for(int i=1;i<=20;i++)
        {
            pop();
        }
    }
    public void push(Apple apple) {
        if(basket.size()==5)
        {
            try{
                wait();
            }catch(InterruptedException e) {
			    System.out.println("放入苹果异常"+Thread.currentThread().isInterrupted());
            }
        }
        try{
            Thread.sleep(500);
        }catch(InterruptedException e) {
            System.out.println("放入苹果异常"+Thread.currentThread().isInterrupted());
        }
        basket.addFirst(apple);
        System.out.println("存放"+apple.toString());
        notifyAll();

    }
    private void pop()
    {
        if(basket.size()==0)
        {
            try{
                wait();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(500);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        Apple apple=basket.removeFirst();
        System.out.println("吃掉"+apple.toString());
        notifyAll();
    }

}
