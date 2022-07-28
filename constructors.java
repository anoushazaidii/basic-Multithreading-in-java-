/*
constructors in thread
 */

 class Mythr  extends Thread{
    public Mythr(String name)
    {
        super(name);
    }
    @Override
    public void run() {
     int i=4;
        while (i > 4) {
            System.out.println("I am a thread");
        }
    }
}
public class constructors{
    public static void main(String[] args) {
     Mythr t1 = new Mythr("Anousha");

        t1.start();
        System.out.println("the name of my thread is"+ t1.getName());
        System.out.println("the id of my thread id"+t1.getId());

    }
}
