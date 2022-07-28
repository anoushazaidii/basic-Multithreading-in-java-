//using threads by extending thread class
class thread1 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("HEY I AM ANOUSHA ZAIDI");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        while(true)
        {
            System.out.println("HEY I AM ANOUSHA'S DOPPLEGANGER");
        }
    }
}