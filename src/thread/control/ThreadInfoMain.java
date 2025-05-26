package thread.control;

import thread.start.HelloThread;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);

        //ID는 중복 허용 X, 이름은 중복이 허용된다.
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());

        //기본 우선순위는 5이다. 우선순위가 높을수록 더 많이 실행되는 것이다. (항상 그런것은 아님)
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());

        //mainThread.getState() = RUNNABLE => 실행될 수 있는 상태임
        log("mainThread.getState() = " + mainThread.getState());



        // myThread 쓰레드
        Thread myThread = new Thread(new HelloThread(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());

        //myThread.getState() = NEW => 생성만하고 실행은 안한 상태
        log("myThread.getState() = " + myThread.getState());
    }
}
