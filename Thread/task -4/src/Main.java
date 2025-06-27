//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Task task1 = new Task("thread-1",1000);
        Task task2 = new Task("thread-2",1000);

        task1.start();
        task2.start();

        try {
            task1.join();
            task2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("main end");

    }
}