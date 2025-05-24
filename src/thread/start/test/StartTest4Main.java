package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        new Thread(new Printer("A", 1000), "Thread-A").start();
        new Thread(new Printer("B", 500), "Thread-B").start();

    }

    static class Printer implements Runnable {

        private String content;
        private int sleepMs;

        public Printer(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
