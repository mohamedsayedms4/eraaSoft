public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Running Thread is :" + Thread.currentThread().getName());
    }
}
