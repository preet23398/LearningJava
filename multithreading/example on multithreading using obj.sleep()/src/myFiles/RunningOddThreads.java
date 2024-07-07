package myFiles;

public class RunningOddThreads extends Thread {
    public void run() {
        for (int i=1; i<=9; i=i+2) {
            try {
                System.out.println("Odd: " + i);
                Thread.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
