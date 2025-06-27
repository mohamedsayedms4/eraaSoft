//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Runnable runnable = new ThreadExample();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}