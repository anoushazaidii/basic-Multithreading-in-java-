//creating thread by runnable interface

class Threadd1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am thread");
    }
}
class Threadd2 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am thread 2");
    }
}