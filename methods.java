class priority11 extends Thread{

    @Override
    public void run() {
        int i=0;
        while (i<3) {
            System.out.println("*SAD* MINIMUN P");
        }
    }
}
class priority12 extends Thread{
    public void run(){
        int i=0;
        while(i<3)
        {
            System.out.println("*HAPPY* NORMAL P");
        }
    }
}
class priority13 extends Thread{
    public void run(){
        int i=0;
        while(i<3)
        {
            System.out.println("*EXCITED* MAXIMUM P");
        }
    }
}