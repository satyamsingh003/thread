public class Scooby extends Thread{
    public void run(){
        System.out.println("Scooby");
    }
}
 class Shaggy extends Thread{


    public void run(){
        System.out.println("Shaggy");

    }
}
class test{
    public static void main(String[] args) {
        Scooby t1=new Scooby();
        Shaggy t2=new Shaggy();
        t1.start();
        t2.start();
    }
}