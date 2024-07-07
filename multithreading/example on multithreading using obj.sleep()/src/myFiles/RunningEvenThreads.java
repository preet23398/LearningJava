package myFiles;

public class RunningEvenThreads extends Thread {
    public void run() {
        for (int i=0; i<=10; i=i+2) {
            try {
                System.out.println("Even: " + i);
                Thread.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
