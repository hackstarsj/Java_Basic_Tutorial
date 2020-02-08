public class MultiThreadClassExample extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<10;i++) {
            System.out.println("Thread is Running : "+i+" ID "+getId());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
