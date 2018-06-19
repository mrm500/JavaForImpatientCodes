package JavaForImpatientCodes.chapter03;

public class exercise08 {
    public static void main(String[] args){
        Runnable worldGreeter = new Greeter(1,"World");
        Runnable masterGreeter = new Greeter(2, "Master.");
        Thread worldThread = new Thread(worldGreeter);
        Thread masterThread = new Thread(masterGreeter);
        masterThread.start();
        worldThread.start();
    }
}

class Greeter implements Runnable{
    private int n;
    private String target;
    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }
    @Override
    public void run() {
        for(int i = 0; i < n; i++){
            System.out.println("Hello, " + target);
        }
    }
}