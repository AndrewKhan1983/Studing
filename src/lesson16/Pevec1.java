package lesson16;

public class Pevec1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int counter = 0;
        while (!needStop) {
            counter++;
            if (counter > 3) {
                needStop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("ла---------------- " + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
